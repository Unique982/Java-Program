

class fruit{
    String name;
    String taste;
    String size;
    public fruit(String name,String taste, String size){
        this.name=name;
        this.taste=taste;
        this.size=size;
        
    }
    void eat(){
        System.out.println(name+" Taste "+taste+".It is "+size+" in size.");
    }
}
class apple extends fruit{
    public apple(String name,String taste,String size){
        super(name,taste,size);
        
    }
    void displayapple(){
        eat();
    }
}
class orange extends fruit{
    public orange(String name,String taste,String size){
        super(name,taste,size);
        
    }
    void displayorange(){
        eat();
    }
}
public class FruitTaste {
    public static void main(String[] args){
        apple a=new apple("Apple","Sweet","Small");
        a.displayapple();
        orange o=new orange("Orange","Sour and Sweet","Medium");
        o.displayorange();
    }
     
}