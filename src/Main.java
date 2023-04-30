import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> ArrayList = new MyArrayList<>();
        MyLinkedList<Integer> LinkedList = new MyLinkedList();
        LinkedList.add(1);
        LinkedList.add(2);
        LinkedList.add(3);
        Integer[] data = new Integer[]{4, 5, 6};
        ArrayList.add(1);
        ArrayList.add(2);
        ArrayList.add(3);
        ArrayList.addAllElementsByIndex(data, 0);
        LinkedList.addAllElementsByIndex(data, 2);
        System.out.println("ArrayList");
        ArrayList.show();
        System.out.println("LinkedList");
        System.out.println("============================");

        LinkedList.show();
        System.out.println("============================");
        //Test
        MyArrayListStack<Integer> stack = new MyArrayListStack<>();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.stack.show();
        System.out.println(stack.isEmpty());
    }
}