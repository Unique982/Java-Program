
/*Write a java program to demonstrate the concept of synchronization on multithreaded application.*/
class printString{
    public synchronized void display(){
        try{
            System.out.print("Java is ");
            Thread.sleep(5000);
            System.out.println(" Object Oriented Programming.");
        
        }catch(InterruptedException ex)
        {
            System.out.println(ex);
        }
    }
}
class callerThread extends Thread
{
    printString ps;
    public callerThread(printString p){
        this.ps=p;
    }
    public void run(){
        ps.display();
    }
}
public class Example6 {
    public static void main(String[] args){
        printString p1=new printString();
        callerThread t1=new callerThread(p1);
        callerThread t2=new callerThread(p1);
        t1.start();
        t2.start();
    }
    
}
