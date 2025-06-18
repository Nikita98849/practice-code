import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String arg[]) throws IOException
    {
    File f=new File("D:\\Java full stack developer\\practice code\\file handling\\nikita.txt");

    if(f.createNewFile())
    {
        System.out.println("File successfully created....!!!");
        
    }

    else
    {
        System.out.println("File not created....!!!");
    }
  
  
    
    }
}
