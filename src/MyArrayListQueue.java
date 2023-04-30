public class MyArrayListQueue <E>{
    private MyArrayList<E> queue;

    public MyArrayListQueue() {
        queue = new MyArrayList<E>();
    }
    public void enqueue(E element) {
        queue.add(element);
    }
}
