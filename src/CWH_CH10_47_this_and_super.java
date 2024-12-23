class MyBaseClass{
     int a =10 ;
    String nameSky;
    public int getA() {
        return a;
    }

    MyBaseClass(){
        System.out.println("i am a default base constructor");
        nameSky = "sai Krishna";
    }
   MyBaseClass(int x){
        this.a = x;
       System.out.println("I am a parameter base constructor");
       System.out.println(a);
    }
    void Myname (){
        a =143;
        System.out.println("i am "+a);
    }
    void  s(){
        System.out.println("my new number "+a);
    }
}
class MyDerivedClass extends MyBaseClass{
    private int x =9;
    MyDerivedClass(){
        //super.Myname();
        System.out.println("I am a default derived constructor");
    }
    MyDerivedClass(int x,int y){
        super(x);
        this.x=x;
        System.out.println("I am a parameter derived constructor");
        System.out.println(x+" "+y);
    }
    void myName(){
       // super.Myname();
        super.a =30;
        //System.out.println(super.a);
    }
}
class MyChildClass extends MyDerivedClass{
    private  int a;
    MyChildClass(){
        System.out.println("I am a default child constructor");
    }
    MyChildClass(int x,int y,int z){
        super(x,y);
        System.out.println("I am a parameter child constructor");
        System.out.println(x+" "+y+" "+ z);
        super.Myname();
    }
    void sail(){

    }

}
public class CWH_CH10_47_this_and_super {
    public static void main(String[] args) {
//        MyBaseClass mb = new MyBaseClass(23);
//        System.out.println(mb.getA());
        MyDerivedClass md = new MyDerivedClass();
        System.out.println(md.nameSky);
      // MyChildClass mc = new MyChildClass(4,6,2);
//        md.myName();
//        System.out.println(md.getA());
//        md.s();
//        md.Myname();
//        md.s();
        //mc.sail();
    }
}
