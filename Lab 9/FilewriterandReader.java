//Write a java program to write and Read file using File Writer and FileReader class

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterandReader {
 public static void main(String[]args) throws IOException{
    FileWriter fw= new FileWriter("FilewriterandReader.txt");
    String str= "Java is OOP";
    fw.write(str);
    fw.close();

    FileReader fr=new FileReader("FilewriterandReader.txt");
    int i=0;
    while((i=fr.read())!=-1){
        char c= (char)i;
        System.out.print(c);
    }
    fr.close();
 }   
}
