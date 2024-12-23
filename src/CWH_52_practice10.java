class MyCircle {
    public int radius;
    MyCircle(){
        System.out.println("I am a default constructor");
    }
    MyCircle(int r){
        System.out.println("I am from MyCycle");
        this.radius =r;
    }
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
class MyCylinder extends MyCircle{
    public int height ;
    MyCylinder(int r ,int h){
        super(r);
        System.out.println("I from MyCylinder");
        this.height =h;
    }
    public double volume(){
        return Math.PI * this.radius * this.radius*height;
    }
}
class MyRectangle{
    public int length;
    public int width;
    MyRectangle(){
        System.out.println("default");
    }
    MyRectangle(int l,int w){
        this.length =l;
        this.width =w;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    int Area(){
        return length*width;
    }
    int Perimeter(){
        return 2*(length*width);
    }
}
class MyCuboid extends MyRectangle {
    int height;
    MyCuboid(){
        System.out.println("default cuboid");
    }
    MyCuboid(int l ,int w, int h){
        super(l,w);
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
     public int Area (){
         System.out.println("Mycube");
        return 2*this.length*width + 2*length*height+2*width*height;
    }
    public int Volume(){
        return length*width*height;
    }

}
public class CWH_52_practice10 {
    public static void main(String[] args) {
        //problem1
        //MyCylinder obj =new MyCylinder();
        //MyCylinder obj = new MyCylinder(2,3);
//        System.out.println(obj.area());
//        System.out.println(obj.volume());
        //problem2
        MyRectangle jk = new MyRectangle();
        jk.setLength(14);
        jk.setWidth(15);
        System.out.println(jk.Area());
        MyCuboid mc = new MyCuboid(23,45,64);
//        System.out.println(mc.getLength());
//        System.out.println(mc.getWidth());
//        System.out.println(mc.getHeight());
//        System.out.println(mc.Area());
        mc.setLength(14);
        mc.setWidth(15);
        mc.setHeight(16);
        System.out.println(mc.getLength());
        System.out.println(mc.getWidth());
        System.out.println(mc.getHeight());
        System.out.println(mc.Perimeter());
        System.out.println(mc.Volume());
    }
}
