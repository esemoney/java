/** working with filessssss 
java.io - old api used for file handling
java.nio - new api used for file handling

*/

import java.util.Scanner;
import java.io.File;

public class FileInfo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a file path:  ");
		String filePath = sc.nextLine();
		
		File file = new File(filePath);
		
		System.out.printf("FILE EXISTS: %b", file.exists());
	}
}