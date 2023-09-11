// Write a java program to check wheather input alphabet is vowel or consonant using Switch case statement
import java.util.*;
public class Consonant
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter any alphabet.");
char k=sc.next().charAt(0);
switch(k)
{
case 'a':
case 'A':
case 'e':
case 'E':
case 'i':
case 'I':
case 'o':
case 'O':
case 'u':
case 'U':
System.out.println("Entered Character is Vowel.");
break;
default:
System.out.println("Entered Character is Consonent.");
break;
}
}
}
