import java.io.IOException;

class simpleCode
{
    public static void main(String arg[])throws IOException
    {
        System.out.println("output stream");
        System.err.println("error stream");

         int i=System.in.read();
         System.out.println((char)i);

    }
}