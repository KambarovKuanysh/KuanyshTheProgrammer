import java.util.EmptyStackException;

public class MyArrayListStack <E>{
    public MyArrayList<E> stack;
    public MyArrayListStack() {
        stack = new MyArrayList<>();
    }
    public void push(E element) {
        stack.add(element, 0);
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
}
