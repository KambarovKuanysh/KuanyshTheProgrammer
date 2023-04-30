public class MyLinkedListQueue<E>{
    private MyLinkedList<E> list;

    public MyLinkedListQueue(){
        list = new MyLinkedList<>();
    }
    public void enqueue(E element) {
        list.addLast(element);
    }
}
