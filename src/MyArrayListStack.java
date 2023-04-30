import java.util.EmptyStackException;
/**
 A stack implementation using MyArrayList as the underlying data structure.
 This implementation follows the LIFO (Last-In-First-Out) principle.
 @param <E> The type of elements stored in the stack.
 */
public class MyArrayListStack <E>{
    public MyArrayList<E> stack;

    /**
     * Constructor for MyArrayListStack that initializes an empty ArrayList
     */
    public MyArrayListStack() {
        stack = new MyArrayList<>();
    }
    /**
     * Pushes an element onto the top of the stack.
     *
     * @param element The element to be pushed onto the stack.
     */
    public void push(E element) {
        stack.add(element, 0);
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return The element at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return The element at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(0);
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return The number of elements in the stack.
     */
    public int size() {
        return stack.size();
    }

}
