import  java.util.*;
public class CWH_93_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1  = new ArrayDeque<Integer>();

        ArrayDeque<Integer> l2  = new ArrayDeque<>();
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l1.add(150);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.addFirst(54);
//        l1.remove(30);
//        l1.removeFirst();
        System.out.println(l1.pollLast());
        //System.out.println(l1.element());
//        System.out.println(l1.getLast());
//        System.out.println(l1.getFirst());
        System.out.println(l1);
//        l1.remove(2);
//        System.out.println(l1);
    }
}
