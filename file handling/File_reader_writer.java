import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_reader_writer {
    public static void main(String[] args)
     {
        try
        {
            FileReader f=new FileReader("nikita.txt");
            FileWriter f1=new FileWriter("anu.txt");
            try
        {
            int i;
            while ((i=f.read())!=-1) {
                System.out.print((char)i);
                f1.write(i);
                
            }
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
    

