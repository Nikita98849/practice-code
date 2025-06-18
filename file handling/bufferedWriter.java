import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter {
    public static void main(String str[])
    {
        try{
        BufferedWriter w=new BufferedWriter(new FileWriter("abc.txt"));

        try
        {
            w.write("Hi my name is nikita yadav.....");
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
