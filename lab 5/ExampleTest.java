 public class ExampleTest
{
    public static void main(String[]args)
    {
        int [][] arr=new int[][]{
        new int[]{9,8,7,6},
        new int[]{5,6,7},
        new int[]{7,8,9}
    };

int i,j;
for(i=0;i<arr.length;i++)
{
int sum=0;
for(j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]+" ");
    sum+=arr[i][j];
}
System.out.println("sum of row"+(i+1)+":"+sum);
}
}
}