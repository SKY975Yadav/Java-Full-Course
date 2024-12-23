import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CWH_91_arrayList {
    public static Object swap(ArrayList<Integer> al,int a,int b ) throws IndexOutOfBoundsException{
        ArrayList<Integer> temp = new ArrayList<>();
        try {
            temp.add(0, al.get(a));
            al.set(a, al.get(b));
            al.set(b, temp.get(0));
        }
        catch (Exception e){
            System.out.println(e);
        }
        return al;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1  = new ArrayList<>(150);
        ArrayList<Integer> l2  = new ArrayList<>(10);
        ArrayList<Integer> l3  = new ArrayList<>(3);
        ArrayList<Integer> l4  = new ArrayList<>(3);

        l3.add(10);
        l3.add(20);
        l3.add(30);
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        Integer s = 40;
        l1.set(1,7248);
        //l1.remove(s);
        System.out.println(l1);
//        System.out.println("Before Swap : ");
//        System.out.println(l1);
//        swap(l1,343,0);
//        System.out.println("After Swap : ");
//        System.out.println(l1);
////        l1.add(4,67);
//        System.out.println(l1.size());
//        l1.trimToSize();
//        System.out.println(l1.size());
//        System.out.println(l3.spliterator());
//        l3.spliterator();
        //l1.removeAll(l3);
//        Object[] ar = l1.toArray();
//        Integer [] arr = new Integer[5];
//        arr = l3.toArray(arr);
//        System.out.println(arr[0]);
//        Integer s = 10;
//        l1.retainAll(l3);
//        System.out.println(l1);
//        l3.toArray(T[] ar);
//        for (Object o : ar) {
//            System.out.println(o);
//        }
        //l1.toArray();
        //System.out.println(l1.subList(0,2));
        //l3.remove(s);
        //l3.removeIf((n)->(n%5==0));
//        System.out.println(l3.remove(0));;
////        l3.replaceAll(integers -> integers * 20);
//        System.out.println(l3.size());
        //l1.forEach((n) -> System.out.println(n));

//        //l3.iterator();
//        System.out.println(l3.iterator());
//        System.out.println(l3.hashCode());
//        l3.listIterator(2);
//        System.out.println(l3.listIterator(2));
//        l1.add(57);
//        l1.trimToSize();
       // System.out.println(l3.get(0));
        //System.out.println(l1.trimToSize());
//        for(int i =0 ;i<l3.size();i++){
//            System.out.println(l3.get(i));
//        }
    }
}
