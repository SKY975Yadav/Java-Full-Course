import java.time.LocalTime;
import java.util.*;

public class CWH_103_practice15 {
    public static void main(String[] args) {
        /* problem1
//        ArrayList<String> name = new ArrayList<>(Arrays.asList("Sai","krishna","Yadav","Kartik","rohit","Raju","Ramu","vamshi","Rahul","uday"));
//        //System.out.println(name);
//      //  System.out.println(name1);
//        for (String st : name
//             ) {
//            System.out.println(st);
//        }
        */
        /* problem2
        Date d = new Date();
        d.setHours(21);
        d.setMinutes(47);
        d.setSeconds(2);
        System.out.println(d.getHours()+":"+d.getMinutes()+":0"+d.getSeconds());
        System.out.println(d.clone());
         */
        /* problem3
        Calendar cl = Calendar.getInstance();
        cl.set(123,5,21,21,47,2);
        System.out.println(cl.get(Calendar.HOUR_OF_DAY)+":"+cl.get(Calendar.MINUTE)+":0"+cl.get(Calendar.SECOND));
         */
        /* problem4
        LocalTime lt = LocalTime.of(21,47, 2);
        System.out.println(lt);
         */
        /* problem5
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(22,42,432,232,1,431,21,42));
        System.out.println(hs);
         */
    }
}
