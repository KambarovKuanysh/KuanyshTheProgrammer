public class MyArrayList <T> implements MyList{
    private T[] arr;
    private int size;

    MyArrayList(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
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
    @Override
    public T remove(int index){
        checkIndex(index);
        T removed = arr[index];
        for(int i= index + 1; i<size; i++){
            arr[i-1] = arr[i];

        }
        size--;
        return removed;
    }
}
