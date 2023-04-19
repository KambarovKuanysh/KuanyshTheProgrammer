import java.util.Arrays;

public class MyArrayList <T> implements MyList{
    private T[] arr;
    private int size;

    /**
     * @function constructor
     * @noparam
     * @return void
     **/
    MyArrayList(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    /**
     * @function contains checks if an object in an array
     * @param o object that will be searched
     * @return boolean
     * **/
    @Override
    public boolean contains(Object o){
        for(T element : arr) {
            if (o.equals(element)) return true;
        }
        return false;
    }
    /**
     * @function remove deletes object from array
     * @param item deleted object
     * @return boolean
     * **/
    @Override
    public boolean remove(Object item) {
        int index = indexOf(item);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }
    /**
     * @function remove deletes object from array
     * @param index index of deleted object
     * @return Object
     * **/
    @Override
    public void remove(int index) {
        checkIndex(index);
        for(int i= index + 1; i<=size; i++){
            arr[i-1] = arr[i];
        }
        this.size--;
    }
    /**
     * @function indexOf returns index of first object appearing
     * @param o object for search
     * @return int
     * **/
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals((T) o)) {
                return i;
            }
        }
        return -1;
    }
    /**
     * @function lastIndexOf returns index of last object appearing
     * @param o object for search
     * @return int
     * **/
    @Override
    public int lastIndexOf(Object o) {
        try {
            int index = -1;
            for (int i = 0; i < arr.length; i++) if (arr[i].equals((T) o) && i > index) index = i;
            return index;
        }
        catch (Exception e){
            return -1;
        }
    }
    /**
     * @function sort sorts by bubble sort+
     * @noparam
     * @return void
     * **/
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
    /**
     * @function add adds object into array
     * @param item object that will added
     * @return void
     * **/
    @Override
    public void add(Object item){
        if(size == arr.length){
            increaseBounds();
        }
        arr[size++] =(T) item;
    }

    /**
     * @function add true if Object in array
     * @param item object thaw will be added
     * @param index index which determines location of new object
     * @return void
     * **/
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
    /**
     * @function increaseBounds increases bounds if needed
     * @noparams
     * @return void
     * **/
    public void increaseBounds(){
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
    /**
     * @function get returns object with got index
     * @param index object index
     * @return Object
     * **/
    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }

    /**
     * @function size gives size of an array
     * @noparams
     * @return int
     * **/
    @Override
    public int size() {
        return size;
    }
    /**
     * @function checkIndex checks index for validity
     * @param index index that will be checked
     * @return void
     * **/

    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
    /**
     * @function clear clears array
     * @noparam
     * @return void
     * **/
    @Override
    public void clear(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    @Override
    public String toString() {
        return Arrays.toString(arr);

    }

}
