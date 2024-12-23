import java.util.Scanner;
public class CWH_CH4_16to18_conditional {
    public static void main(String[] args) {
        //if else if
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter age : ");
//        int age = sc.nextInt();
//        if(age>=18){
//            System.out.println("your eligible for vote!");
//        }
//        else if(age==17){
//            System.out.println("you have to wait one year for eligible for vote!");
//        }
//        else {
//            System.out.println("your not eligible for vote!");
//        }
        //switch statement
        System.out.println("Welcome to the calculator of two numbers");
        System.out.println("Enter first number : ");
        int b = sc.nextInt();
        System.out.println("Enter operator : ");
        String ch= sc.next();
        System.out.println("Enter second number");
        int c = sc.nextInt();
        switch (ch) {
            case "+" -> System.out.println("Answer = " + (b + c));
            case "-" -> System.out.println("Answer = " + (b - c));
            case "*" -> System.out.println("Answer = " + (b * c));
            case "/" -> System.out.println("Answer = " + (b / c));
            case "%" -> System.out.println("Answer = " + (b % c));
            default -> System.out.println("entered wrong operator!");
        }
    }
}
