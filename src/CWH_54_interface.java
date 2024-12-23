interface Phone1{
    void calling();
    void dateAndTime();
}
interface SmartPhone1{
    void videoCall();
    void instagram();
}
interface Laptop{
    void programming();
}
class imp implements Phone1,SmartPhone1{
    public void calling(){
        System.out.println("Calling");
    }
    public void dateAndTime(){
        System.out.println("showing date and time");
    }
    public void checking(){
        System.out.println("just for checking");
    }
    public void videoCall(){
        System.out.println("Video calling in smart phone");
    }
    public void instagram(){
        System.out.println("using instagram");
    }
}
class fimp extends imp implements Laptop{
    @Override
    public void programming() {
        System.out.println("programming in laptop");
    }
}
public class CWH_54_interface {
    public static void main(String[] args) {
        fimp p = new fimp();
        p.calling();
        p.checking();
        p.instagram();
        p.programming();
    }
}
