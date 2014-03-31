package com.ctci;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterTester {

	boolean isUniqueCharString = false;

	public boolean testIfAStringHasAllUniqueChars(String input){
		if(input != null){
			char[] inputArray = input.toCharArray();
			Set<Character> charSet = new HashSet<Character>();
			boolean uniqueAdd = false;
			if(input.isEmpty()){
				System.out.println("empty string");
				return false;
			}
			for(int i = 0; i < inputArray.length; i ++){
				uniqueAdd = charSet.add(inputArray[i]);
				if(uniqueAdd == false){
					return false;
				}
			}
			return true;
		}else{
			System.out.println(" input is null!");
			return false;
		}
	}

}
