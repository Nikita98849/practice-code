package JavaFullStack;
import java.io.File;
import java.io.IOException;

public class readFile {

	public static void main(String[] args) {
		try {
			File file=new File("example.txt");
			if(file.createNewFile())
			{
				System.out.println("File Created :"+file.getName());
			}
			else
			{
				System.out.println("File already existed");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occurred");
		}

	}

}
