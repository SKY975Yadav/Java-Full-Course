class A{
    public void sai(){
        System.out.println("My name is sai ");
    }
    public void krishna(){
        System.out.println("My name is krishna");
    }
}
class B extends A{
    public void krishna(){
        System.out.println("My name is 'b' krishna");
    }
    public void krishna(int a){
        System.out.println("My name is Krishna from b my number is "+a);
    }
}
public class CWH_CH10_48_overriding {
    public static void main(String[] args) {
        A a =new A();
        a.krishna();
        B b = new B();
        b.krishna();
       // b.krishna(5);
    }
}
