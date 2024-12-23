class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
        System.out.println("I am a thread 1");
    }
}
class MyThreadRunnable2 implements Runnable{
//    public MyThreadRunnable2(String mama){
//        super(mama);
//    }
    public void run(){
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
        System.out.println("I am a thread 2");
    }
}
public class CWH_CH13_71_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 mt1 = new MyThreadRunnable1();
        Thread th1 = new Thread(mt1);
        MyThreadRunnable2 mt2 = new MyThreadRunnable2();
        Thread th2 = new Thread(mt2,"sai");
        th1.start();;
        th2.start();
        for (int i=0; i<10;i++) {
            System.out.println("Hi my name is sai krishna");
            System.out.println(th2.getName());
        }
    }
}
