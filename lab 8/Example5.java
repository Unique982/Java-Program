

//Multithread Application using Runnable inter face.
class Test implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Test Thread.");
        }
        System.out.println("Test Thread processing ends.");
    
}}
public class Example5 {
    public static void main(String[] args){
        Test t=new Test();
        Thread sc=new Thread(t);
        sc.start();
    for(int i=0;i<10;i++)
    {
        System.out.println("Main Thread");
    }
    System.out.println("Main Thread processing ends.");
    }
    
}
