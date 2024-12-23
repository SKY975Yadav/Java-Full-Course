import java.math.BigDecimal;
import java.math.BigInteger;

public class CWH_CH1_04_literals {
    public static void main(String[] args) {
        byte b = 23;
        short c = 234;
        int d = 134085;
        long a = 317872497589429787L;
        String st1 = "54364326446234958237589472358632664";
        BigInteger bi = new BigInteger(st1);
        System.out.println("This is big integer : "+bi);
        char e = 's';
        float f = 2.4f;
        double g = 3.6;
        String st2 = "54364326446234958237589472358632664.4689375837957849237546782352942358759327589";
        BigDecimal bc = new BigDecimal(st2);
        System.out.println("This is big decimal : "+bc);
        String h = "sai krishna";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
