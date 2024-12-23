import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CWH_81_specificException {
    public static void main(String[] args) {
        int [] marks = {2,6,10};
        Scanner sc = new Scanner(System.in);
        try {
            int ind =23563;
            boolean flag = true;
            while (flag) {
                try {
                    System.out.println("Enter index : ");
                    ind = sc.nextInt();
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array out of bound exception occur : ");
                    System.out.println(e);
                } catch (InputMismatchException e) {
                    System.out.println("Input mismatch exception : ");
                    System.out.println(e);
                }
            }
            try {
                if (ind>=0 && ind<marks.length) {
                    System.out.println("Enter divisor : ");
                    int num = sc.nextInt();
                    System.out.println("Division = " + ind / num);
                }
            }
            catch (ArithmeticException e){
                System.out.println("Arithmetic Ex exception occur ");
                System.out.println(e);
            }
            catch (InputMismatchException e) {
                System.out.println("Input mismatch exception : ");
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println("Other exception occur : ");
            System.out.println(e);
        }
    }
}
