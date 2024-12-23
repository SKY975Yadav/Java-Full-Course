import java.util.Random;
import java.util.Scanner;
class GuessTheNumber{
    int s = 0;
    int m =0;
    int count =1;
    private int OGNumber;
    private int inputNumber;
    public GuessTheNumber(){
        Random rm = new Random();
        OGNumber = rm.nextInt(100);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        inputNumber = sc.nextInt();
    }
    public void isCorrectNumber(){
        int d = 10;
        while (d>0){
            if (d==1) {
                System.out.println("Last chance");
                takeUserInput();
                if (inputNumber>100 || inputNumber<=0){
                    System.out.println("entered invalid number ");
                    break;
                }
                if (OGNumber == inputNumber) {
                    System.out.println("Wow Congratulation you guess the number in you  last attempt");
                    System.out.println("You guessed the number in " + count + " attempts");
                    System.out.println(Ranking());
                    break;
                } else {
                    System.out.println("You failed in the game");
                    System.out.println("Original number is : "+OGNumber);
                    break;
                }
            }
            takeUserInput();
            if (inputNumber>100 || inputNumber<=0){
                System.out.println("entered invalid number ");
                break;
            }
           if (inputNumber==OGNumber){
               System.out.println("Congratulation , Your guess is correct ");
               System.out.println("You guessed the number in " + count + " attempts");
               System.out.println(Ranking());
               break;
           } else if (inputNumber<OGNumber) {
               System.out.println("Your guess is wrong , enter greater number");
           } else if (inputNumber>OGNumber) {
               System.out.println("Yor guess is wrong , enter lesser number");
           }
            d--;
            count++;
        }
    }
    public String Ranking(){
        if (count==1 || count==2){
            return "You  played Extremely well ,You get A grade";
        } else if (count==3 ||count==4 || count==5) {
            return "you played very well ,You get B grade";
        } else if (count==6||count==7||count==8) {
            return "You played well,You get C grade";
        }
        else {
            return "You have to improve your game,You get D grade";
        }
    } ////another way
    public void isCorrectNumberPart1(){
        while (s<20){
            if (inputNumber>100 || inputNumber<=0){
                System.out.println("entered invalid number ");
                break;
            }
            if (inputNumber==OGNumber){
                System.out.println("Congratulation , Your guess is correct ");
                System.out.println("You guessed the number in " + count + " attempts");
                System.out.println(Ranking());
                break;
            } else if (inputNumber<OGNumber) {
                System.out.println("Your guess is wrong , enter greater number");
                break;
            } else if(inputNumber>OGNumber){
                System.out.println("Yor guess is wrong , enter lesser number");
                break;
            }
            s++;
        }
    }
    public void isCorrectNumberPart2(){
        while (m<20){
            if (inputNumber>100 || inputNumber<0){
                System.out.println("entered invalid number ");
                break;
            }
            if (OGNumber == inputNumber) {
                System.out.println("Wow Congratulation you guess the number in you  last attempt");
                System.out.println("You guessed the number in " + count + " attempts");
                System.out.println(Ranking());
                break;
            }
            else if(inputNumber != OGNumber) {
                System.out.println("You failed in the game");
                System.out.println("Original number is : "+OGNumber);
                break;
            }
            m++;
        }
    }
    public boolean forBreak(){
        if (inputNumber == OGNumber){
            return true;
        }
        return false;
    }
}//  both are success
public class CWH_43_exercise3 {
    public static void main(String[] args) {
        GuessTheNumber gs = new GuessTheNumber();
        System.out.println("Welcome to Guess the number game ");
        System.out.println("Enter number only from 1 to 100 \nYou have only 10 choices\nYou will get a grade based on your performance");
        //gs.isCorrectNumber();
        int d =0;
        while (d<10){
            if (d==9){
                System.out.println("Last chance : ");
                gs.takeUserInput();
                gs.isCorrectNumberPart2();
                break;
            }
            gs.takeUserInput();
            gs.isCorrectNumberPart1();
            if (gs.forBreak()){
                break;
            }
            gs.count++;
            d++;
        }
    }
}
