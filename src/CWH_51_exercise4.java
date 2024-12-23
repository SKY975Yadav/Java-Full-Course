import java.util.Scanner;
import java.lang.System;
class Library{
    int total_no_books = 150;
    String [] max_books = new String[200];
    String [] issued_books = new String[100];
    int no_of_books_issued = 50;
    int no_of_available_books ;
    public int getTotal_books(){
        return total_no_books;
    }
    public int getIssued_books(){
        return no_of_books_issued;
    }
    public void issue_book(String st){
        no_of_books_issued = no_of_books_issued+1;
        System.out.println("Now you can take "+st+" Book");
    }
    public int getAvailable_books() {
        return no_of_available_books = total_no_books-no_of_books_issued;
    }
    public void Return_books(String st){
        no_of_available_books = no_of_available_books+1;
        no_of_books_issued = no_of_books_issued-1;
        max_books[no_of_available_books] = st;
        System.out.println(st+" book returned ");
    }
    public void Add_book(String st){
        total_no_books++;
        max_books[total_no_books]=st;
        System.out.println(st+"book has been added");
    }
}
public class CWH_51_exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lb = new Library();
      //  System.out.println("Enter your choice : \n1.Add book\n2.Issue book\n3.Return book\n4.No.of Available books\n5.No.of Issued books\n6.Total no.of books");
        int k = 0;
        while (k<10){
            System.out.println("Enter your choice : \n1.Add book\n2.Issue book\n3.Return book\n4.No.of Available books\n5.No.of Issued books\n6.Total no.of books\n0.Exit");
            byte m =sc.nextByte();
            switch (m){
                case 1 :
                    System.out.println("Enter book name which you want to add in library ");
                    String add = sc.next() ;
                    lb.Add_book(add);
                    break;
                case 2 :
                    System.out.println("Name of the Book you want");
                    String add1 = sc.next();
                    lb.issue_book(add1);
                    break;
                case 3 :
                    System.out.println("Enter the book name which you want to return");
                    String add2 = sc.next() ;
                    lb.Return_books(add2);
                    break;
                case 4 :
                    System.out.println(lb.getAvailable_books());
                   break;
                case 5 :
                    System.out.println(lb.getIssued_books());
                    break;
                case 6 :
                    System.out.println(lb.getTotal_books());
                    break;
                case 0 : break;
                default:
                    System.out.println("invalid choice ");
                    break;
            }
            if (m==0){
                System.out.println("Thanks you");
                break;
            }
            k++;
        }
    }
}

