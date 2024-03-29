/*
 * Douglas Wendel
 * CSCE 147
 * Lab 09
 */
import java.util.*;
public class Graph {

	private static final int DEFAULT_NODE_COUNT = 10;
	private int [][] adjMatrix;
	private ArrayList<Integer> markedVerts;
	Queue<Integer> vQ;
	
	public Graph()
	{
		adjMatrix = new int[DEFAULT_NODE_COUNT][DEFAULT_NODE_COUNT];
		initGraph();
	}
	
	public Graph(int size)
	{
		adjMatrix = new int[size][size];
		initGraph();
	}
	
	public void initGraph()
	{
		for(int i = 0; i < adjMatrix.length; i++)
		{
			for(int j = 0; j < adjMatrix[i].length; j++)
			{
				adjMatrix[i][j] = 0;
			}
		}
		markedVerts = new ArrayList<Integer>();
		//visitedVerts = new ArrayList<Integer>();
		vQ = new LinkedList<Integer>();
	}
	
	public void addEdge(int toVertex, int fromVertex, int weight)
	{
		adjMatrix[toVertex][fromVertex] = weight;
	}
	
	public void printAdjMatrix()
	{
		for(int i = 0; i < adjMatrix.length; i++)
		{
			for(int j = 0; j < adjMatrix[i].length; j++)
			{
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void printDFS()
	{
		markedVerts.clear();
		printDFS(0);
	}
	
	public void printDFS(int index)
	{
		System.out.println(index);
		markedVerts.add(index);
		
		for(int i = 0; i < adjMatrix[index].length; i++)
		{
			if(adjMatrix[index][i] != 0 && markedVerts.contains(i) == false)
			{
				printDFS(i);
			}
		}
		return;
	}
	
	public void printBFS()
	{
		markedVerts.clear();
		vQ.clear();
		markedVerts.add(0);
		vQ.add(0);
		System.out.println(0);
		printBFS(0);
	}
	
	private void printBFS(int index)
	{
		while(!vQ.isEmpty())
		{
			int currI = vQ.remove();
			markedVerts.add(currI);
			
			for(int i = 0; i < adjMatrix[currI].length; i++)
			{
				if(!markedVerts.contains(i) && !vQ.contains(i) &&
						adjMatrix[currI][i] != 0)
				{
					System.out.println(i);
					vQ.add(i);
				}
			}
		}
	}

}
