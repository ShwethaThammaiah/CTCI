package com.ctci.tests;

import org.junit.Test;

import com.ctci.Matrix;
import com.ctci.MatrixBuilder;

public class MatrixTest {
	
	private static final int numberOfRows = 3;
	private static final int numberOfcolumns = 3;
	private static final int[] numbersWithZeroes = {0,2,3,4,5,6,7,8,9};

	@Test
	public void IfRowHasOneZeroThenNullifyShouldMakeWholeRowZero() {
		MatrixBuilder builder = new MatrixBuilder();
		Matrix matrix = builder.buildMatrix(numberOfRows,numberOfcolumns,numbersWithZeroes);
		System.out.println(matrix.toString());
		matrix.nullify();
		System.out.println(matrix.toString());
	}
	
	@Test
	public void IfRowHasOneZeroThenNullifyShouldMakeWholeRowAndColumnZero() {
		MatrixBuilder builder = new MatrixBuilder();
		Matrix matrix = builder.buildMatrix(numberOfRows,numberOfcolumns,numbersWithZeroes);
		System.out.println(matrix.toString());
		matrix.nullify();
		System.out.println(matrix.toString());
	}

}
