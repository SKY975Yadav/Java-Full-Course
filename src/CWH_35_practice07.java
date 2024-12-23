public class CWH_35_practice07 {
    //problem1
//    static void multable(int n){
//        for(int i =1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n",n,i,i*n);
//        }
//    }
    //problem2
//    static void patternprint(int n){
//        for(int i =0;i<n;i++){
//            for(int j =0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }
//    }
    //problem3
//    static  int sumofnrec( int n){
//        if(n==1){
//            return 1 ;
//        }
//        return n+ sumofnrec(n-1);
//    }
    //problem4
//    static void patternprint1(int n){
//        for(int i =n;i>0;i--){
//            for (int j =0;j<i;j++){
//                System.out.print(" * ");
//            }
//            System.out.print("\n");
//        }
//    }
    //problem5
    static int fibonacc_nth(int n){
        if(n==1 || n==2) {
            return n - 1;
        }
        return fibonacc_nth(n-1)+fibonacc_nth(n-2);
    }
    //3=1,2=1,4=2

    //problem 6
//    static float avarageofargs(int ... args){
//        float sum =0;
//        for(int i =0;i< args.length;i++){
//            sum=sum+args[i];
//        }
//        return sum/args.length;
//       // System.out.println(sum/ args.length);
//    }
    //problem7
//    static void pattern_rec_rev(int n){
//        if (n>=1){
//            for (int i=0;i<n;i++){
//                System.out.print("* ");
//            }
//            System.out.println();
//            pattern_rec_rev(n-1);
//        }
//    }

    //problem8
//    static void pattern_rec(int n){
//        if(n>=1){
//            pattern_rec(n-1);
//            for (int i=0;i<n;i++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    //problem9
//    static void convert_celsius_to_fahrenheit(float Celsius ){
//        float fahrenheit;
//        fahrenheit = (Celsius*1.8f)+32;
//        System.out.println(fahrenheit);
//    }
    //problem10
//    static void sumofn(int n){
//        int sum =0;
//        for(int i =1;i<=n;i++){
//            sum = sum+i;
//        }
//        System.out.println(sum);
//    }


    public static void main(String[] args) {
        //multable(5);
        //patternprint(10);
        // System.out.println(sumofnrec(10));
        //patternprint1(10);
        System.out.println(fibonacc_nth(1));
        // System.out.println(avarageofargs(2,4,5,3,1,8,9,7));
        //pattern_rec(5);
        //pattern_rec_rev(4);
        // convert_celsius_to_fahrenheit(195);
        //sumofn(5);
    }
}
