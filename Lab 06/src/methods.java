/*
 * Douglas Wendel
 * CSCE 146
 * Homework 06
 */

public class methods {
	
	private GenLL<Str>st;
	
	public methods()
	{
		st = new GenLL<Str>();
	}
	
	//ADD METHOD
	public void add(Str xStr) //this allows you to insert things into the array
	{
		st.insert(xStr);
	}
	
	
	//QUIT METHOD
	public boolean quit() //this method allows the program to quit when a user types quit. 
	{
		st.resetCurrent();
		
		while(st.hasMore())
		{
			if(st.getCurrent().getSt().equalsIgnoreCase("quit"))
			{
				return false;
			}
			else
			{
				st.gotoNext();
				return true;
			}
		}
		return false;
	}
	
	//REMOVE METHOD..... i dont even think this is needed but yolo
	public void remove(Str xStr)
	{
		st.deleteCurrent();
	}
	
	//METHOD THAT COUNTS HOW MANY STRINGS THERE ARE
	public int Counter() //this counts how many strings are inserted by the user so that way it knows how many it has to go through
	{
		int c = 0;
		st.resetCurrent();
		
		while(st.hasMore())
		{
			c++;
			st.gotoNext();
		}
		return c;
	}
	
	//METHOD THAT PUTS LINKED LIST INTO AN ARRAY
	public void Array(String [] aStr)
	{
		/*
		 * basically since we arent supposed to use a linked list this method is used to transfer
		 * the information from the linked list into an array allowing it to be more compatable. 
		 */
	}
	
	
}
