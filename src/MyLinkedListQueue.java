import java.util.NoSuchElementException;
/**

 MyLinkedListQueue is a class that implements the Queue interface using a linked list.
 It has methods to enqueue, dequeue, peek, check if it is empty, and get the size of the queue.
 @param <E> the type of elements in the queue
 */
public class MyLinkedListQueue<E>{
    private MyLinkedList<E> list;

    /**
     * Constructs an empty MyLinkedListQueue
     */
    public MyLinkedListQueue(){
        list = new MyLinkedList<>();
    }

    /**
     * Adds an element to the back of the queue
     * @param element the element to be added
     */
    public void enqueue(E element) {
        list.addLast(element);
    }

    /**
     * Removes and returns the front element of the queue
     * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

    /**
     * Returns the front element of the queue without removing it
     * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.getFirst();
    }

    /**
     * Checks if the queue is empty
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Gets the number of elements in the queue
     * @return the number of elements in the queue
     */
    public int size() {
        return list.size();
    }

}
