interface Calculator{
 void display();
}
class Addition implements Calculator{
    int a;
    int b;
    public Addition(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println("The Addition Value is :"+(a+b));
    }
}
class Subtraction implements Calculator{
    int a;
    int b;
    public Subtraction(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println("The Subtraction Value is :"+(a-b));
    }
}
class Multiplication implements Calculator{
    int a;
    int b;
    public Multiplication(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println("The Multiplication Value is :"+(a*b));
    }
}
class Division implements Calculator{
    int a;
    int b;
    public Division(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println("The Division Value is :"+(a/b));
    }
}
public class CalculatorApplication{
    public static void main(String[] args){
        Calculator c=new Addition(25,10);
        c.display();
        Calculator d=new Subtraction(25,10);
        d.display();
        Calculator e=new Multiplication(25,10);
        e.display();
        Calculator f=new Division(30,5);
        f.display();
    }
}