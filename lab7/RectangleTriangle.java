class shape{
 void displayarea(){
System.out.println("The area of shape:");
}}
class triangle extends shape{
    float base;
    float height;
public triangle(float base,float height){
    this.base=base;
    this.height=height;
   
}
void displayarea(){
float area=(1.0f/2.0f)*base*height;
System.out.println("The area of triangle is "+area);

}}
class rectangle extends shape{
    float length;
    float breath;
public rectangle(float length,float breath){
    this.length=length;
    this.breath=breath;
   
}
void displayarea(){
float area=length*breath;
System.out.println("The area of rectangle is "+area);

}}

public class RectangleTriangle {
    public static void main(String[] args){
        rectangle r =new rectangle(9.0f,3.0f);
        triangle t=new triangle(12.0f,4.0f);
        r.displayarea();
        t.displayarea();
        
    }
}
