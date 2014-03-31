package com.ctci;

import java.util.ArrayList;
import java.util.List;

public class MatrixBuilder {

	List<Row> rows = new ArrayList<Row>();
	List<Row> columns = new ArrayList<Row>();
	
	public  Matrix buildMatrix(int numberOfRows,int numberOfColumns, int[] numbers){

		createRowsOutOfRawData(numbers, numberOfColumns);
		
		Matrix matrix = new Matrix(rows,columns);

		return matrix;
	}

	private void createRowsOutOfRawData(int[] numbers, int numberOfColumns) {
		Row matrixRow = new Row();
		for( int i = 0; i<numbers.length; i++)
		{
			matrixRow.addElement(numbers[i]);
			
			if(((i+1) % numberOfColumns) == 0)
			{
				rows.add(matrixRow);
				matrixRow = new Row();
			}
		}
	}

	
}
