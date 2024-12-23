import java.util.Scanner;
import  java.lang.String;
class InvalidInputException extends  Exception{
    @Override
    public String toString() {
        return "Entered input is not valid ";
    }

    @Override
    public String getMessage() {
        return "Entered input id not valid ";
    }
}
class CannotDividedByZero extends Exception{
    @Override
    public String toString() {
        return "Cannot divided by Zero";
    }

    @Override
    public String getMessage() {
        return "Cannot divided by Zero";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input should not greater than 100000";
    }

    @Override
    public String getMessage() {
        return "Input cannot not be greater than 100000";
    }

}
class MaxMultiplierReached extends Exception{
    @Override
    public String toString() {
        return "Multiplier or multiplicand cannot be greater than 7000 ";
    }

    @Override
    public String getMessage() {
        return "Multiplier or multiplicand cannot be greater than 7000 ";
    }
}
class Calculator {
    public double add(double a,double b) {
        if (a==8 && b==9){
            try {
                throw  new InvalidInputException();
            } catch (InvalidInputException e) {
                System.out.println(e);
            }
        } else if (a>100000 || b>100000) {
            try {
                throw new MaxInputException();
            } catch (MaxInputException e) {
                System.out.println(e);
            }
        }
        return a + b;
    }
    public double sub(double a, double b) {
        if (a>100000 || b>100000) {
            try{
                throw new MaxMultiplierReached();
            } catch (MaxMultiplierReached e) {
                System.out.println(e);
            }
        }
        return a-b;
    }
    public double mul(double a, double b){
        if (a>7000 || b>7000) {
            try {
                throw new MaxInputException();
            } catch (MaxInputException e) {
                System.out.println(e);
            }
        }
        return a*b;
    }
    public double div(double a, double b ){
        if (b==0){
            try {
                throw new CannotDividedByZero();
            } catch (CannotDividedByZero e) {
                System.out.println(e);
            }
        }
        else if (a>100000 || b>100000) {
            try {
                throw new MaxInputException();
            } catch (MaxInputException e) {
                System.out.println(e);
            }
        }
        return a/b;
    }
}
public class CWH_87_exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Calculator cs = new Calculator();
        System.out.println(cs.add(8,5));;
        System.out.println(cs.div(5.,2));;
        System.out.println(cs.mul(86,545));;
        System.out.println(cs.sub(32455,552));;
    }
}
