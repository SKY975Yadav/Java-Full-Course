import java.util.Scanner;
public class CWH_CH3_13_strings {
    public static void main(String[] args) {
//        String st = "My name is sa krishna";
//        String st1 = new String("My name is sai krishna");
//        System.out.printf("%s and %s",st,st1);
//        System.out.println();
        System.out.printf("enter your name : ");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println("Printing your name :\n"+ str);
    }
}
