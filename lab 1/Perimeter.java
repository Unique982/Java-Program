public class Perimeter {
    public static void main(String args[]){
        int l=Integer.parseInt(args[0]);
	  int b=Integer.parseInt(args[1]);
        int a=(l*b);
	  int p=2*(l+b);	
        System.out.println("the area of the rectangle "+ a);
	System.out.println("the perimeter of the rectangle is "+ p);
    }
}