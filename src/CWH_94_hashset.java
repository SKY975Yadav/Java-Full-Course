import java.util.HashSet;

public class CWH_94_hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        hs.add(34);
        hs.add(53);
        hs.add(34);
        hs1.add(53);
        Object i = 34;
        System.out.println(hs);
    }
}
