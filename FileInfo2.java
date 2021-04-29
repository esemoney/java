import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class FileInfo2
{ 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file path:   ");
		String filePath = sc.nextLine();
		Path path = Paths.get(filePath);
		try
		{
			System.out.printf("FILE EXISTS: %b%n", Files.exists(path) );
			System.out.printf("FILE SIZE: %b%n", Files.size(path) );
			
		}
		
		catch(IOException e)
		{
			 System.out.println("Path does not exist.");
		}
		
	}
}