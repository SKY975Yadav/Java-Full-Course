import java.util.ArrayList;
import java.util.LinkedList;

public class CWH_92_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1  = new LinkedList<>();
        LinkedList<Integer> l2  = new LinkedList<>();
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println(l1.getLast());
        System.out.println(l1.getFirst());
        System.out.println(l1);
        l1.add(2,552);
        System.out.println(l1);
        Integer d = 30;
        l1.remove(d);
        System.out.println(l1);
    }
}
