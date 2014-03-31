package com.ctci.tests;
import org.junit.Assert;
import org.junit.Test;

import com.ctci.UniqueCharacterTester;

public class UniqueCharacterTesterTest {

	@Test
	public void testNullStringResultsInErrorMsgReturnsFalse() {
		UniqueCharacterTester tester = new UniqueCharacterTester();
		String testString = null;
		Assert.assertEquals(false,tester.testIfAStringHasAllUniqueChars(testString));
	}
	
	@Test
	public void testEmptyStringResultsInErrorMsgReturnsFalse() {
		UniqueCharacterTester tester = new UniqueCharacterTester();
		String testString = "";
		Assert.assertEquals(false,tester.testIfAStringHasAllUniqueChars(testString));
	}
	
	@Test
	public void testStringWithUniqueCharsReturnsTrue() {
		UniqueCharacterTester tester = new UniqueCharacterTester();
		String testString = "abcd";
		Assert.assertEquals(true,tester.testIfAStringHasAllUniqueChars(testString));
	}
	
	@Test
	public void testStringWithNonUniqueCharsReturnsFalse() {
		UniqueCharacterTester tester = new UniqueCharacterTester();
		String testString = "woof";
		Assert.assertEquals(false,tester.testIfAStringHasAllUniqueChars(testString));
	}

}
