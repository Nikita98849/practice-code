import java.io.File;
import java.io.IOException;

public class fileInformation {
    public static void main(String arg[]) throws IOException
    {
    File f=new File("D:\\Java full stack developer\\practice code\\file handling\\nikita.txt");

    if(f.exists())
    {
        System.out.println("File successfully created....!!!");
        System.out.println("File Read or not :"+f.canRead());
        System.out.println("File write or not :"+f.canWrite());
        System.out.println("Totle size of file :"+f.length());
       // System.out.println("File is deleted :"+f.delete());
        
    }

    else
    {
        System.out.println("File not created....!!!");
    }
  
  
    
    }
}