import java.util.Scanner;

//problem1
class employee {
    int salary;
    String name;
    Scanner sc = new Scanner(System.in);
    public int get_sal(){
        return salary;
    }
    public String get_name(){
        return name;
    }
    public String set_name(){
        System.out.println("Enter new name : ");
        String new_name = sc.nextLine();
        System.out.println("Thank you name has changed from "+ name+" to "+new_name);
        name = new_name;
        return name;
    }
}
    // problem2
class Cell_phone{
    String ringing;
    String vibrating;
    public String getRinging(){
        return ringing;
    }
    public  String getVibrating(){
        return vibrating;
    }
}
   //problem3
class Square{
    float side;
    public float area(){
        return side*side;
    }
    public float perimeter(){
        return 4*side;
    }
}
  //problem4
class Rectangle{
    float width;
    float length;
    public float area(){
        return width*length;
    }
    public float perimeter(){
        return 2*(length+width);
    }
    }
    // problem5
class PUB_G{
    public void firing(){
        System.out.println("Firing the enemy...");
    }
    public void hitting(){
        System.out.println("Hitting the enemy...");
    }
    public void running(){
        System.out.println("Running from the enemy...");
    }
}
     //problem6
class Circle{
    float radius;
    public float area(){
        return 3.14f*radius*radius;
    }
    public float circumference(){
        return 2*3.14f*radius;
    }
    }
public class CWH_39_practice08 {
    public static void main(String[] args) {
        //problem 1
        employee emp1 = new employee();
        emp1.salary = 20000;
        emp1.name = "Sai krishna";
        System.out.println("Name : "+ emp1.get_name());
        System.out.println("Salary : "+ emp1.get_sal());
        System.out.println(emp1.set_name());
        //System.out.println(emp1.get_name());
       // problem2
        Cell_phone cell1 = new Cell_phone();
        cell1.ringing = "Cell phone is Ringing";
        cell1.vibrating= "Cell phone is  Vibrating";
        System.out.println(cell1.getRinging());
        System.out.println(cell1.getVibrating());
        //problem3
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the distance of side of the square (in cm) : ");
        Square sq =new Square();
        sq.side=  sc.nextFloat();
        System.out.println("Area of the square is : "+sq.area()+"cm");
        System.out.println("Perimeter of the square is :  "+sq.perimeter()+"cm");
        //problem4
        //Scanner sc =new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.println("Enter width of the rectangle (in cm) : ");
        rect.width = sc.nextFloat();
        System.out.println("Enter length of the rectangle (in cm) : ");
        rect.length = sc.nextFloat();
        System.out.println("Area of the Rectangle is : "+ rect.area()+"Cm");
        System.out.println("Perimeter of the Rectangle is : "+ rect.perimeter()+"Cm");
       // problem5
        PUB_G player1 = new PUB_G();
        player1.firing();
        player1.hitting();
        player1.running();
       // problem6
       // Scanner sc =new Scanner(System.in);
        Circle cir = new Circle();
        System.out.println("Enter the radius of the circle (in cm) : ");
        cir.radius =sc.nextFloat();
        System.out.println("Area of the Circle is : "+cir.area()+"Cm");
        System.out.println("Circumference of the Circle is : "+cir.circumference()+"Cm");
    }
}
