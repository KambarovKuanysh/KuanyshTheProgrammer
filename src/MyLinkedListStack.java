import java.util.EmptyStackException;

public class MyLinkedListStack <E>{
    private MyLinkedList<E> stack;
    public MyLinkedListStack() {
        stack = new MyLinkedList<>();
    }
    public void push(E element) {
        stack.addFirst(element);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }
}
