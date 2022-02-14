package filehandling;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
       //Creating File
        File file=new File("text.txt");
//        try{
//                    file.createNewFile();
//                    System.out.println("File Created");
//        }
//        catch(IOException e)
//        {
//            System.out.println("Cannot creaate File");
//        }
        //Writing in File 
//try{
//            FileWriter filewr=new FileWriter("text.txt");
//           filewr.write("Pakistan is my Home Town");
//          filewr.close();
//          System.out.println("Sucessfully written");
//  }
//        catch(IOException e)
//        {
//            System.out.println("Cannot write in File");
//        }
//Reading From File
//        try{
//            FileReader filer=new FileReader("text.txt");
//            Scanner sc = new Scanner(filer);
//          while (sc.hasNextLine())
//            System.out.println(sc.nextLine());
//filer.close();
//        }
//        catch(IOException e)
//        {
//            System.out.println("Cannot write in File");
//        }
//Deleting File
file.delete();
System.out.println("File Deleted");
}
}
