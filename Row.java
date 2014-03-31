package com.ctci;

import java.util.ArrayList;

public class Row {
	
	protected ArrayList<Integer> rowElements = new ArrayList<Integer>();
	protected static final Integer ZERO = new Integer(0);
	
	public int indexOfZero(){
		if(rowElements.contains(ZERO)){
			return rowElements.indexOf(ZERO);
		}else{
			return -1;
		}
	}
	
	public void addElement(int number){
		rowElements.add(new Integer(number));
	}

	@Override
	public String toString()
	{
		StringBuilder rowContents = new StringBuilder();
		for(Integer i : rowElements){
			rowContents.append(i.toString());
			rowContents.append(" ");
			
		}
		return rowContents.toString();
	}

	public void nullify() {
		
		int rowSize = this.rowElements.size();
		for(int i = 0; i< rowSize; i++){
			rowElements.set(i, 0);
		}
	}
}
