import java.util.*;
import java.lang.*;
/*import java.util.function.*;
//import java.util.stream.DoubleStream;
//import java.util.stream.IntStream;
//import java.util.stream.LongStream;
//import java.util.stream.Stream;
*/

public class fake {
    public static void main(String[] args) {
        int [] a = new int[30];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        Queue<Integer> q = new ArrayDeque<>();
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        int [] b = new int[4];
        Integer s = 4;
       b[0]= 3972;
        b[1]= 32;
        b[2]= 362;
        b[3]= 33;
        ArrayList<Integer> al = new ArrayList<>(10);
//        for (int j :b
//        ) {
//            System.out.println(j);
//        }
        Arrays.stream(b).sum();
        Arrays.stream(b).sorted();
        System.out.println(Arrays.stream(b).sorted());
//        for (int j :b
//        ) {
//            System.out.println(j);
//        }
        b.clone();
        st.add(30);
        //st.add(3164);
        st.add(33);
        st.add(1);
        st.add(153);
        st.add(3164);
        st.add(34364);
        st.add(3664);
        st.add(32364);
        st.add(3284);

        st.push(45);
        st.pop();
        st.add(6,34);
//        System.out.println(st);
        st.elements();
//        System.out.println(st);
        st.ensureCapacity(979);
//        System.out.println(st.capacity());
//        System.out.println(st.size());
        st1.add(30);
        st1.add(153);
        st1.add(45);
        st1.add(341);
        st1.add(341);
        Integer i = 153;
        //st.insertElementAt(3,2);
        //st.retainAll(st1);
//        System.out.println(st);
//        System.out.println(st.subList(3,5));;
//        System.out.println(st);
//        st.ensureCapacity(30);
//        System.out.println(st.capacity());
//        st.trimToSize();
//        System.out.println(st.capacity());
//
////        System.out.println(st.indexOf(i,4));
//        //System.out.println(st.get(3));
//
//        //System.out.println(st.elements());
////        System.out.println(st.capacity());
////        System.out.println(st.size());
//        //System.out.println(st);

//        ArrayList<Integer> al = new ArrayList<>(10);
        LinkedList<Integer> ll = new LinkedList<>();
        Deque<Integer> dq = new ArrayDeque<>(30);
        HashSet<Integer> hs = new HashSet<>();
        al.ensureCapacity(678);
//        System.out.println(st.capacity());
//        System.out.println(hs.size());
//        System.out.println(al.capacity());
//        System.out.println(hs.size());
//        System.out.println(hs.capacity());
//        System.out.println(hs.size());
//        System.out.println(hs.capacity());
//        System.out.println(hs.size());

//        al.add(45);
//        al.add(345);
//        al.add(3245);
//        al.add(245);
//        System.out.println(al.capacity());
//        System.out.println(al.size());
//        dq.add(45);
//        dq.add(345);
//        dq.add(3245);
//        dq.add(245);

//
//       for (int i = 0;i<30;i++) {
//           a[i] = i + 1;
//       }
//        for (int i = 0;i<30;i++) {
//            al.add(i,i*2) ;
//        }
//        al.remove(0);
//        //System.out.println(al);
//        for (int i = 0;i<30;i++) {
//            ll.add(i,i*2+1);
//        }
//        for (int i = 0;i<30;i++) {
//            dq.add(i*5);
//        }
//        dq.remove(0);
//        //System.out.println(dq);
//        for (int i = 0;i<30;i++) {
//            hs.add(i*10);
//        }
//        hs.remove(0);
//        //hs.stream().findAny()
//        // ;
//        Integer s = 20;
//        System.out.println((long) hs.size());
//        System.out.println(hs);
////        for (int i: a
////             )
////        {
////            System.out.println(i);
////        }
    }
}
