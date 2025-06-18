import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class bufferedreader {
    public static void main(String[] args) {
        
        try 
        {
            BufferedReader r = new BufferedReader(new FileReader("abc.txt"));
            String s;
            while ((s = r.readLine()) != null)
            {
                System.out.println(s);
            }
            r.close();
        
        }
            catch(IOException e)
            {
                    System.out.println("Failed to close the reader: " + e.getMessage());
            }
    }
}