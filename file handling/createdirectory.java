import java.io.File;
import java.io.IOException;

class createdirectory
{
    public static void main(String[] args)throws IOException
    {

        //create file
        File f=new File("anu.txt");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());   


        //create directory
        File f1=new File("nikita");
        System.out.println(f1.exists());
        f1.mkdir();
        System.out.println(f1.exists());

        //create a file inside the directory
        File f2=new File("nikita","aaru.txt");
        f2.createNewFile();
    }
}
