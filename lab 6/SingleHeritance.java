class Person{
    String name,address;

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
        address=a;

    }
    public String getAddress()
    {
        return address;
    }
}
class Student extends Person{
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

public class SingleHeritance
{
    public static void main(String[]args)
    {
        Student s1=new Student();
        s1.setRoll(19);
        s1.setName("Khem Raj Neupane");
        s1.setAddress("KTM");

        System.out.println("Roll="+s1.getRoll());
        System.out.println("Name="+s1.getName());
        System.out.println("Address="+s1.getAddress());

    }
}