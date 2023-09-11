//java program to demonstrate two variable using variable refrence.
public class ValRef
{
    int a,b;
    public ValRef(int a,int b)
    {
        this.a=a;
        this.b=b;

    }
    public void swapref(ValRef  obj)
    {
        int temp;
        temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;

    }
    public static void main(String[]args)
    {
    ValRef vr=new ValRef(40,30);
    System.out.println("Before swap a="+vr.a+" b="+vr.b);
    vr.swapref(vr);
    System.out.println("After swap a="+vr.a+" b="+vr.b);
    }
}