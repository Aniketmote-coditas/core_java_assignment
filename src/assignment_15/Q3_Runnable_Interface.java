package assignment_15;
class Demo implements Runnable{
    public void run(){
        System.out.println("run method is running");
    }
}
public class Q3_Runnable_Interface {
    public static void main(String[] args) throws InterruptedException {
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();
        Demo demo3 = new Demo();
        Thread t1 = new Thread(demo1);
        Thread t2 = new Thread(demo2);
        Thread t3 = new Thread(demo3);

        t1.start();
        t1.setPriority(10);
        t1.setName("aniket");

        t2.start();
        t2.setPriority(1);
        t2.setName("ani");
        t2.join();
        t1.join();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getState());
        System.out.println(t1.getThreadGroup());
        System.out.println(t1.isAlive());
    }
}
