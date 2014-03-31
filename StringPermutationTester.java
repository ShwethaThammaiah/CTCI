package com.ctci;

import java.util.ArrayList;
import java.util.List;


public class StringPermutationTester {
 
	public boolean testIfStringIsPermutationOfAnother(String stringA, String stringB){
		
		if( stringA == null || stringB == null){
			System.out.println("input string cannot be null");
			return false;
		}

		if(stringA.isEmpty() || stringB.isEmpty()){
			System.out.println("input string cannot be empty");
			return false;
		}
		
		List<Character> listA = storeStringContentsInList(stringA);
		List<Character> listB = storeStringContentsInList(stringB);
		
		if(listA.containsAll(listB)){
			return true;
		}else{
			return false;
		}
	}

	private List<Character> storeStringContentsInList(String input){
		char[] string = input.toCharArray();
		List<Character> stringContentsAsList = new ArrayList<Character>();
		for ( int i = 0; i < string.length; i++){
			stringContentsAsList.add(string[i]);
		}
		return stringContentsAsList;
	}

}
