public class DoubleLinkedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Double Linked List Tester");
		System.out.println("Create, insert, and move test");
		GenDoubleLinkedList<String> dList = new GenDoubleLinkedList<String>();
		
		dList.insert("1");
		dList.insertNodeAfterCurrent("2");
		dList.goToNext();
		dList.insertNodeAfterCurrent("3");
		dList.goToNext();
		dList.insertNodeAfterCurrent("4");
		dList.goToNext();
		dList.showList();
		
		System.out.println("Previous and Deletion Test");
		dList.goToPrev();
		//System.out.println(dList.getDataAtCurrent());
		dList.deleteCurrentNode();
		dList.showList();
		
		System.out.println("In list test");
		System.out.println(dList.inList("2"));
		System.out.println(dList.inList("3"));
		
		System.out.println("Test Done");
	}



}
