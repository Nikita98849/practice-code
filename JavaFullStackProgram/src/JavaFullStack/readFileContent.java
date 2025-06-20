package JavaFullStack;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class readFileContent {

	public static void main(String[] args) {
	try
	{
		File file=new File("example.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			String data=sc.nextLine();
			System.out.println(data);
		}
		sc.close();
	}
	catch(FileNotFoundException e)
	{
		System.out.println("An error occurred");
		e.printStackTrace();
	}

	}

}
