//problem 1 & 2
abstract  class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    void write(){
        System.out.println("writing");
    }
    void refill(){
        System.out.println("refilling");
    }
    void changeNib(){
        System.out.println("changing nib");
    }
}
//problem 3 & 5
class monkey {
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Bitten");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal {
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
//problem4
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartTelephone extends Telephone{
    void ring(){
        System.out.println("Ringing");
    }
    void lift(){
        System.out.println("lift the phone");
    }
    void disconnect(){
        System.out.println("Disconnect the call");
    }
    void videoCall(){
        System.out.println("Video call");
    }
}
//problem 6 & 7
interface TvRemote{

    void buttons();
    void range();
}
interface SmartTvRemote extends TvRemote{
    void torch();
}
class TV implements SmartTvRemote{
    public void buttons(){
        System.out.println("Buttons sre working ");
    }
    public  void range(){
        System.out.println("30 meters in smart tv");
    }
    public void torch(){
        System.out.println("torch on");
    }
}
public class CWH_60_practice11 {
    public static void main(String [] args){
        TvRemote tvs = new TV();
        tvs.buttons();
        //problem 1 & 2
        fountainPen p = new fountainPen();
        p.refill();
        p.changeNib();
        p.write();
        //problem 3 & 5
        human sai = new human();
        sai.bite();
        sai.jump();
        sai.eat();
        sai.sleep();
        //problem 4
        smartTelephone tp =new smartTelephone();
        tp.videoCall();
        tp.disconnect();
        tp.lift();
        tp.ring();
        //problem 6 & 7
//       SmartTvRemote tv = new TV();
//        tv.torch();
//        tv.buttons();
//        tv.range();
    }
}
