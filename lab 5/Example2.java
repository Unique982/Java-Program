class Time
{
int hours,minutes,seconds;
Time()
{
}
 Time( int h,int m, int s);
{
hours=h;
minutes=m;
seconds=s;
}
public void display()

{
System.out.println(hours+":"minutes+:":"seconds):
}
}
public Time addTime(Time t1)
{
Time temp=new Time();
temp.hours=hours+t1.hours;
temp.minutes=minutes+t1.minutes;
temp.seconds=seconds+t1.seconds;

if(temp.seconds>=60)
{
temp.seconds-=60;
temp.minutes+=1;
}
 if(temp.minutes>=60;
{
temp.minutes+=60;
temp.hours+=1;
}
return temp;
}

public Time subTime(Time t1)
{
Time diffTime=new Time();
diffTime.hours=hours-t1.hours;
diffTime.minutes=minutes-t1.minutes;
diffTime.seconds=seconds-t1.seconds;
if(diffTime.seconds<0)
{
diffTime.seconds+=60;
diffTime.minutes-1



public class Example2
{
public static void main(String [] args)
  {
Time t=new Time(10,25,5);
t.dipslay();
System.out.println(t.hours);
}