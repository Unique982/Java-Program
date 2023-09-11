import java.util.Scanner;
public class Swap{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int b=scanner.nextInt();
        System.out.println("the unswapped variables are:"+a+" "+b);
        int c= a;
        a=b;
        b=c;
        System.out.println("the Swapped variables are:"+a+" "+b);
    }
}