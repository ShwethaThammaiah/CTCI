package com.ctci;

public class TreeBuilder {

	public TreeNode Build(int[] values) {

		TreeNode root = null;

		for (int i=0; i < values.length; i++)
		{
			root = InsertNode(root, values[i]);

		}
		return root;
	}

	private TreeNode InsertNode(TreeNode node, int value)
	{
		if(node == null){
			node = new TreeNode(value);
		}else{
			if(value < node.GetValue()){
				node.SetLeftNode(InsertNode(node.GetLeftNode(),value));
			}else{
				node.SetRightNode(InsertNode(node.GetRightNode(),value));
			}
		}
		return node;
	}

}
