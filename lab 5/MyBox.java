
class Box

{

int height,width,depth;

 

public void Dimension(int h,int w,int d)

{

height=h;

width=w;

depth=d;

}

 

public int Volume()

{

return height*width*depth;

}

 

public int Area()

{

return (2*(height*width+width*depth+depth*height));

}

}

 

public class MyBox

{

public static void main(String[] args)

{

Box b1=new Box();

b1.Dimension(6,9,8);

Box b2=new Box();

b2.Dimension(5,3,7);

int v1 = b1.Volume();

int a1 = b1.Area();

int v2 = b2.Volume();

int a2 = b2.Area();

 

System.out.println("Volume of Box 1 ="+v1);

System.out.println("Area of Box 1 ="+a1);

System.out.println("Volume of Box 2 ="+v2);

System.out.println("Area of Box 2 ="+a2);

 

}

}