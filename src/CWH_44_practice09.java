//problem1 and 2 and 3
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
//problem4
class Rectangle1{
    private int  length;
    private int breadth;

    public Rectangle1() {
        this.length = 25;
        this.breadth = 30;
    }
    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
//problem5
class Sphere{
    private int radius;
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public Sphere(int radius) {
        System.out.println("My radius is : "+radius);
        this.radius = radius;
    }
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return 4/3.*Math.PI*Math.pow(radius,3);
    }
}
public class CWH_44_practice09 {
    public static void main(String[] args) {
        //problem1 & 3
//        Cylinder cyl = new Cylinder(25,43);
//        cyl.setHeight(15);
//        cyl.setRadius(20);
//        System.out.println(cyl.getHeight());
//        System.out.println(cyl.getRadius());
//        //problem2
//        System.out.println(cyl.surfaceArea());
//        System.out.println(cyl.volume());
//        //problem4
//        Rectangle1 rec = new Rectangle1(23,56);
//        System.out.println(rec.getBreadth());
//        System.out.println(rec.getLength());
        //problem5
        Sphere sp = new Sphere(3);
        sp.setRadius(10);
        System.out.println(sp.getRadius());
        System.out.println(sp.surfaceArea());
        System.out.println(sp.volume());
    }
}
