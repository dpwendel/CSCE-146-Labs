/*
 * Douglas Wendel
 * CSCE 147
 * Lab 9
 */
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Making graph");
		
		Graph graph = new Graph(7);
		System.out.println("The cycles in this graph are");
		
		System.out.println("Making Graph");
		
		
		//int[][] graph1 = new int[][] {{0,0,0,0,1,0,0},{1,0,0,0,0,0,0},{1,0,0,0,0,0,0},{0,1,0,0,0,0,0},{0,1,1,0,0,0,1},{0,0,1,0,0,0,0},{0,0,0,1,0,1,0}};
		
		
		
		
		graph.addEdge(5, 1, 1);
		graph.addEdge(2, 5, 1);
		graph.addEdge(1, 2, 1);
		graph.addEdge(5, 1, 1);
		graph.addEdge(3, 5, 1);
		graph.addEdge(1, 3, 1);
		graph.addEdge(5, 1, 1);
		graph.addEdge(7, 5, 1);
		graph.addEdge(4, 7, 1);
		graph.addEdge(2, 4, 1);
		graph.addEdge(1, 2, 1);
		graph.addEdge(5, 1, 1);
		graph.addEdge(7, 5, 1);
		graph.addEdge(6, 7, 1);
		graph.addEdge(3, 6, 1);
		
		graph.printDFS();
		graph.printBFS();
	

		

	}

}
