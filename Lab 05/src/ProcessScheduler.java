/*
 * Douglas Wendel
 * CSCE 147
 * Lab 05
 */
public class ProcessScheduler{
	
	LinkedListQueue<Process> processs;
	Process currentProcess;
	

	/*public ProcessScheduler() 
	{
		this.processs = processs;
	}*/
	
	public ProcessScheduler()
	{
		processs = new LinkedListQueue<Process>();
		currentProcess = null;
	}

	public Process getCurrentProcess() //gets the current
	{
		return currentProcess;
	}
	
	public void setCurrentProcess(Process currentProcess) //sets the current
	{
		this.currentProcess = currentProcess;
		
	}
	
	public void addProcess(Process p) //adds a process into queue
	{
		if(currentProcess == null)
		{
			setCurrentProcess(p);
		}
		else if(processs != null)
		{
			processs.enqueue(p);
		}
	}
	
	public void runNextProcess() //runs the next process in line
	{
		if(processs != null)
		{
			currentProcess = processs.dequeue();
			//LinkedListQueue<Process>.ListNode<Process> p = processs.dequeue();
			//setCurrentProcess(p.data);
		}

	}
	
	public void cancelCurrentProcess() //cancels the current process
	{

		currentProcess = processs.dequeue();
				
	}
	
	public void printProcessQueue() //prints the process
	{
		if(processs != null)
		{
			processs.print();

		}
	}
	
}
