package assignment_15;
class Car extends Thread{
    public void run(){
        System.out.println("CAR THREAD IS CALL");
    }
}
public class Q1_Resart_thread {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.start();
        car.interrupt();
        car.start();
    }
}
/*
When you restart a thread in Java, you are essentially interrupting the currently executing thread and then starting it again from the beginning of its run method.
To interrupt a thread, you can call the interrupt method on the thread instance.
This will set the thread's interrupt flag to true. However, it is important to note that this does not immediately stop the thread from running.
It is up to the thread to check its interrupt flag periodically and decide whether to exit gracefully.
Once you have interrupted the thread, you can start it again by creating a new instance of the thread class and calling the start method on it. This will cause the thread's run method to be called again from the beginning.
However, it is generally not a good idea to restart a thread in Java. Instead, it is better to create a new thread instance if you need to run the same task again. This is because a thread that has been interrupted may not be in a safe state to be restarted, and there may be other issues related to synchronization and resource allocation that could cause problems.
 */