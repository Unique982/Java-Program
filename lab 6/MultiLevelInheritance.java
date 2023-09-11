//java program to demonstrate multilevelheritance
class Person{
    protected String name,address;

    public void setName(String n)
    {
        name=n;

    }
    public String getName()
    {
        return name;
    }

    public void setAddress(String a)
    {
        address =a;
    }
    public String getAddress()
    {
        return address;
    }
}
    class Student extends Person
    {
        int roll;
        public void setRoll(int r)
        {
            roll=r;

        }
        public int getRoll()
        {
            return roll;
        }


    
}
class CollegeStudent extends Student
{
    String Cname;
    public void setCname(String c)
    {
        Cname=c;
    }
    public String getCname()
    {
        return Cname;
    }
}  
public class MultiLevelInheritance
{
    public static void main(String[]args)
    {
        CollegeStudent s1=new CollegeStudent();
        s1.setRoll(19);
        s1.setName("KhemrajNeupane");
        s1.setAddress("KTM");
        s1.setCname("RR Campus");
    
    System.out.println("Student Roll="+s1.getRoll());
    System.out.println("Student Name="+s1.getName());
    System.out.println("Student Address="+s1.getAddress());
    System.out.println("Student campus="+s1.getCname());
    }

    

}
    

    
