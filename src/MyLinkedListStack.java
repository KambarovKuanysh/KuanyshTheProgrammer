import java.util.EmptyStackException;

public class MyLinkedListStack<E> {
    private MyLinkedList<E> stack;

    /**
     * Constructs a new MyLinkedListStack object with an empty linked list.
     */
    public MyLinkedListStack() {
        stack = new MyLinkedList<>();
    }

    /**
     * Pushes the specified element onto the top of this stack.
     *
     * @param element the element to push onto this stack
     */
    public void push(E element) {
        stack.addFirst(element);
    }

    /**
     * Tests if this stack is empty.
     *
     * @return true if and only if this stack contains no items; false otherwise
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Removes the element at the top of this stack and returns that element.
     *
     * @return the element at the top of this stack
     * @throws EmptyStackException if this stack is empty
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    /**
     * Looks at the element at the top of this stack without removing it from the stack.
     *
     * @return the element at the top of this stack
     * @throws EmptyStackException if this stack is empty
     */
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements in this stack
     */
    public int size() {
        return stack.size();
    }
}
