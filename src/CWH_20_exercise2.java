import java.util.Scanner;
import java.util.Random;
public class CWH_20_exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k;
        String e;
        int j;
        Random random = new Random();
        do{
            System.out.println("Enter one of them \n0.Rock  1.Paper  2.Scissor");
            int x = sc.nextInt();
            if (x == 0) {
                e = "Rock";
            } else if (x == 1) {
                e = "Paper";
            }else {
                e = "Scissor";
            }
            if(x==0 || x==1 || x==2) {
                int y = random.nextInt(3);
                if (y == 0) {
                    k = "Rock";
                }
                else if (y == 1) {
                    k = "Paper";
                }
                else {
                    k = "Scissor";
                }
                if (x == y) {
                    System.out.println("you chosen = "+e);
                    System.out.println("Computer chosen = "+k);
                    System.out.println("Both are you chosen same object .So Try once again");
                }
                else {
                    System.out.println("you chosen = "+e);
                    System.out.println("Computer chosen : " + k);
                    if ((x == 0 && y == 2) || (x == 1 && y == 0) || (x == 2 && y == 1)) {
                        System.out.println("You won the game");
                    }
                    else {
                        System.out.println("Computer won the game");
                    }
                }
            }
            else{
                System.out.println("Invalid choice");
            }
            System.out.println("\n");
            System.out.println("Are you want to play again press \n1.Yes\n2.No");
            int l = sc.nextInt();
            j=l;
        }while(j==1);
        System.out.println("Thanks for playing!");

    }
}
