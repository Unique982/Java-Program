public class Example1
{
public static void main (String[] args)
  {
int [] arr=new int[]{15,20,25,27,19,56};
int max=arr[0],min=arr[0];

for( int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
if(arr[i]<min)
{
min=arr[i];
}
}
System.out.println("Max:"+max);
System.out.println("Min:"+min);
}
}