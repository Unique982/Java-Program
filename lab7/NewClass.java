

public class NewClass {
    int Eid;
    String Ename;
    String Eaddress;
    int Salary;
    public NewClass(int E,String N,String A,int S){
        Eid=E;
        Ename=N;
        Eaddress=A;
        Salary=S;
    }
    void display(){
        System.out.println("Employee Id:"+Eid);
        System.out.println("Employee name="+Ename);
        System.out.println("Employee Address="+Eaddress);
        System.out.println("Salary of the employee="+Salary);
    }
    
}