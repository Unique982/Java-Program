public class Peri
{
public static void main(String[]args)
{
float length=Float.parseFloat(args[0]);
float breadth=Float.parseFloat(args[1]);
float area,peri;
area=length*breadth;
peri=(2*length)+(2*breadth);

System.out.printf("The area is "+area);
System.out.println("The perimeter is "+peri);
}
}