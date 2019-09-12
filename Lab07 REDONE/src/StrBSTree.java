
/*
 * Douglas Wendel
 * CSCE 147
 * Lab 07
 */

public class StrBSTree <T extends Comparable<T>>{
	
	private class Node
	{
		private T data;
		private Node leftChild; //left child is always less than data
		private Node rightChild; //right child is always greater than or equal to that child
		
		public Node(T aData)
		{
			data = aData;
			leftChild = rightChild = null;
		}
	}
	private Node root;
	
	public StrBSTree()
	{
		root = null;
	}
	
	public void insert(T aData)
	{
		if(root == null)
			root = new Node(aData);
		else
			insert(root,aData);
	}
	private Node insert(Node aNode, T aData)
	{
		//compare to function of length 
		
		if(aNode ==  null)//found a leaf
			aNode = new Node(aData);
		else if(aData.compareTo(aNode.data) < 0)//go left
			aNode.leftChild = insert(aNode.leftChild,aData);
		else //go right
			aNode.rightChild = insert(aNode.rightChild,aData);
		return aNode;
	}
	
	public void remove(T aData)
	{
		root = remove(root,aData);
	}
	private Node remove(Node aNode, T aData)
	{
		//find the value
		if(aNode == null)//value was not found
			return null;
		if(aData.compareTo(aNode.data) < 0)//go left
			aNode.leftChild = remove(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data) > 0)//go right
			aNode.rightChild = remove(aNode.rightChild,aData);
		else//value has been found
		{
			//either no children or only left child
			if(aNode.rightChild == null)
				return aNode.leftChild;
			if(aNode.leftChild == null)//only right child
				return aNode.rightChild;
			//if we reach here, it has two children
			Node temp = findMinEntry(aNode.rightChild);
			//delete duplicate
			aNode.rightChild = remove(aNode.rightChild,temp.data);	
		}
		return aNode;
	}
	private Node findMinEntry(Node aNode)
	{
		if(aNode ==  null)
			return null;
		if(aNode.leftChild == null)
			return aNode;
		else
			return findMinEntry(aNode.leftChild);
	}
	
	
	public void printPreOrder()
	{
		printPreOrder(root);
	}
	private void printPreOrder(Node aNode)
	{
		if (aNode == null)
			return;
		System.out.println(aNode.data);// Process
		if (aNode.leftChild != null)// recursive LEFTTTTT
			printPreOrder(aNode.leftChild);
		if (aNode.rightChild != null)// recursive RIGHTTT
			printPreOrder(aNode.rightChild);
	}
	
	
	public int getDepth(int val)
	{
	    return getDepth(val, root);  
	}
	public int getDepth(int val, Node root)
	{
	    if(root == null)
	        return -1;
	    else if(val < (double)root.data)
	        return getDepth(val, root.leftChild);
	    else if(val > (double)root.data)
	        return getDepth(val, root.rightChild);
	    else
	        return getDepth(root)+1;      
	}
}
