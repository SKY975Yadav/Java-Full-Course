import java.util.Scanner;
public class CWH_25_practice05 {
    public static void main(String[] args) {
        //problem1
//        int n=0;
//        for( int i=4;i>n;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            if(i==1){   //for reduce the space of last line
//                continue;
//            }
//            System.out.print("\n");
//        }
        //problem2
//        int a =1;
//        int sum = 0 ;
//        while(a<=10){
//            sum=sum+(2*a);
//            a++;
//        }
//        System.out.println(sum);
        //problem3
//        System.out.println("enter multiplication number : ");
//        Scanner sc = new Scanner(System.in);
//        byte n = sc.nextByte();
//        for(int i = 1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }
        //problem5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number whose factorial u want : ");
//        int n = sc.nextInt();
//        long fact = 1;
//        for(int i = n;i>=1;i--){
//            fact =fact*i;
//        }
//        System.out.printf("factorial of %d is %1d",n,fact);
        //problem6
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter factorial : ");
//        int a = sc.nextInt();
//        int fact = 1;
//        while(a>=1){
//            fact *= a;
//            a--;
//        }
//        System.out.println("Factorial = "+fact);
        //problem7
//        int a =4;
//        while(a>=0)
//        {
//            int b =0;
//            while(b<a)
//            {
//                System.out.print("* ");
//                b++;
//            }
//            if(a==0){
//                continue;
//            }
//            System.out.print("\n");
//            a--;
//        }
//        //problem8
//        yes
          //problem9
//        byte n =8;
//        int k;
//        int sum =0;
//        for (int i=1;i<=10;i++){
//            k=i*n;
//            System.out.printf("8 X %d = %d\n",i,k);
//            sum +=k;
//        }
//        System.out.println("\nSum = "+sum);
        //problem10
//        byte a =1;
//        do{
//            System.out.println("At least once");
//            a++;
//        }while (a>5);
        //problem11
        int a =10;
        int sum = 0;
        for (int i =1;i<=a;i++){
            sum = sum+(2*i);
        }
        System.out.println("Sum = "+sum);


    }
}
