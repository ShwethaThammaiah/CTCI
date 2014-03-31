package com.ctci.tests;

import org.junit.Test;

import com.ctci.Matrix;
import com.ctci.MatrixBuilder;

public class MatrixBuilderTest {
	
	private static final int numberOfRows = 2;
	private static final int numberOfcolumns = 3;
	private static final int[] numbers = {1,2,3,4,5,6};

	@Test
	public void testMatrixIsCreatedCorrectly() {
		MatrixBuilder builder = new MatrixBuilder();
		Matrix matrix = builder.buildMatrix(numberOfRows,numberOfcolumns,numbers);
		//System.out.println(matrix.displayRowContents());
		System.out.println(matrix.toString());
	}

}
