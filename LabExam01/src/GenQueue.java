/*
 * Douglas Wendel
 * CSCE 146
 * LabExam01
 */

public class GenQueue <T>{
	
	private class ListNode
	{
		private T data; //instance variable
		private ListNode link; //instance variable
		
		public ListNode(T xData, ListNode xLink) //constructor
		{
			data = xData;
			link = xLink;
		}
	}
	
	private ListNode head; //First element of the list
	private ListNode tail; //last element of the list
	
	public GenQueue()
	{
		head = tail = null;
	}
	
	public GenQueue(T data)
	{
		enqueue(data);
	}
	
	public void enqueue(T aData) //in queue method
	{
		ListNode newNode = new ListNode(aData, null);
		if(head == null)
		{
			head = tail = newNode;
		}
		else
		{
			tail.link = newNode;
			tail = newNode; //tail = tail.link;
		}

	}
	
	public T dequeue() //remove from queue method
	{
		if(head == null)
			return null;
		else
		{
			T ret = head.data; //ret means return
			head = head.link;
			return ret;
		}
	}
	
	public T peek()
	{
		if(head == null)
			return null;
		else
			return head.data;
	}
	
	public void print() //print
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
		System.out.println();
	}
	
	
	
	
	

}
