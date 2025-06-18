import java.io.FileWriter;
import java.io.IOException;

public class WritefileCode {
    public static void main(String str[])
    {
        try{
        FileWriter w=new FileWriter("nikita.txt");

        try
        {
            w.write("Java Programming language is best language....!!!!");
        }
        finally
        {
            w.close();
        }
        System.out.println("successfully wrote in a file");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
    
}
