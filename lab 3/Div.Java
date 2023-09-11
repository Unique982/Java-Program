//Write a java program to check input number is even and divisible by 3.
import java.util.*;
public class Div
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter any number:");
int k=sc.nextInt();
if(k%2==0 && k%3==0)
{
System.out.println("The number you enter is even and Divisible by 3.");
}
else if (k%2==0)
{
System.out.println("The number you entered is even but not divisible by 3.");
} 
else if(k%3==0)
{
System.out.println("The number is not even but is divisible by 3."); 
}
else
{
System.out.println("The number is neither even nor divisible by 3.");
}
}
}
