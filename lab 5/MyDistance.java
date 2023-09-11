class Distance

{

private int feet,inch;

public Distance()

{

}

 

public Distance(int f,int i)

{

feet=f;

inch=i;

}

 

public Distance addDistance(Distance d1)

{

Distance temp= new Distance();

temp.feet= feet+d1.feet;

temp.inch= inch+d1.inch;

 

if(temp.inch>=12)

{

temp.feet+=1;

temp.inch-=12;

}

return temp;

}

public void displayDistance()

{

System.out.print(feet +" ft "+inch+" inch");

}

}

public class MyDistance

{

public static void main(String[] args)

{

Distance d1= new Distance(6,8);

Distance d2=new Distance(5,9);

Distance d3=d1.addDistance(d2);

 

System.out.print("First Distance:");

d1.displayDistance();

System.out.print("\nSecond Distance:");

d2.displayDistance();

System.out.print("\nResultant Distance:");

d3.displayDistance();

}

}