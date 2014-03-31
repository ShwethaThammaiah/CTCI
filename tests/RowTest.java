package com.ctci.tests;



import org.junit.Assert;
import org.junit.Test;

import com.ctci.Row;

public class RowTest {
	
	@Test
	public void CreateARow()
	{
		Row row = new Row();
		row.addElement(1);
		row.addElement(2);
		row.addElement(3);
		Assert.assertEquals("1 2 3 ", row.toString());
	}
	
	@Test
	public void nullifyRow()
	{
		Row row = new Row();
		row.addElement(1);
		row.addElement(2);
		row.addElement(3);
		Assert.assertEquals("1 2 3 ", row.toString());
		row.nullify();
		Assert.assertEquals("0 0 0 ", row.toString());
		
	}

}
