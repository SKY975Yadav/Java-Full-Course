import java.lang.*;
import java.util.*;

class MyGeneric<INT1,GEN1,GEN2>{
    private INT1 d;
    private GEN1 gen1;
    private GEN2 gen2;

    public GEN1 getGen1() {
        return gen1;
    }

    public void setGen1(GEN1 gen1) {
        this.gen1 = gen1;
    }

    public GEN2 getGen2() {
        return gen2;
    }

    public void setGen2(GEN2 gen2) {
        this.gen2 = gen2;
    }

    public MyGeneric(GEN1 t1 ,GEN2 t2){
        this.gen1=t1;
        this.gen2 = t2;
    }
}
interface Animal5{
//    String sound;
//     void live1();
     abstract void live1(int a);
}
class cat5 {
    public cat5(){

    }
    private String voice;

//    public String getVoiceCat() {
//       // super.sound = "meou,meou..";
//        System.out.println("I am cat, My voice is : ");
//        return sound;
//    }

//     public void setVoiceCat();
}
public class CWH_lambda {
    public static void sai (ArrayList<Integer> arr, int n, int k) {
        //Write your code here
        for(int i= 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr.get(i)>arr.get(j)){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j)) ;
                    arr.set(j,temp);
                }
            }
        }
//        for (int s : arr) {
//            System.out.print(s+" ");
//        }
//        System.out.println("\n");
        Set<Integer> s = new LinkedHashSet<>();
        s.addAll(arr);
//        for(int i= 0;i<n;i++){
//            for(int j=i;j<n;j++){
//                if(Objects.equals(arr.get(i), arr.get(j))){
//                   arr.remove(i+1);
//                }
//            }
//        }
        arr.clear();
        arr.addAll(s);
        n = arr.size();
//        for (int sm : arr) {
//            System.out.print(sm+" ");
//        }
        for(int i =0;i<n;i++){
            if(1+i==k){
                System.out.print(+arr.get(i)+"\n");
            }
        }
        for(int i=n-1;i>0;i--){
            if(1+i==n-k+1){
                System.out.print(arr.get(i));
            }
        }
    }
    public static void sort012(int[] arr)
    {
        int n = arr.length;
        for(int i= 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//        for (int s : arr) {
//            System.out.print(s+" ");
//        }
    }
    public static void main(String[] args) {
        int [] ar = {0 ,1 ,2 ,1 ,2 ,1 ,2,5,2,1,5,1,4,10,0,2};
        //sort012(ar);
        ArrayList<Integer> sc = new ArrayList<>();
        sc.add(22);
        sc.add(3);
        sc.add(21);
        sc.add(0);
        sc.add(56);
        sc.add(67);
        sc.add(10);
        sc.add(31);
        sc.add(13);
        sc.add(2);
        int m = sc.size();
//        System.out.println(sc.clone());
//        sc.remove(3);
//        System.out.println(sc.clone());
        sai(sc,m,5);
        //Arrays.sort(ar);
//       MyGeneric<Integer,String,Integer> mg = new MyGeneric<>("Sai",352);
//        System.out.println(mg.getGen1());

//        System.out.println(gn.t1);
//        ArrayList<Integer> itr = new ArrayList();
//        ArrayList s = new ArrayList();
//
//        itr.add(43);
//        Integer a = itr.get(0);
//        System.out.println(a);
//        //anonymous
//        cat5 cf = new cat5() {
////            @Override
//        };
//        Animal5 an = new Animal5(){
////            @Override
//            public void live1() {
//                System.out.println("hi");
//            }
//
////            @Override
//            public void live1(int a) {
//                System.out.println("I am Sai krishna");
//            }
//
//            public int s(){
//                int s1 = 5;
//              return s1;
//            }
//        };
//        //an.live1();
//        //lambda
//        Animal5 anm = (x)->{
//            System.out.println("I am an Animal"+x);
//        };
//        anm.live1(3);
    }
}
