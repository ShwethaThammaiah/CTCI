package com.ctci.tests;

import org.junit.Assert;
import org.junit.Test;

import com.ctci.TreeBuilder;
import com.ctci.TreeNode;

public class TreeBuilderTest {

	@Test
	public void treeWithOneNodeGetsCreated(){
		int[] values = {3};
		TreeBuilder builder = new TreeBuilder();
		TreeNode root = builder.Build(values);
		Assert.assertEquals(3,root.GetValue());
		Assert.assertNull(root.GetLeftNode());
		Assert.assertNull(root.GetRightNode());
		
	}
	
	@Test
	public void treeWithThreeNodeGetsCreated(){
		int[] values = {3,2,5};
		TreeBuilder builder = new TreeBuilder();
		TreeNode root = builder.Build(values);
		Assert.assertEquals(3,root.GetValue());
		Assert.assertEquals(2,root.GetLeftNode().GetValue());
		Assert.assertEquals(5,root.GetRightNode().GetValue());
		
	}
	
	@Test
	public void treeWithDepthOfThree(){
		int[] values = {7, 2, 5, 3, 6, 8, 9};
		TreeBuilder builder = new TreeBuilder();
		TreeNode root = builder.Build(values);
		Assert.assertEquals(7,root.GetValue());
		Assert.assertEquals(2,root.GetLeftNode().GetValue());
		Assert.assertEquals(8,root.GetRightNode().GetValue());
		Assert.assertEquals(5,root.GetLeftNode().GetRightNode().GetValue());
		Assert.assertEquals(9,root.GetRightNode().GetRightNode().GetValue());
		Assert.assertEquals(3,root.GetLeftNode().GetRightNode().GetLeftNode().GetValue());
		Assert.assertEquals(6,root.GetLeftNode().GetRightNode().GetRightNode().GetValue());
		
	}
	

}
