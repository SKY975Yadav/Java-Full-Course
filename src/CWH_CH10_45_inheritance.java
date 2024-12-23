class Animal{
    String sound;
public void live1(){
    System.out.println("Animals are living in forest ");
}
}
class cat extends Animal{
   private String voice;

    public String getVoiceCat() {
        super.sound = "meou,meou..";
        System.out.println("I am cat, My voice is : ");
        return sound;
    }

    public void setVoiceCat(String voice) {
        this.voice = voice;
    }
}
class dog extends cat{
    private  String voice;
    public String getVoiceDog() {
        super.sound = "bhou,bhou,...";
        System.out.println("I am Dog,My voice is : ");
        return sound;
    }
    public void setVoiceDog(String voice) {
        this.voice = voice;
    }
}
public class CWH_CH10_45_inheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.live1();
        d.setVoiceDog("Bhov,bhov....");
        d.setVoiceCat("Meou,meou,....");
        System.out.println(d.getVoiceDog());
        System.out.println(d.getVoiceCat());
    }
}
