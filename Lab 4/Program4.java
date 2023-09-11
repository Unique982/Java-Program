import java.util.*;
public class Program4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any character:");
char ch=sc.next().charAt(0);
switch(ch)
{
case'a':
case'A':
case'e':
case'E':
case'i':
case'I':
case'o':
case'O':
case'u':
case'U':
System.out.println("given character is vowel");
break;
default:
System.out.println("given character is constant");
break;
}
System.out.println("end of program");
}
}