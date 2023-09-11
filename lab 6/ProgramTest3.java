//java program to swap the two variable using third variable
public class ProgramTest3
{
    public static void swap( int x,int y)
    {
        int temp;
        temp=x;
        x=y;
        y=temp;
    }
    public static void main(String [] args)
    {
        int a=50;
        int b=10;
        System.out.println("Before swap:a="+a+"b=" + b);
        swap(a,b);
        System.out.println("After swap:a="+a+"b="+ b);
    }

}