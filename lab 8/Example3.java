class MyThread extends Thread {

    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
    }
}

public class Example3 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        // Set thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY);  
        thread2.setPriority(Thread.MAX_PRIORITY);   
        
        // Get thread priorities
        int priority1 = thread1.getPriority();
        int priority2 = thread2.getPriority();
        
        System.out.println("Thread 1 priority: " + priority1);
        System.out.println("Thread 2 priority: " + priority2);
        
        thread1.start();
        thread2.start();
    }
}
