public class MyArrayListStack <E>{
    public MyArrayList<E> stack;
    public MyArrayListStack() {
        stack = new MyArrayList<>();
    }
    public void push(E element) {
        stack.add(element, 0);
    }
}
