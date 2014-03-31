package com.ctci;

import java.util.ArrayList;
import java.util.List;

public class Matrix {

	private static final int ZERO = 0;
	private List<Row> rows;
	private List<Row> columns;

	public Matrix(List<Row> rows,List<Row> columns){
		this.rows = rows;
		this.columns = columns;
	}

	public String displayRowContents(){
		StringBuilder contentsOfRows = new StringBuilder();
		for(Row row : rows){
			contentsOfRows.append(row.toString() + "\n");
		}
		return contentsOfRows.toString();
	}

	public String displayColumnContents(){
		StringBuilder contentsOfRows = new StringBuilder();
		for(Row row : columns){
			contentsOfRows.append(row.toString() + "\n");
		}
		return contentsOfRows.toString();
	}


	public void nullify(){

		ArrayList<ZeroCounter> counter = new ArrayList<ZeroCounter>();
		
		createZeroCounterList(counter);
		nullifyRowAndColumn(counter);
		

	}

	private void nullifyRowAndColumn(ArrayList<ZeroCounter> counter) {
		for (ZeroCounter count : counter)
		{
			rows.get(count.getRowNumber()).nullify();
			for(Row row : rows)
			{
				for(int idx : count.getIndex())
				{
					row.rowElements.set(idx, ZERO);
				}
			}
		}
	}

	private void createZeroCounterList(ArrayList<ZeroCounter> counter) {
		for (int i = 0; i < rows.size(); i++) {
			if(rows.get(i).indexOfZero() != -1)
			{
				ArrayList<Integer> idx = new ArrayList<Integer>();
				idx.add(rows.get(i).indexOfZero());
				counter.add(new ZeroCounter(i,idx));
			}
		}
	}

	@Override
	public String toString()
	{
		StringBuffer returnString = new StringBuffer();
		for(Row row : rows)
		{
			returnString.append(row.toString());
			returnString.append("\n");
		}
		return returnString.toString();
	}

}
