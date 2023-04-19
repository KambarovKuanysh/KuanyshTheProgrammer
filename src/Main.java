import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Object> list = new MyArrayList<>();
        System.out.println("> Adding variables");
        list.add(16);
        list.add("D");
        list.add(false);
        list.add("C");
        list.add(1);
        list.add(true);
        list.add(42);
        System.out.println("> Showing size of an array");
        System.out.println(list.size());
        System.out.println("> Check 1 for containment");
        System.out.println(list.contains(1));
        System.out.println(list.contains("a"));
        System.out.println("> Checking for add in index.");
        list.add(100, 4);
        System.out.println(list.get(4));
        System.out.println("> Checking for remove by index");
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println("> Remove by object");
        System.out.println(list.remove(false));
        System.out.println(list.get(0));
        System.out.println("> Checking for index of object A");
        System.out.println(list.lastIndexOf("A"));
        System.out.println("> Checking clear method");
        list.clear();
        System.out.println(list.size());
    }
}