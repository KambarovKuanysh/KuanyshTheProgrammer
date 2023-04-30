import java.util.NoSuchElementException;

public class MyArrayListQueue <E>{
    private MyArrayList<E> queue;

    /**
     * Constructor for MyArrayListQueue that initializes an empty ArrayList
     */
    public MyArrayListQueue() {
        queue = new MyArrayList<E>();
    }

    /**
     * Method for adding an element to the back of the queue using the add method of MyArrayList
     * @param element the element to be added to the back of the queue
     */
    public void enqueue(E element) {
        queue.add(element);
    }

    /**
     * Method for removing and returning the front element of the queue using the removeFirst method of MyArrayList
     * @return the front element of the queue that was removed
     * @throws NoSuchElementException if the queue is empty
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }

    /**
     * Method for returning the front element of the queue without removing it using the get method of MyArrayList
     * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    /**
     * Method for checking if the queue is empty using the isEmpty method of MyArrayList
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Method for getting the number of elements in the queue using the size method of MyArrayList
     * @return the number of elements in the queue
     */
    public int size() {
        return queue.size();
    }

}
