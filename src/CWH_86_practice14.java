import java.util.Scanner;
class MaxRetriesException extends  Exception{
    @Override
    public String toString() {
        return "Maximum Reties are reached";
    }

    @Override
    public String getMessage() {
        return "Maximum Reties are reached";
    }
}
class MaxRetriesokException extends  Exception{
    @Override
    public String toString() {
        return "Maximum Reties are reached";
    }

    @Override
    public String getMessage() {
        return "Maximum Reties are reached";
    }
}
public class CWH_86_practice14 {
    //2nd
//    public static double area(int r) {
//        if(r<=0){
//            throw new  IllegalMonitorStateException("HeHe");
//        }
//        double area = Math.PI * r * r;
//        return area;
//
//    }
//
//    public static  double div(int d){
//        try {
//            double div = 100 / d;
//            return div;
//        }
//        catch (ArithmeticException e){
//            System.out.println("HaHa");
//        }
//        finally {
//            System.out.println("hdkgjd");
//        }
//        if(d<0){
//            throw new  IllegalMonitorStateException("HeHe");
//        }
//        return 0;
//    }
    public static void AccessingAnArray() throws MaxRetriesException{
        Scanner sc = new Scanner(System.in);
        int [] arr = {3,5,6};
        boolean flag = true;
        int i=0;
        while(flag && i<5){
            try{
                System.out.println("Enter index : ");
                int ind = sc.nextInt();
                System.out.println("The value of given index is : "+ arr[ind]);
                flag = false;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i== 5){
            try{
                throw new MaxRetriesException();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void testing() throws MaxRetriesokException{
        Scanner sc = new Scanner(System.in);
        int [] arr = {3,5,6};
        boolean flag = true;
        int i=0;
        while(flag && i<5){
            try{
                System.out.println("Enter index : ");
                int ind = sc.nextInt();
                System.out.println("The value of given index is : "+ arr[ind]);
                flag = false;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i== 5){
            try{
                throw new MaxRetriesokException();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) throws MaxRetriesException, MaxRetriesokException {
            //AccessingAnArray();
            testing();

        System.out.println("Program ends here");
        //2nd problem
//        try {
//            area(-5);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        try{
//            div(0);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        //problem 3 to 5
//        Scanner sc = new Scanner(System.in);
//        int [] arr = {3,5,6};
//        boolean flag = true;
//        int i=0;
//        while(flag && i<5){
//            try{
//                System.out.println("Enter index : ");
//                int ind = sc.nextInt();
//                System.out.println("The value of given index is : "+ arr[ind]);
//                flag = false;
//            }
//            catch (Exception e){
//                System.out.println("Invalid index");
//                i++;
//            }
//        }
//        if(i== 5){
//            try{
//            throw new MaxRetriesException();
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//        }
    }
}
