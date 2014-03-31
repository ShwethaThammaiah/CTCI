package com.ctci.tests;
import org.junit.Assert;
import org.junit.Test;

import com.ctci.StringPermutationTester;

public class StringPermutationTesterTest {

	@Test
	public void testStringBIsPermutationOfStringAReturnsTrue() {
		StringPermutationTester permutationTester = new StringPermutationTester();
		String stringA = "abcd";
		String stringB = "cabd";
		Assert.assertEquals(true,permutationTester.testIfStringIsPermutationOfAnother(stringA, stringB));
		
	}
	
	@Test
	public void testStringBIsNotAPermutationOfStringAReturnsFalse() {
		StringPermutationTester permutationTester = new StringPermutationTester();
		String stringA = "abcd";
		String stringB = "woof";
		Assert.assertEquals(false,permutationTester.testIfStringIsPermutationOfAnother(stringA, stringB));
		
	}
	
	@Test
	public void testIfStringAIsEmpty() {
		StringPermutationTester permutationTester = new StringPermutationTester();
		String stringA = "";
		String stringB = "woof";
		Assert.assertEquals(false,permutationTester.testIfStringIsPermutationOfAnother(stringA, stringB));
		
	}
	
	@Test
	public void testIfStringAIsNull() {
		StringPermutationTester permutationTester = new StringPermutationTester();
		String stringA = null;
		String stringB = "woof";
		Assert.assertEquals(false,permutationTester.testIfStringIsPermutationOfAnother(stringA, stringB));
		
	}
	
	@Test
	public void testIfStringBIsEmpty() {
		StringPermutationTester permutationTester = new StringPermutationTester();
		String stringB = "";
		String stringA = "woof";
		Assert.assertEquals(false,permutationTester.testIfStringIsPermutationOfAnother(stringA, stringB));
		
	}
	
	@Test
	public void testIfStringBIsNull() {
		StringPermutationTester permutationTester = new StringPermutationTester();
		String stringB = null;
		String stringA = "woof";
		Assert.assertEquals(false,permutationTester.testIfStringIsPermutationOfAnother(stringA, stringB));
		
	}
	

}
