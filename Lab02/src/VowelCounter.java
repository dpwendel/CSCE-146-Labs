/*
 * Douglas Wendel
 * Lab 02
 * CSCE 146
 * 1/29/2019
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class VowelCounter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		File file = new File("./TextFiles/randomWords.txt");
		
		Scanner scanner = new Scanner(file);
		
		//establishes variables
		
		String vowels = "AEUIOUaeoiu";
		int vowelAmount = 0; 
		
		while(scanner.hasNextLine()) {
			String word = scanner.nextLine();
			
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
					//vowelAmount += scanner.nextInt();
					vowelAmount++;
				}
			}
			
			/*instead of an if statement do i do a switch statement? switch including each
			 * vowel and next lining once the vowels arent left in the word?
			 */
			
			
			
			
		}


		
		
		
		
		
		
		
		
		
		
		
	}

}
