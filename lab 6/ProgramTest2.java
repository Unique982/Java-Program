// Find factorial and nth fibonacci term using recursive function
import java.util.Scanner;

class Calc
{
    public int factorial(int x)
    {
        if(x==1)
        {
            return 1;
        }else{
            return (x*factorial(x-1));
        }
    }

    public int fibo(int x)
    {
        if(x==0 || x==1)
        {
            return x;
        }else{
            return (fibo(x-1)+fibo(x-2));
        }
    }
}

public class ProgramTest2{
    public static void main(String [] args)
    {
        System.out.println("Enter n'th term : ");
        int nth = new Scanner(System.in).nextInt();
        Calc c1 = new Calc();
        
        System.out.println("Factorial of "+nth+" is : "+c1.factorial(nth));
        System.out.println(nth+"th term of Fibonacci series is: "+c1.fibo(nth));

    }
}
