class IamThread1 extends Thread{
    public void run(){
        int i  = 0;
        while(i<50){
            System.out.println("I am  from thread 1");
//            try {
//                sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            i++;
        }
    }
}
class IamThread2 extends Thread{
    public void run(){
        int i  = 0;
        while(i<50){
            System.out.println("I am  from thread 2");
//            try {
//                sleep(150);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            i++;
        }
    }
}
public class CWH_CH13_methods {
    public static void main(String[] args) throws InterruptedException{
        //throw new RuntimeException();
        IamThread1 it1 = new IamThread1();
        Thread th1 = new Thread(it1);
        IamThread2 it2 = new IamThread2();
        Thread th2 = new Thread(it2);
        //System.out.println(th1.getState())
//        th2.setPriority(10);
        th1.setPriority(1);
        th1.start();
        //th1.interrupt();
        //th1.join(200);
        th2.start();
//        System.out.println(th1.getThreadGroup());
//       // System.out.println(th1.getContextClassLoader());
//        System.out.println(th1.getUncaughtExceptionHandler());
        //th1.setDaemon(true);
        System.out.println(th1.isDaemon());
        System.out.println(th1.getName());

//        System.out.println( th1.isAlive());
//        System.out.println(th1.isInterrupted());
//        System.out.println(th2.isInterrupted());


        //System.out.println(th1.getState());
        th1.wait();
//        th2.start();
        th1.notify();
        //th1.join();

    }
}
