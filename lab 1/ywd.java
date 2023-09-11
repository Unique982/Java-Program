public class ywd {
    public static void main(String args[]){
        int n=Integer.parseInt(args[0]);
        int y=n/365;
	int w=(n-y*365)/7;
	int d=(n-(y*365)-(w*7));
        System.out.println("the year is"+ y);
	System.out.println("the week is"+ w);
System.out.println("the days is"+ d);
    }
}