public class MyLinkedList<E> implements MyList<E>{
    private class Node {
        private E element;
        private Node next;
        private Node previous;
        // Constructor for a new node
        public Node(E element, Node next, Node previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    // Constructor for an empty linked list
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void addFirst(E element){
        Node rest = head.next;
        Node newHead = new Node(element, null, null);
        head = newHead;
        newHead.next = rest;
    }

    public void show(){
        Node currentNode = head;
        while(currentNode!=null){
            System.out.println(currentNode.element);
            currentNode = currentNode.next;
        }
    }
    public void reverse(){
        Node previousNode = null;
        Node currentNode = head;
        Node nextNode = null;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;
    }
    public void addAllElementsByIndex(E[] set, int index){
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            Node endOfNode = currentNode.next;
            for (int i = 0; i < set.length; i++) {
                Node newNode = new Node(set[i], null, null);
                currentNode.next = newNode;
                currentNode = currentNode.next;
            }
            currentNode.next = endOfNode;
    }
    // Returns the length of linked list
    @Override
    public int size() {
        return size;
    }
    // Checks if the linked list contains a given object
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
    // Adds a new element to the end of the linked list
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
    // Adds a new element to the linked list at a specified index, throwing an exception if the index is out of bounds
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
    // Checks if an element has been deleted
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
    // Removes an element from the linked list at a specified index, throwing an exception if the index is out of bounds
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
    //clear() - clears linked list
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    // Returns the element at the specified index, throwing an exception if the index is out of bounds
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
    // Returns index of the element which first matched the incoming element
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
    // Returns index of the element which last matched the incoming element
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
        Node current = head;
        Node index;
        E temp;
        while (current != null){
            index = current.next;
            while (index != null){
                if (((Comparable<E>)current.element).compareTo(index.element) > 0){
                    temp = current.element;
                    current.element = index.element;
                    index.element = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
    boolean isEmpty(){
        return head == null;
    }
    E removeFirst(){
        Node removed = head;
        head = head.next;
        return removed.element;
    }
}