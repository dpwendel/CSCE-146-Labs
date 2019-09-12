/*
 * Douglas Wendel
 * CSCE 146 
 * Lab 08
 */
public class Process implements Comparable <Process>{
	
	//instance variables
	private String name;
	private int priority;
	private double time;
	
	//default constructor
	public Process()
	{
		this.name = "no name";
		this.priority = 0;
		this.time = 0.0;
	}
	
	//parameterized constructor
	public Process(String xName, int xPriority, double xTime)
	{
		this.setName(xName);
		this.setPriority(xPriority);
		this.setTime(xTime);
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String xName) {
		this.name = xName;
	}
	public int getPriority() {
		return priority;
	}
	public double getTime() {
		return time;
	}

	public void setPriority(int xPriority) { //must be greater than 0
		if(xPriority > 0)
		{
			this.priority = xPriority;
		}
	}
	
	public void setTime(double xTime) { //must be greater than 0
		if(xTime > 0)
			this.time = xTime;
	}
	
	public String toString()
	{
		return "Name: "+this.name + " Priority: " + this.priority + " Time: " +this.time;
	}
	
	public int compareTo(Process xProcess) //this makes the insert method have an easier time comparieing
	{
		if(this.priority > xProcess.getPriority())
			return 1;
		if(this.priority < xProcess.getPriority())
			return -1;
		else
			return 0;
	}

}
