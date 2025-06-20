package JavaFullStack;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {

	public static void main(String[] args) {
		try
		{
			FileWriter writer=new FileWriter("D:\\JAVAFullStack\\examples.txt");
			FileWriter writers=new FileWriter("example.txt");
			writer.write("Hello , this is a text file.\n Welcome to java File Handling!");
			writer.close();
			writers.write("Hello , this is a text file.\n Welcome to java File Handling!");
			writers.close();
			System.out.println("Successfully wrote to the file");
		}
		catch(IOException e)
		{
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		

	}

}
