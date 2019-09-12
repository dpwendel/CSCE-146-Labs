/*
 * Douglas Wendel
 * CSCE 146
 * Feb 5-6, 2019
 * Lab 03
 */

public class Tester {

	public static void main(String[] args) {
		
		StringCircularLinkedList all = new StringCircularLinkedList();
		
		for(int i = 1; i < 4; i++)
		{
			all.Insert(i);
		}
		
		all.Insert(4); //create and inserts adding values 1-4				//WORKS
		System.out.println();//break
		all.print();
		
		all.gotoNext(); //moving current once
		all.gotoNext(); //moving current twice					//WORKS
		all.deleteCurrent(); //deletes the current
		System.out.println();//break
		all.print();
		
		System.out.print(all.isinList(4));
		System.out.println();

		
		System.out.print(all.isinList(3));
		//system.out.println("False"); - correct answer
		System.out.println();

		all.gotoNext();
		int tempDataAtCurrent = all.getDataAtCurrent() + 10;
		all.setDataAtCurrent(tempDataAtCurrent);//need to add the data at current by 10 (should be 14) 			//WORKS
		System.out.println();//break
		all.print();//print
		
		
		
		//this is not working because it is at the end, and it will not
		//loop back to the beginning, or head number. The tail is staying 
		//the tail and not allowing all.gotoNext to happen. I am unable to 
		//figure out how to make this work. 
		all.gotoNext();//moves current once
		all.deleteCurrent(); //deletes new current		
		all.print();
		
		//gotoPrevious works fine, but since the one before this is not working 
		//that is making this one not correctly work. I can make the previous one
		//correct by doing a gotoPrevious but i am unable to then loop a previous
		//movement from the head which would reassign the current to the tail. 
		all.gotoPrevious();
		all.deleteCurrent();		//not working
		all.print();
		System.out.println();
		
		System.out.println("Test Done");

		
		//all.gotoPrevious();//moving current back
		//all.deleteCurrent(); //deletes current
		//all.print();//print
		//System.out.println();
		
		//all.gotoPrevious();
		//all.gotoNext();
		//all.deleteCurrent();
		//all.print();
				
		
		
		/*
		 * go to next does nto work
		 * go to previous does work
		 * everything else works
		 * it needs to go from tail to head
		 */
		
		
		
		
		
		
		
		
		
	}

}
