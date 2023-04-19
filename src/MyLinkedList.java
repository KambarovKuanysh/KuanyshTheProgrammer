public class MyLinkedList<E> implements MyList{
    private MyArrayList elements = new MyArrayList<E>();

    private class Node<E> {
        E val;
        Node previous;
        Node next;
        public Node(E v) {
            val = v;

        }
    }

    private Node<E> head;

    private Node<E> tail;
    private int size;

    MyLinkedList() {
        size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Object o) {
        Node<E> nextNode = this.head;
        while (!nextNode.equals(null)) {
            if (this.head.val.equals(o)) return true;
            nextNode = nextNode.next;
        } return false;
    }

    @Override
    public void add(Object item) {
        Node<E> node = new Node<>((E) item);
        if (size == 0) {
            this.head = node;
        } else {
            node.previous = this.tail;
            this.tail.next = node;
        }
        this.tail = node;
        size++;
    }

    @Override
    public void add(Object item, int index) {
        Node oldNode = findIndexedNode(index);
        Node node = new Node<E>((E) item);
        if (this.head.equals(oldNode)) {
            node.next = this.head;
            this.head.previous = node;
            this.head = node;
        } else if (this.tail.equals(oldNode)){
            node.next = this.tail;
            node.previous = this.tail.previous;
            this.tail.previous.next = node;
            this.tail.previous = node;
        } else {
            node.previous = oldNode.previous;
            node.next = oldNode;
            oldNode.previous.next = node;
            oldNode.previous = node;
        }
        size++;
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Node node = findIndexedNode(index);

        if (node.previous == null) {
            this.head = node.next;
            this.head.previous = null;
        }
        else if (node.next == null) {
            this.tail = node.previous;
            this.tail.next = null;
        }
        else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }

        this.size--;
        return node.val;
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        Node toSearch;
        toSearch = this.head;
        while (index != 0) {
            toSearch = toSearch.next;
            index--;
        }
        return (E) toSearch.val;
    }

    @Override
    public int indexOf(Object o) {
        int i = 0;
        Node<E> nextNode = this.head;
        while (!nextNode.equals(null)) {
            if (this.head.val.equals(o)) return i;
            nextNode = nextNode.next;
            i++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int i = size()-1;
        Node<E> node = this.tail;
        while (i >= 0) {
            if (node.equals(o)) return i;
            node = this.tail.previous;
            i--;
        }
        return -1;
    }

    @Override
    public void sort() {
       ///could not implement
    }

    private Node findIndexedNode(int index) {
        Node toSearch;
        toSearch = this.head;
        while (index != 0) {
            toSearch = toSearch.next;
            index--;
        }
        return toSearch;
    }
    private void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
}
