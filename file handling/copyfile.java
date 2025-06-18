import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfile {
    public static void main(String[] args)
     {
        try
        {
            FileInputStream f=new FileInputStream("nikita.txt");
            FileOutputStream f1=new FileOutputStream("xyz.txt");
            try
        {
            int i;
            while ((i=f.read())!=-1) {
                f1.write(i);
                
            }
            System.out.println("data copied successfully/...!!");
        }
        finally
        {
            f.close();
            f1.close();
        }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

        }
    
}
