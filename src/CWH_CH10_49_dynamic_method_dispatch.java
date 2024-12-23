class Phone{
    public Phone(){
        System.out.println("I am a phone");
    }
    public  void time(){
        System.out.println("I will show you Time ");
    }
    public void on(){
        System.out.println("Turn  on phone ");
    }
}class  SmartPhone extends Phone{
    public  SmartPhone(){
        System.out.println("I am smart phone");
    }
    public void on(){
        System.out.println("Turn on SmartPhone");
    }
    public  void music(){
        System.out.println("Playing music");
    }
}
public class CWH_CH10_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        //SmartPhone obj1 =new SmartPhone();
        obj.time();
        obj.on();
        //obj.music();
    }
}
