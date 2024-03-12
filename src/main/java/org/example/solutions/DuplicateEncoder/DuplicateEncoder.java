package org.example.solutions.DuplicateEncoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
	static String encode(String word){
        char[] wordArray = word.toUpperCase().toCharArray();
        StringBuilder modifiedWord = new StringBuilder();
        Map<Character, Integer> wordHashMap = new HashMap<>();

        for(char c : wordArray) {
            if (wordHashMap.containsKey(c)) {
                wordHashMap.put(c, wordHashMap.get(c) + 1);
            } else {
                wordHashMap.put(c, 1);
            }
        }

        for(char c : wordArray) {
            if (wordHashMap.get(c) > 1) {
                modifiedWord.append(')');
            } else {
                modifiedWord.append('(');
            }
        }


    return modifiedWord.toString();
  }
}
