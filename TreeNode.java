package com.ctci;

public class TreeNode {
	private int value;
	private TreeNode leftNode = null;
	private TreeNode rightNode = null;
	
	public TreeNode(int nodeValue)
	{
		this.value = nodeValue;
	}
	
	public void SetLeftNode(TreeNode lnode)
	{
		this.leftNode = lnode;
	}
	
	public void SetRightNode(TreeNode rnode)
	{
		this.rightNode = rnode;
	}
	
	public int GetValue()
	{
		return value;
				
	}
	
	public TreeNode GetLeftNode()
	{
		return leftNode;
	}
	
	public TreeNode GetRightNode()
	{
		return rightNode;
	}
	
	public boolean IsLeafNode()
	{
		return (leftNode == null && rightNode == null);
	}

}
