import java.util.Scanner;

public class Largest{
public static void main(String[]args){
 Scanner scanner=new Scanner(System.in);
System.out.println("Enter First Number:");
int a=scanner.nextInt();
System.out.println("Enter Second Number:");
int b=scanner.nextInt();
System.out.println("Enter Third Number:");
int c=scanner.nextInt();
int  m = (a < b) ? (b<c?c:b):(a<c?c:a);
System.out.println("Largest Number is "+m);
}
}
