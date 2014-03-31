package com.ctci.tests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import com.ctci.TreeNode;

public class TreeNodeTest {

	/*@Test
	public void ByDefaultTreeNodeIsALeafNode()
	{
		TreeNode node = new TreeNode("hello world");
		Assert.assertEquals("hello world", node.GetValue());
		Assert.assertEquals(null, node.GetLeftNode());
		Assert.assertEquals(null, node.GetRightNode());
		
		Assert.assertEquals(true, node.IsLeafNode());
	}

	@Test
	public void TreeNodeINotLeafNodeWhenItHasChildren()
	{
		TreeNode node = new TreeNode("hello world");
		TreeNode leftNode = new TreeNode("Bye");
		TreeNode rightNode = new TreeNode("Bye bebek");
		
		node.SetLeftNode(leftNode);
		node.SetRightNode(rightNode);
		
		Assert.assertEquals("hello world", node.GetValue());
		Assert.assertEquals(leftNode, node.GetLeftNode());
		Assert.assertEquals(rightNode, node.GetRightNode());
		
		Assert.assertEquals(false, node.IsLeafNode());
	}*/
	
}
