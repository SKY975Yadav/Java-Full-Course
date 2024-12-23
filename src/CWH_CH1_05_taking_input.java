import java.util.Scanner;

public class CWH_CH1_05_taking_input {
    public static void main(String[] args) {
        System.out.println("taking input from the user");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one : ");
        boolean a = sc.hasNextDouble();
        System.out.println("enter number two : ");
        System.out.println(a);
    }
}
