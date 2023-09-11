class Person {
    String name,address;
public void setName(String n){
    name=n;
}
public String getName(){
    return name;
}
public void setAddress(String a){
    address=a;
}
public String getAddress(){
    return address;
}
}
class Student extends Person{
    int roll;
    public void setRoll(int r)
    {
        roll=r;
    }
    public int getRoll(){
        return roll;
    }
}

class Employee extends Person{
    int eid;
    public void setEid(int e)
    {
        eid=e;
    }
    public int getEid()
    {
        return eid;
    }
}

public class Hierarchical{
    public static void main(String[] args)
    {
        CollegeStudent s1=new CollegeStudent();
        s1.setRoll(1);
        s1.setName("anjali");
        s1.setAddress("Ktm");
        s1.setCname("RR Campus");
        System.out.println("Student Roll="+s1.getRoll());
        System.out.println("Student Name="+s1.getName());
        System.out.println("Student Address="+s1.getAddress());
        System.out.println(".........................");

        Employee e1=new Employee();
        e1.setEid(2);
        e1.setName("Sita");
        e1.setAddress("Pkr");
        System.out.println("Employee ID="+e1.getEid());
        System.out.println("Employee Name="+e1.getName());
        System.out.println("Employee Address="+e1.getAddress());
    }
}
