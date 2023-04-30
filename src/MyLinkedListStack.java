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
}