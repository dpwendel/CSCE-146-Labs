
public class MainM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StrBSTree<String>sbt = new StrBSTree<String>();
		
		System.out.println("Testing the tree\n\nInserting 10 words."); //welcome statement
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
		
		//inserts Strings
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
		
		
		//prints pre-order
		System.out.println("Printing pre-order");
		sbt.printPreOrder(); //preorder
		System.out.println(); //extra space
		
		//removes the word food
		System.out.println("Removing the word food");
		sbt.remove("food");
		sbt.printPreOrder();
		System.out.println();
		
		//prints depth
		sbt.getDepth("TWIRLIEST");
		//System.out.println("The depth of TWIRLIEST is "+sbt.getDepth(3));
	}

}
