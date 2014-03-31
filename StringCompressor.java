package com.ctci;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompressor {

	public String compress(String input){

		if(input == null){
			System.out.println("String is null");
			return input;
		}
		if(input.isEmpty()){
			System.out.println("String is empty");
			return input;
		}
		Map<Character,Integer> occurrencesOfEachChar = getOccurrencesOfCharInString(input);
		String compressedString = buildCompressedString(occurrencesOfEachChar).toString();
		if(input.length() == compressedString.length()){
			return input;
		}else{
			return compressedString;
		}
	}

	private Map<Character,Integer> getOccurrencesOfCharInString(String input){

		char[] inputArray = input.toCharArray();
		Map<Character,Integer> occurrences = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i< inputArray.length; i++){
			Character charKey = inputArray[i];
			if(occurrences.containsKey(inputArray[i])){
				Integer numberOfOccurrences = occurrences.get(charKey);
				occurrences.put(charKey, new Integer(numberOfOccurrences + 1));
			}else{
				occurrences.put(charKey, 1);
			}
		}
		return occurrences;
	}
	
	private StringBuilder buildCompressedString(Map<Character,Integer> occurrences){
		
		StringBuilder compressedString = new StringBuilder();
		for(Entry<Character, Integer> entry : occurrences.entrySet()){
			Character charKey = entry.getKey();
			Integer occurrence = entry.getValue();
			if(occurrence > 1){
				compressedString.append(charKey).append(occurrence);
			}else{
				compressedString.append(charKey);
			}
		}
		return compressedString;
	}
}
