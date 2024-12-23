abstract class parent{
    public void name(){
        System.out.println("my name is sai krishna");
    }
    parent(){
        System.out.println("I am a constructor");
    }
    abstract public  void street();
}
class childs extends parent{
    public void street(){
        System.out.println("Good morning");
    }
    public void member(){
        System.out.println("hi i am in");
    }
    childs(){
        System.out.println("construct");
    }
}
class childHood extends childs{
    public void ok(){
        System.out.println("I am fine");
    }
    childHood(){
        System.out.println("con");
    }
}
public class CWH_CH11_53_abstract {
    public static void main(String[] args) {
        parent cj = new childHood();
       // cj.name();
//        cj.member();
//        cj.ok();
    }
}
