/*
 * Douglas Wendel
 * CSCE 146
 * Lab 04
 * 2/13/2019
 */
public class GenDoubleLinkedList <T>{
	
	private class ListNode
	{
		private T data;
		private ListNode prevLink; //instance variable 
		private ListNode nextLink; //instance variable
		
		public ListNode( T xData, ListNode xPrevLink, ListNode xNextLink) //constructor - correct
		{
			data = xData;
			prevLink = xPrevLink;
			nextLink = xNextLink;
		}

	}
	//print out data
	
	private ListNode head; //First element of the list
	private ListNode curr; //current element of the list of interest
	
	public GenDoubleLinkedList()
	{
		curr = head = null;
	}
	
	public void goToNext() //goes to next
	{
		if(curr != null)
		{
			curr = curr.nextLink;
		}
	}
	
	public void goToPrev() //goes to the previous
	{
		if(curr == null)
		{
			return;
			//System.out.println(curr.data);
		}
		else if(curr != null)
		{
			curr = curr.prevLink;
		}
	}
	
	public T getDataAtCurrent() //gets data at current
	{
		if(curr != null)
		{
			return curr.data;
		}
		return null; //should this be return null?

	}
	public void setDataAtCurrent(T xData)
	{
		if(curr != null)
			curr.data = xData;
	}
	
	public void insert(T xData)
	{
		//creates the link that i am adding
		ListNode newNode = new ListNode(xData, null, null);
		if(head == null)
		{
			head = newNode;
			curr = head;
			return;
		}
		ListNode temp = head;
		while(temp.nextLink != null)
			temp = temp.nextLink;
		temp.nextLink = newNode;
	}
	
	public void insertNodeAfterCurrent(T xData)
	{
		if(curr == null)
		{
			return;
		}
		ListNode newNode = new ListNode(xData, null, null);
		curr.nextLink = newNode;
	}
	
	//listnode next node - store as temporary variables, 4 links are tethered in that need to be rerouted or destroyed that need to be set to null
	public T deleteCurrentNode()
	{
		/*if(curr != null && curr.nextLink != null && curr.prevLink != null) //this checks to see if it is in the middle
		{
			head.prevLink = curr.nextLink;
			curr = curr.nextLink;
		}
		else if(curr != null && curr.prevLink == null) //this means cur = head
		{
			head = head.nextLink;
		}
		/*else if(curr!= null & curr.nextLink == null)
		{
			head = head.prevLink;''
		}
		/*if(curr == head)
		{
			head = curr.nextLink;
		}*/
		if(head == null)
			return null;
		T ret = head.data;
		head = head.nextLink;
		return ret;
	}
	
	public void showList()
	{
		
		/*for(ListNode temp = head; temp != null; temp = temp.nextLink)
			System.out.println(temp.data);
		System.out.println();
		 */
		
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.nextLink;
		}
	}
	
	public boolean inList(T xData)
	{
		curr = head;
		if(curr != null)
		{
			if(curr.data == xData)
			{
				return true;
			}
		curr = curr.prevLink;
		}
		return false;			
	}
}
