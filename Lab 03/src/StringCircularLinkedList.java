
/*
 * Douglas Wendel
 * CSCE 146
 * Feb 5-6, 2019
 * Lab 03
 */
public class StringCircularLinkedList{

	//Internal class
	private class ListNode
	{
		private int data; //instance variable -- i tried doing string like stated but changed to int
						  // why string if its numbered data?
		private ListNode link; //instance variable
		
		public ListNode(int aData, ListNode aLink) //constructor
		{
			data = aData;
			link = aLink;
		}
	}
	
	private ListNode head; //always points to the beginning of linked list
	private ListNode current; //moves around pointing to one of the nodes
	private ListNode previous; //one elemement behind the current
	private ListNode tail; // last element in the list link that points to head
	
	public StringCircularLinkedList()
	{
		head = current = previous = tail = null;
	}
	
	public void gotoNext()
	{
		if(current != null) 
		{
			previous = current;
			current = current.link;
		}
		if(current == null)
		{
			return;
		}
		
			
	}
	
	public void gotoPrevious()
	{
		if(previous != null)
		{
			current = previous;
			previous = previous.link;
		}
		
	}
	
	
	public int getDataAtCurrent()
	{
		if(current != null)
			return current.data;
		return 1;
	}
	
	public void setDataAtCurrent(int aData)
	{
		if(current != null)
			current.data = aData;
	}
	
	public void Insert(int aData)//inserts at the end
	{
		ListNode newNode = new ListNode(aData,null);
		if(head == null) //does head point to nothing and if this is correct then list is empty
		{
			head = newNode;
			current = head; //current = newNode
			return;
		}
		ListNode temp = head;
		while(temp.link != null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
	}
	
	public void insertAfterCurrent(int aData)
	{
		if(current == null)
		{
			return;
		}
		ListNode newNode = new ListNode(aData, current.link);
		current.link = newNode;
	}
	
	public void deleteCurrent()
	{
		if(current != null && previous != null) //current is not at the head
		{
			previous.link = current.link;
			current = current.link;
		}
		else if(current != null && previous == null)
		{
			head = head.link;
		}
		//if(current == tail)
		//{
			
		//}
		if(current == head)
		{
			tail.link = current.link;
			head = current.link;
			previous.link = current.link;
			current = current.link;
		}
	}
	
	public void print()
	{
		for(ListNode temp = head; temp != null; temp = temp.link)
		{
			System.out.println(temp.data);
		}
		System.out.println();
	}
		
	public boolean isinList(int aData)
	{
		current = head;
		if(current != null)
		{
			if(current.data == aData)
			{
				return false; 
			}
			current = current.link;
		}
		return true;
	}
	
	
	
	
	
	
	
	/*public void reset()
	{
		previous = null;
		current = head;
	}
	
	
	public boolean isContained(String aData) // is this data contained?
	{
		return search(aData) != null;
	}
	
	private ListNode search(String aData)
	{
		ListNode temp = head;
		while(temp != null)
		{
			if(temp.data.equals(aData))
				return temp;
			temp = temp.link;
		}
		return null;
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
