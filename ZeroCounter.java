package com.ctci;

import java.util.ArrayList;

public class ZeroCounter {
	private int zeroRowNumber;
	private ArrayList<Integer> zeroIndexForGivenRow;
	
	public ZeroCounter(int rowNumber, ArrayList<Integer>indexOfZeros)
	{
		this.zeroRowNumber = rowNumber;
		this.zeroIndexForGivenRow = indexOfZeros;
	}
	
	public int getRowNumber(){
		return zeroRowNumber;
	}
	
	public ArrayList<Integer> getIndex()
	{
		return zeroIndexForGivenRow;
	}

}
