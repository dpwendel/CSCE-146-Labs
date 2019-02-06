/*
 * Douglas Wendel
 * CSCE 146
 * 1/30/2019
 */


//I tried to do this, could not figure it out. I did over 5 different ways in many different classes

import java.io.File;
import java.util.Scanner;
public class WordHelper {
	
	public static final String FILE_NAME = "./TextFiles/randomWords.txt"; //allows the program to read from the randomwords.txt file 

	public static String[] sortByVowels(String[] vowelSorted)
	{
		File file = new File(FILE_NAME); 
		Scanner scanner = new Scanner(FILE_NAME); //sets scanner as the file_name
		String vowels = "AEIOUaeiou"; //vowels, upper case and lower case
		int vowelAmount = 0; //amount of vowels, assign to i later
			
			for(int i = 0; i <vowels.length(); i++) //for loop to go from letter to letter and line to line
			{
				if(vowels.charAt(i) == 'a' ||
						//vowels.charAt(i) == 'A' ||
						vowels.charAt(i) == 'e' ||
						//vowels.charAt(i) == 'E' ||
						vowels.charAt(i) == 'i' ||
						//vowels.charAt(i) == 'I' ||
						vowels.charAt(i) == 'o' ||
						//vowels.charAt(i) == 'O' || 
						vowels.charAt(i) == 'u' ||
						//vowels.charAt(i) == 'U' || 
						vowels.charAt(i) == 'y')
						//vowels.charAt(i) == 'Y')
				{
					vowelAmount++; //adds the amount of 
					scanner.hasNextLine(); //next line
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
			}
			
			
		return null; 
	}
	
	public static String[] sortByConsonants(String[] conSorted)
	{
		//consonants are letters that are not vowels
		File file = new File(FILE_NAME);  //assigns file name
		Scanner scanner = new Scanner(FILE_NAME); //sets scanner as the file_name
		String vowels = "aeiou";//vowels - no capitals included
		int vowelAmount = 0; //amount of vowels, assign to i later
		int length = conSorted.length;
		int consonants = 0; //defualt consonants
			
			for(int i = 0; i < vowels.length(); i++) //for loop to go from letter to letter and line to line
				// do not use case sensative
			{
				if(vowels.charAt(i) == 'a' || //if a
						vowels.charAt(i) == 'e' || //if e
						vowels.charAt(i) == 'i' || //if i
						vowels.charAt(i) == 'o' || // if o
						vowels.charAt(i) == 'u' ||//if u
						vowels.charAt(i) == 'y') //if y 
				{
					vowelAmount++; //adds the amount of 
					if(vowelAmount < 1) //if vowel amount is greater than 1
					{
						vowelAmount -= length = consonants; //vowels are subtracted from length of the word
					}
				}
				
			}

			
		return null; 
	}

	public static String[] sortByLength(String[] lenSorted) {
		// TODO Auto-generated method stub
		
		int length = lenSorted.length; //length is sorted to the lensorted length
		
		String[] LengthOfWord = new String[length];
		
		int[] length1 = new int[length]; //array length
		
		for(int i = 0; i < length; i++)
		{
			//LengthOfWord[i] = lenSorted[i];
			int smallest = length; //sets the smallest word to length
			int minWord = i; //minimum word = i
			for(int j = i; j < LengthOfWord.length; j++)
			{
				if(length1[j] < smallest) //if the current word is longer than the smallest one then it stays
				{
					smallest = length1[j];
					minWord = j;
				}
				if(smallest < length1[i]) //if the smallest number is greater than the current length, it is then replaced. 
				{
					//swap
					String bla = LengthOfWord[i];
					length1[i] = length1[minWord];
					LengthOfWord[minWord] = bla;
				}
			}
		}		
		return null;
	}
}









































// Step one: Create if statement to calculate the first lines vowels. then go to line two. then continue until it ends. once it ends you then use sleection
// sort to calculate the smallest to the largest number of vowels and print out a list. 