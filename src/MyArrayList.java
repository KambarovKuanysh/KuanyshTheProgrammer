public class MyArrayList <T> implements MyList{
    private T[] arr;
    private int size;

    MyArrayList(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    @Override
    public boolean contains(Object o){
        for(T element : arr) {
            if (o.equals(element)) return true;
        }
        return false;
    }
    @Override
    public boolean remove(Object item) {
        int index = indexOf(item);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals((T) o)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) if (arr[i].equals((T) o) && i > index) index = i;
        return index;
    }
    @Override
    public void sort() {
        for(int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if ((int) arr[j] < (int) arr[i]) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    @Override
    public void add(Object item){
        if(size == arr.length){
            increaseBounds();
        }
        arr[size++] =(T) item;
    }

    @Override
    public void add(Object item, int index){
        checkIndex(index);
        increaseBounds();
        for(int i = size; i>index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = (T) item;
        size++;
    }
    public void increaseBounds(){
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }

    @Override
    public int size() {
        return size;
    }

    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public void clear(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

}
