//Write a java program to write a sentence «Java is Obiect oriented programming" using FileOutputStream class and Read this file usingFileInputStream class and find total number of vowel in the file.


import java.io.*;
public class Vowel{
    public static void main(String[]args)throws IOException, ClassNotFoundException{
        
        FileOutputStream fout=new FileOutputStream("Vowel.txt");
         String str="Java is Object Oriented Programing";
        byte[] bs=str.getBytes();
        fout.write(bs);    
        fout.close();
        
        FileInputStream fin=new FileInputStream("Vowel.txt");
       int i=0,x=0;
        while((i=fin.read())!=-1){
            char c= (char)i;
            System.out.print(c);
            char c1 = Character.toLowerCase(c);
            if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'){
               x++;
            }
        }
             System.out.println("");
        System.out.println("Vowels:"+x);
        fin.close();
    }
}
