/*
 * Douglas Wendel
 * CSCE 146
 * Lab 08
 */

public class ProcessHeap <Process extends Comparable<Process>>{
	
	private Process[] heap;
	private int size;//size just points to the first null element
	

	public ProcessHeap(int size)
	{
		init(size);
	}
	private void init(int size)
	{
		if(size <= 0)
			return;
		heap = (Process[])(new Comparable[size]);
	}
	
	
	//insert method
	public void insert(Process aData)
	{
		if(size >= heap.length)
			return;
		heap[size] = aData;
		bubbleUp();
		size++;
	}
	private void bubbleUp()
	{
		int index = size; //start from newly added item
		while(index > 0 && heap[pIndex(index)].compareTo(heap[index])<0)
		{
			//SWAP
			Process temp = heap[pIndex(index)];
			heap[pIndex(index)] = heap [index];
			heap[index] = temp;
			index = pIndex(index);
		}
	}
	private int pIndex(int index)
	{
		return(index-1)/2;
	}
	private int lIndex(int index)
	{
		return index*2+1;
	}
	private int rIndex(int index)
	{
		return index*2+2;
	}
	public Process peek()
	{
		return heap[0];
	}
	public Process remove()
	{
		Process temp = peek();
		heap[0] = heap[size-1];
		heap[size-1] = null;
		size--;
		bubbleDown();
		return temp;
	}
	private void bubbleDown()
	{
		int index = 0; //Start from root
		while(lIndex(index) < size)
		{
			//find the larger of the two children
			int bigIndex = lIndex(index);//assume the left is larger
			if(rIndex(index) < size &&
					heap[lIndex(index)].compareTo(heap[rIndex(index)]) < 0)
				bigIndex = rIndex(index);//Right was acutally larger
			if(heap[index].compareTo(heap[bigIndex])<0) {
				//swap
				Process temp = heap[index];
				heap[index] = heap[bigIndex];
				heap[bigIndex] = temp;
			}
			else
				break; //we didnt have to swap to stop
			index = bigIndex;
		}
	}
	
	public void printHeap()
	{
		for(int i = 0; i <size; i++)
		{
			System.out.println(heap[i]);
		}
	}
	
	public Process peak() //peek method
	{
		return heap[0];
	}
	
	public void HeapSort()
	{
		//this creates a new process heap
		ProcessHeap c = new ProcessHeap(heap.length);
		//then i need to copy my current process and paste it into another process
		Process newPH[] = heap.clone(); //clone is a way to copy 
		
		for(int i = 0; i < size; i++)
		{
			c.insert(newPH[i]);
			
		}
		for(int i = 0; i< size-1; i++)//size points to first index that is null
		{
			System.out.println(c.remove().toString());
		}

	}
	
	public boolean isEmpty()
	{
		if(peak() != null)
			return false;
		else
			return true;
		
	}
}

	


