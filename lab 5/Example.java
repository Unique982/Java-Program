public class Example
{
public static void main(String[] args)
{
int[][] mar1=new int[][]{{7,8,9},{1,2,3},{4,5,6}};
int[][] mar2=new int[][]{{4,5,6},{7,8,9},{1,2,3}};
int[][] add=new int[3][3];

 for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
  {
add[i][j]=mar1[i][j]+mar2[i][j];
}
}
System.out.println("Addition of two matrices");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(add[i][j]+" ");
}
System.out.println();
}
int[][] mul=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
for(int k=0;k<3;k++)
{
mul[i][j]+=mar1[i][k]*mar2[k][j];
}
}
}
System.out.println("Multiplication of two matrices");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(mul[i][j]+" ");
}
System.out.println();
}
}
}

