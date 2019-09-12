/*
 * Douglas Wendel
 * Lab 05
 * CSCE 147
 */
public class Process {
	private String name;
	private double CompletionTime;
	
	public Process() //default constructor
	{
		this.name = "none";
		this.CompletionTime = 0.0;
	}
	
	public Process(String xName, double xCompletionTime) //
	{
		this.setName(xName);
		this.setCompletionTime(xCompletionTime);
	}
	
	public void setName(String xName)//name setter
	{
		this.name = xName;
		
	}
	
	public String getName() //name getter
	{
		return name;
	}
	
	public void setCompletionTime(Double xCompletionTime) //completion time setter
	{
		if(CompletionTime >= 0)
		{
			this.CompletionTime = xCompletionTime;
		}
		else
		{
			this.CompletionTime = 0;
		}
	}
	
	public double getCompletionTime() //completion time getter
	{
		return CompletionTime;
	}
	
	public String toString() //i thought this was my error but it wasnt, 
	{
		//return this.name +" Completion Time: " +this.CompletionTime + " ";
		return "Process Name: " + this.name +" Completion Time: " + this.CompletionTime + " ";
		//return this.name +" Completion Time: " +this.CompletionTime + " ";
		//return this.name +" Completion Time: " +this.CompletionTime + " ";
	}
}
