class MyThread1 extends Thread{
    public MyThread1(String same){
        super(same);
    }
    @Override
     public void run(){
         int i = 1;
//        System.out.println(i);
        while (i<5){
            System.out.println("I am eating");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int j =1;
        while (j<40){
            System.out.println("I am running");
            j++;
        }
    }
}
public class CWH_CH13_70_thread {
    public static void main(String[] args) throws InterruptedException {
//        MyThread1 th1 = new MyThread1("sai");
//        MyThread2 th2 = new MyThread2();
//        th2.setName("krishna");
//        th1.run();
//        th1.start();
        String a = "sai krishna";
        String b = new String(a);
        System.out.println(a.equals(b));
//        System.out.println("sai krishna");
//        th1.join();
//        System.out.println("Kumar");
//        th2.start();
//        for (int i=0;i<40;i++){
//            System.out.println("I am breathing");
//        }
//        System.out.println(th2.getName());
//        System.out.println(th1.threadId());
    }
}
