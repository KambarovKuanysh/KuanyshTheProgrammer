import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void showcaseArrayList(){
        Scanner sc = new Scanner(System.in);
        MyArrayList myArrayListInt = new MyArrayList<Integer>();
        System.out.println("Велком! Начнем с MyArrayList<Integer>:");
        System.out.println("> Size: " + myArrayListInt.size());
        System.out.println("Давайте добавим элементов типа <Integer>:");
        System.out.println("Введите -1 чтобы остановить ввод");
        int nextInt;
        while(true) {
            nextInt = sc.nextInt();
            if (nextInt == -1) break;
            myArrayListInt.add(nextInt);
        }
        System.out.println("> Your array: " + myArrayListInt);
        System.out.println("> Size: " + myArrayListInt.size());

        System.out.println("Давайте добавим элемент на индекс. Введите элемент и индекс через пробел:");
        nextInt = sc.nextInt();
        int nextIndex = sc.nextInt();
        myArrayListInt.add(nextInt, nextIndex);

        System.out.println("Давайте удалим элемент с вашим индексом. Введите его:");
        nextIndex = sc.nextInt();
        myArrayListInt.remove(nextIndex);
        System.out.println("> Your array: " + myArrayListInt);

        System.out.println("А теперь удалим элемент не зная его индекса. Введите число для удаления:");
        nextInt = sc.nextInt();
        myArrayListInt.remove((Object) nextInt);
        System.out.println("> Your array: " + myArrayListInt);

        System.out.println("А теперь давайте узнаем, находится ли введенный вами элемент в массиве?");
        nextInt = sc.nextInt();
        System.out.println(myArrayListInt.contains(nextInt));

        System.out.println("А теперь давайте узнаем первый индекс вхождения введенного вами элемент в массиве");
        nextInt = sc.nextInt();
        System.out.println(myArrayListInt.indexOf(nextInt));

        System.out.println("А теперь давайте узнаем последний индекс вхождения введенного вами элемент в массиве");
        nextInt = sc.nextInt();
        System.out.println(myArrayListInt.lastIndexOf(nextInt));
    }


    public static void main(String[] args) {
        MyArrayList<Object> list = new MyArrayList<>();
        System.out.println("> Adding variables");
        list.add(16);
        list.add("A");
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
        System.out.println(list.indexOf("A"));
        System.out.println("> Checking clear method");
        list.clear();
        System.out.println(list.size());
    }
}