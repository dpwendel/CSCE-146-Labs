/*
 * Douglas Wendel
 * CSCE 146
 * Lab 07
 */
import java.util.Scanner;
public class Tester {

	public static Scanner keyboard = new Scanner(System.in);//global scanner\
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StrBSTree<String>sbt = new StrBSTree<String>();
		
		System.out.println("Testing the tree\n\nInserting 10 words.");
		System.out.println("");
		
		System.out.println("Inserting: buzzwigs\n"
				+ "Inserting: ABBREVIATIONS\n"
				+ "Inserting: Cat\n"
				+ "Inserting: food\n"
				+ "Inserting: abovementioned\n"
				+ "Inserting: ABSORBABILITIES\n"
				+ "Inserting: VOLATILITY\n"
				+ "Inserting: I\n"
				+ "Inserting: TWIRLIEST\n"
				+ "Inserting: at\n");
		
		sbt.insert("buzzwigs");
		sbt.insert("ABBREVIATIONS");
		sbt.insert("CAT");
		sbt.insert("food");
		sbt.insert("abovementioned");
		sbt.insert("ABSORBABILITIES");
		sbt.insert("VOLATILITY");
		sbt.insert("I");
		sbt.insert("TWIRLIEST");
		sbt.insert("at");
		
		
		
		System.out.println("Printing pre-order");
		sbt.printPreOrder();
		
		
		
		
		
		
		

		
	}

}
