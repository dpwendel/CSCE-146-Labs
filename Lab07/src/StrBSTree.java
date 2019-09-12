
/*
 * Douglas Wendel
 * CSCE 147
 * Lab 07
 */

public class StrBSTree <T extends Comparable<T>> {

	private class Node {

		private T data;
		private Node leftChild; //always is less than
		private Node rightChild; //right is always greater than or = to. 
		
		public Node(T aData) {
			data = aData;
			leftChild = rightChild = null;
		}
	}

	private Node root;
	
	public void insert(T aData) 
	{
		if(root == null)
			root = new Node(aData);
		else
			insert(root,aData);
			
	}
	private Node insert(Node aNode, T aData)// recursive method
	{
		if(aNode == null)// found a leaf
			aNode = new Node(aData);
		else if (aData.compareTo(aNode.data) < 0)// go left
			aNode.leftChild = insert(aNode.leftChild, aData);
		else if (aData.compareTo(aNode.data) < 0)// go right
			aNode.rightChild = insert(aNode.rightChild, aData);
		return aNode;
	}
	
	public void remove(T aData)
	{
		root = remove(root,aData);
	}
	private Node remove(Node aNode, T aData)
	{
		//find the node
		if(aNode == null)//did not find the value
			return null; 
		if(aData.compareTo(aNode.data)< 0) //goLeft
			aNode.leftChild = remove(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data)>0)
			aNode.rightChild = remove(aNode.rightChild,aData);
		else //we found it!!!!!!
		{
			if(aNode.rightChild == null) //none or only left child
				return aNode.leftChild;
			if(aNode.leftChild == null)
				return aNode.rightChild;
			
			
			//TODO find min in tree
			Node min = findMin(aNode.rightChild);
			aNode.data = min.data;
		}
		return aNode;
		
	}
	private Node findMin(Node aNode)
	{
		if(aNode == null)
			return null;
		if(aNode.leftChild == null)
			return aNode;
		else
			return findMin(aNode.leftChild);
	}
	
	public void printPreOrder() 
	{
		printPreOrder(root);
	}
	
	private void printPreOrder(Node aNode) {
		if(aNode == null)
			return;
		
		System.out.println(aNode.data);// Process
		
		if(aNode.leftChild != null)
			printPreOrder(aNode.leftChild);// LEFTprintPreOrder(aNode.leftChild);
		if(aNode.rightChild != null)// RIGHT
			printPreOrder(aNode.rightChild);
	}
	

	
	
}
