// Program to implement the concept of Method Overloading
class Adder
{
    public int getSum(int x, int y)
    {
        return (x+y);
    }
    public double getSum(double x, double y)
    {
        return (x+y);
    }
}
public class ProgramTest {
    public static void main(String [] args)
    {
        Adder a1 = new Adder();
        System.out.println("Sum of 20 and 20 is:" +a1.getSum(20, 20));
        System.out.println("Sum of 10.5 and 20.5 is:" +a1.getSum(10.5, 20.5));
    }
    
}
