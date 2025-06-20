package JavaFullStack;
import java.io.File;


public class deleteFile {

	public static void main(String[] args) {
		File file=new File("example.txt");
		if(file.delete())
		{
			System.out.println("Deleted the File :"+file.getName());
			
		}
		else
		{
			System.out.println("Failed to delete the file");
		}
		
	}

}
