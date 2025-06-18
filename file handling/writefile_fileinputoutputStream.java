import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class writefile_fileinputoutputStream {
    public static void main(String[] args)
     {
        try
        {
            FileInputStream f=new FileInputStream("nikita.txt");
            FileOutputStream f1=new FileOutputStream("anu.txt");
            try
        {
            int i;
            while ((i=f.read())!=-1) {
                System.out.print((char)i);
                f1.write(i);
                
            }
            System.out.println("read and write operations are complete");
        }
        finally
        {
            f.close();
            f1.close();
        }
        System.out.println("successfully wrote in a file");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

        }
        
}
    

