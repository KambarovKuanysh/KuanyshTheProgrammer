public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> set = new MyLinkedList<>();
        set.add(5);
        set.add(6);
        set.add(4);
        set.sort();
        for(int i = 0; i < set.size(); i++){
            System.out.println(set.get(i));
        }
    }
}