import java.util.concurrent.Callable;

class Base{
    int s = 10;
    Base(){
        System.out.println("I am a base constructor");
    }
    Base(int x){
        System.out.println("I am a base constructor and my value is " +x);
    }
}
class Derived extends  Base{
    Derived(){
        super.s=40;
        System.out.println("I am a derived constructor");
    }
    void sai(){
        System.out.println("My name is sai krishna");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("I am a derived constructor and my value is : "+x+" and "+y);
    }
}
class Child extends Derived{
    Child(){
        System.out.println("I am a child constructor");
        super.sai();
    }
    Child(int x,int y,int z){
        super(x,y);
        System.out.println("I am a child constructor and my value is : "+x+" and "+y+" and "+z);
    }
}
public class CWH_CH10_46_constructor_overloading {
    public static void main(String[] args) {
        Child cd = new Child(3,5,7);
        //Derived d = new Derived(4,6);
        System.out.println(cd.s);

    }
}
