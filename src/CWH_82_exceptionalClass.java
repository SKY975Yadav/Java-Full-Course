import java.util.Scanner;

class NegativeRadiusException extends  Exception{
    @Override
    public String toString() {
        return "Radius cannot be a Negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be a Negative";
    }
}
public class CWH_82_exceptionalClass {
    public static double area(int r)throws NegativeRadiusException
    {
        if(r<0) {
            throw  new NegativeRadiusException();
        }
            double result = Math.PI * r * r;
            return result;
    }
    public static int divide(int a, int b)throws ArithmeticException
    {
        int result = a/b;
        return result;
    }
    public static void main(String[] args)
    {
        try {
            double c = area(-5);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
//
//        double c = area(-5);
//        System.out.println(c);
        System .out.println("HI i am sai");

//        try {
//            int c = divide(3,0);
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println("Exception occur");
//        }
//        int b =100;
//        Scanner sc = new Scanner(System.in);
//        //int a = sc.nextInt();
//        int a =0;
//        System.out.println(b/a);
//        if (a == 0) {
//            try {
//                //System.out.println(b/a);
//                throw new MyException();
//                // throw new ArithmeticException("i am exception");
//            } catch (Exception e) {
//                System.out.println(e);
//                //system.out.println(e.getMessage());
////                    e.printStackTrace();
////                    System.out.println(e.getLocalizedMessage());
//            }
//        }
//        else {
//            System.out.println(b/a);
//        }
    }
}
