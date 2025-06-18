import java.io.File;
import java.io.IOException;
public class renamefileName {
    public static void main(String str[])throws IOException
    {
              File f=new File("nikita","aaru.txt");
              File f1=new File("nikita","aarya.txt");

              if(f.exists())
              {
                System.out.println(f.renameTo(f1));
                
              }
              else
              {
                System.out.println("File does not exits.");
              }
       
    }
    
}
