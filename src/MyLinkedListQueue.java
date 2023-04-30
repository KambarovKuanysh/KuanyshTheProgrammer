import java.util.NoSuchElementException;

public class MyLinkedListQueue<E>{
    private MyLinkedList<E> list;

    public MyLinkedListQueue(){
        list = new MyLinkedList<>();
    }
    public void enqueue(E element) {
        list.addLast(element);
    }
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.getFirst();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
