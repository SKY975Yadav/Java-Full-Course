interface video{
    void play();
    void pause();
}
interface shorts extends video{
    void scroll();
    void doubleTapLike();
}
class youtube implements shorts{
    public void play(){
        System.out.println("Playing video");
    }
    public void pause(){
        System.out.println("pausing video");
    }
    public void scroll(){
        System.out.println("scrolling shorts");
    }
    public void doubleTapLike(){
        System.out.println("double tap on screen for like");
    }
}

public class CWH_58_inheritance_interface_and_polymorphism {
    public static void main(String[] args){
        video yt = new youtube();
       //yt.doubleTapLike();
        yt.pause();
    }
}
