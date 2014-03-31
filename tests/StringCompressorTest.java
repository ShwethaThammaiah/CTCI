package com.ctci.tests;

import org.junit.Assert;
import org.junit.Test;

import com.ctci.StringCompressor;

public class StringCompressorTest {

	@Test
	public void testIfStringIsNullLogsErrorAndReturnsOriginalStringWithNoCompression() {
		StringCompressor compressor = new  StringCompressor();
		String testString = null;
		Assert.assertEquals(testString,compressor.compress(testString));
	}
	
	@Test
	public void testIfStringIsEmptyLogsErrorAndReturnsOriginalStringWithNoCompression() {
		StringCompressor compressor = new  StringCompressor();
		String testString = "";
		Assert.assertEquals(testString,compressor.compress(testString));
	}
	
	@Test
	public void testStringCompression() {
		StringCompressor compressor = new  StringCompressor();
		String testString = "aaabbcdeef";
		String expectedResult = "a3b2cde2f";
		Assert.assertEquals(expectedResult,compressor.compress(testString));
	}
	
	@Test
	public void testOriginalStringISRturnedWhenCompressionIsPerformed() {
		StringCompressor compressor = new  StringCompressor();
		String testString = "abcde";
		String expectedResult = "abcde";
		Assert.assertEquals(expectedResult,compressor.compress(testString));
	}

}
