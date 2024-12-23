 import java.util.Scanner;
public class CWH_06_exersice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student : ");
        String name = sc.nextLine();
        System.out.println("calculating the Percentage of "+name+ " :");
        System.out.println("Enter subject1 marks : ");
        int s1 = sc.nextInt();
        System.out.println("Enter subject2 marks : ");
        int s2 = sc.nextInt();
        System.out.println("Enter subject3 marks : ");
        int s3 = sc.nextInt();
        System.out.println("Enter subject4 marks : ");
        int s4 = sc.nextInt();
        System.out.println("Enter subject5 marks : ");
        float s5 = sc.nextFloat();
        float percentage;
        percentage = ((s1+s2+s3+s4+s5)/500)*100;
        System.out.println("Percentage of the " + name +" is : "+ percentage);
    }
}
// maths 100,biology 80,physics 67,english 89 for 100,total = 400,   ((maths+bio+phy+eng)/400)*100
