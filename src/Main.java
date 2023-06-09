import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> ArrayList = new MyArrayList<>();       //Assignment 2 defense
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
        System.out.println("============================");
        System.out.println("LinkedList");

        LinkedList.show();

        System.out.println("============================");

        Main.testLLS(); //MyLinkedListStack test
        Main.testALS(); //MyArrayListStack test
        Main.testLLQ(); //MyLinkedListQueue
        Main.testALQ(); //MyArrayListQueue
    }
    static void testLLS(){
        MyLinkedListStack<Integer> LLS = new MyLinkedListStack<>();
        String hardDivider = "========================================";
        String divider = "----------------------------------------";
        System.out.println("> MyLinkedListStack");
        System.out.println(divider);

        System.out.println("> Pushed values: 1, 2, 3");
        LLS.push(1);
        LLS.push(2);
        LLS.push(3);

        System.out.println("> Pop:");
        System.out.println(LLS.pop());
        System.out.println(divider);

        System.out.println("> Peek:");
        System.out.println(LLS.peek());
        System.out.println(divider);

        System.out.println("> Size:");
        System.out.println(LLS.size());
        System.out.println(divider);

        System.out.println("> isEmpty:");
        System.out.println(LLS.isEmpty());
        System.out.println(divider);

        LLS.pop();
        LLS.pop();

        System.out.println("> After popping all elements:");
        System.out.println(LLS.isEmpty());

        System.out.println(hardDivider);
    }
    static void testALS(){
        String hardDivider = "========================================";
        String divider = "----------------------------------------";
        MyArrayListStack<Integer> ALS = new MyArrayListStack<>();
        System.out.println("> MyArrayListStack");
        System.out.println(divider);

        System.out.println("> Pushed values: 1, 2, 3");
        ALS.push(1);
        ALS.push(2);
        ALS.push(3);

        System.out.println("> Pop:");
        System.out.println(ALS.pop());
        System.out.println(divider);

        System.out.println("> Peek:");
        System.out.println(ALS.peek());
        System.out.println(divider);

        System.out.println("> Size:");
        System.out.println(ALS.size());
        System.out.println(divider);

        System.out.println("> isEmpty:");
        System.out.println(ALS.isEmpty());
        System.out.println(divider);

        ALS.pop();
        ALS.pop();

        System.out.println("> After popping all elements:");
        System.out.println(ALS.isEmpty());

        System.out.println(hardDivider);
    }
    static void testLLQ(){
        String hardDivider = "========================================";
        String divider = "----------------------------------------";
        MyLinkedListQueue<Integer> LLQ = new MyLinkedListQueue<>();
        System.out.println("> MyLinkedListQueue");
        System.out.println(divider);

        System.out.println("> Enqueued values: 1, 2, 3");
        LLQ.enqueue(1);
        LLQ.enqueue(2);
        LLQ.enqueue(3);

        System.out.println("> Dequeue:");
        System.out.println(LLQ.dequeue());
        System.out.println(divider);

        System.out.println("> Peek:");
        System.out.println(LLQ.peek());
        System.out.println(divider);

        System.out.println("> Size:");
        System.out.println(LLQ.size());
        System.out.println(divider);

        System.out.println("> isEmpty:");
        System.out.println(LLQ.isEmpty());
        System.out.println(divider);

        LLQ.dequeue();
        LLQ.dequeue();

        System.out.println("> After dequeue of all elements:");
        System.out.println(LLQ.isEmpty());

        System.out.println(hardDivider);
    }
    static void testALQ(){
        String hardDivider = "========================================";
        String divider = "----------------------------------------";
        MyArrayListQueue<Integer> ALQ = new MyArrayListQueue<>();
        System.out.println("> MyArrayListQueue");
        System.out.println(divider);

        System.out.println("> Enqueued values: 1, 2, 3");
        ALQ.enqueue(1);
        ALQ.enqueue(2);
        ALQ.enqueue(3);

        System.out.println("> Dequeue:");
        System.out.println(ALQ.dequeue());
        System.out.println(divider);

        System.out.println("> Peek:");
        System.out.println(ALQ.peek());
        System.out.println(divider);

        System.out.println("> Size:");
        System.out.println(ALQ.size());
        System.out.println(divider);

        System.out.println("> isEmpty:");
        System.out.println(ALQ.isEmpty());
        System.out.println(divider);

        ALQ.dequeue();
        ALQ.dequeue();

        System.out.println("> After dequeue of all elements:");
        System.out.println(ALQ.isEmpty());

        System.out.println(hardDivider);
    }
}