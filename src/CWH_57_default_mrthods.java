interface Phone2{
    void calling();
    void dateAndTime();
    private void turnOn(){
        System.out.println("turn on");
    }
    default void turnoff(){//Default method
        turnOn();
        System.out.println("turn off");
    }
}
interface SmartPhone2{
    void videoCall();
    void instagram();
}
interface Laptop1{
    void programming();
}
class impl implements Phone2,SmartPhone2{
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
class fimpl extends imp implements Laptop{
    @Override
    public void programming() {
        System.out.println("programming in laptop");
    }
}
public class CWH_57_default_mrthods {
    public static void main(String[] args) {
        Phone2 ph = new impl();
        ph.turnoff();
        ph.calling();
        SmartPhone2 sp2 = new impl();

    }
}
