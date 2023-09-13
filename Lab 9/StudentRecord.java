//Write java program to save 3 student record (such as Roll, name, address, and phone Number) into file student.tst and display the student record whose address is Kritipur.
package eventhandlingexample;
import java.io.*;
class Student implements Serializable
{
    int roll;
        String name;
        String address;
        String number;
    public Student(int r,String n, String a, String nu)
    {
        roll=r;
        name=n;
        address=a;
        number=nu;
    }


}

public class StudentRecord {
    public static void main(String [] args) throws Exception
    {
        Student std [] = new Student[]
                        {
                            new Student(1, "Khem Raj Neupane", "Dang", "9809559560"),
                            new Student(2, "Unique Neupane", "Kritipur", "9823135679"),
                            new Student(3, "Arjun Bhusal", "Pokhara", "9868433788")
                        };
        
        FileOutputStream fo = new FileOutputStream("Students.txt");
        ObjectOutputStream ou = new ObjectOutputStream(fo);
        ou.writeObject(std);
        fo.close();
        ou.close();

        Student stdIn[] = new Student[3];
         FileInputStream fi = new FileInputStream("Students.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);
        stdIn = (Student[])oi.readObject();
        for(int i=0;i<stdIn.length;i++)
        {
            if(stdIn[i].address.equals("Kritipur"))
            {
                System.out.println("Student "+i+" : ");
                System.out.println("Name : "+stdIn[i].name);
                System.out.println("Roll : "+stdIn[i].roll);
                System.out.println("Address : "+stdIn[i].address);
                System.out.println("Phone : "+stdIn[i].number);
            }
            
        }
        
        
    }
}
