public class MyLinkedList<E> implements MyList<E>{
    private class Node {
        private E element;
        private Node next;
        private Node previous;
        public Node(E element, Node next, Node previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    @Override
    public void add(E item) {
        Node newNode = new Node(item, null, tail);
        if (size == 0) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }
    @Override
    public void add(Object item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add((E) item);
            return;
        }
        Node newNode = new Node((E) item, null, null);
        if (index == 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        else {
            Node current;
            if (index < size / 2) {
                current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
            } else {
                current = tail;
                for (int i = size - 1; i > index; i--) {
                    current = current.previous;
                }
            }
            newNode.next = current;
            newNode.previous = current.previous;
            current.previous.next = newNode;
            current.previous = newNode;
        }
        size++;
    }
    @Override
    public boolean remove(Object item) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current;
        if (index == 0) {
            current = head;
            head = current.next;
            if (head != null) {
                head.previous = null;
            }
        }
        else if (index == size - 1) {
            current = tail;
            tail = current.previous;
            if (tail != null) {
                tail.next = null;
            }
        }
        else {
            if (index < size / 2) {
                current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
            }
            else {
                current = tail;
                for (int i = size - 1; i > index; i--) {
                    current = current.previous;
                }
            }
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
    }
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        }
        else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }
        }
        return current.element;
    }
    @Override
    public int indexOf(Object o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.element.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    @Override
    public int lastIndexOf(Object o) {
        Node current = tail;
        int index = size - 1;
        while (current != null) {
            if (current.element.equals(o)) {
                return index;
            }
            current = current.previous;
            index--;
        }
        return -1;
    }
    @Override
    public void sort() {

    }
}