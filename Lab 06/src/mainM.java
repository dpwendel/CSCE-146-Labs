/*
 * Douglas Wendel
 * CSCE 146
 * Homework 06
 */

//main method
import java.util.Scanner;
public class mainM {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter any number of stringsd and i will sort by BORT's. Once you're done entering sentences enter quit");
		//loop allows user to insert what ever strings they want until they have typed quit
		String userInput = key.nextLine();
		Boolean boo = true;
		while(boo == true)
		{
			userInput = new String();
			userInput = key.next();
			if(userInput.equalsIgnoreCase("quit"))
			{
				boo = false;
			}
			else
			{
				//define a new object
				//object == userInput
			}
		}
		
		System.out.println("BORT Sorted!!!");
		//this is where the sorted strings are printed out

	}

}
