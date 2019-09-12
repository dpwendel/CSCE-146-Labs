/*
 * Douglas Wendel
 * CSCE 146
 * 1/29/2019
 */
import java.util.Scanner;
import java.io.*;

public class WordHelper {
	
	
	//sort by vowels
	
public static String readFromFile(String fileName)
{
	try {
		String vowels = "AEUIOUaeoiu";
		int vowelAmount = 0; 
		
		for(int i = 0; i <vowels.length(); i++)
		{
			if(vowels.charAt(i) == 'a' ||
					vowels.charAt(i) == 'A' ||
					vowels.charAt(i) == 'e' ||
					vowels.charAt(i) == 'E' ||
					vowels.charAt(i) == 'i' ||
					vowels.charAt(i) == 'I' ||
					vowels.charAt(i) == 'o' ||
					vowels.charAt(i) == 'O' || 
					vowels.charAt(i) == 'u' ||
					vowels.charAt(i) == 'U')
			{
				vowelAmount++;
			}
		}
	}
	catch(Exception e)
	{
		
	}
	return vowelAmount;
	
}
	

/*
 * 		while(scanner.hasNextLine())
		{
			String word = scanner.nextLine();
			
			for(int i = 0; i < file.length() - 1; i++)
			{
				switch(FILE_NAME.charAt(i))
				{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					while(scanner.hasNextLine())
					{
						vowelAmount++;
					}
					break;
 */


	
	//sort by Constants
	
	//sort by length

}




