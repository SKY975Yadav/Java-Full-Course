public class CWH_19_practice04 {
    public static void main(String[] args) {
        //problem1
//        int a = 10;
//        if(a==11){
//            System.out.println("Iam 11");
//        }
//        else {
//            System.out.println("Iam not 11");
//        }
//        //problem2
//        Scanner sc = new Scanner(System.in);
//        int m1,m2,m3;
//        System.out.println("Enter 1st subject marks : ");
//        m1= sc.nextInt();
//        if(m1<100){
//            System.out.println("Enter 2st subject marks : ");
//            m2= sc.nextInt();
//            if(m2<100){
//                System.out.println("Enter 3st subject marks : ");
//                m3= sc.nextInt();
//                if(m3<100){
//                    float percentage= (m1+m2+m3)/3.0f;
//                    System.out.println("Your Percentage is " + percentage);
//                    if(percentage>40 && m1>33 && m2>33 && m3>33){
//                        System.out.println("Yes , you are passed out.");
//                    }
//                    else {
//                        System.out.println("You are failed. ");
//                    }
//                }
//                else {
//                    System.out.println("Entered wrong marks");
//                }
//
//            }
//            else {
//                System.out.println("Entered wrong marks");
//            }
//
//        }
//        else{
//            System.out.println("Enter wrong marks");
//        }
        //problem3
//        System.out.println("Enter income of the employee in lakhs : ");
//        float tax = 0.0f;
//        Scanner sc = new Scanner(System.in);
//        float amount = sc.nextFloat();
//         if(amount<2.5){
//            System.out.println("No need to pay the tax");
//        }
//        else if(amount>=2.5f && amount<5.0f){
//            tax = tax + 0.05f*(amount-2.50f);
//             System.out.println("You need to pay the tax of 5%\ni.e = " + tax+" lakhs");
//         }
//        else if(amount>=5.0f && amount<7.5){
//            tax = tax + 0.05f*(5.0f-2.50f);
//            tax = tax + 0.2f*(amount-5.0f);
//             System.out.println("You need to pay the tax of 20%\ni.e = "+ tax+" lakhs");
//         }
//        else{
//            tax = tax + 0.05f*(5.0f-2.50f);
//            tax = tax + 0.2f*(10.0f-5.0f);
//            tax = tax + 0.3f*(amount-10.0f);
//             System.out.println("You need to pay the tax of 30%\ni.e = "+tax+" lakhs");
//         }
        //problem4
//        System.out.println("Enter day number : ");
//        Scanner sc = new Scanner(System.in);
//        byte day = sc.nextByte();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }
        //problem5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter year : ");
//        int year = sc.nextInt();
//        if(year%4==0){
//            if(year%100!=0 || year%400==0){
//                System.out.println("It is a leap year");
//            }
//            else{
//                System.out.println("It is not a leap year");
//            }
//        }else{
//            System.out.println("It is not leap year");
//        }
        //problem6
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter /website Name : ");
//        String url = sc.nextLine();
//        if(url.endsWith(".com")){
//            System.out.println("It is Commercial Website");
//        } else if (url.endsWith(".in")) {
//            System.out.println("It is Indian Website");
//        } else if (url.endsWith(".org")) {
//            System.out.println("It is Organization Website");
//        } else {
//            System.out.println("Invalid Website");
//        }
    }
}
