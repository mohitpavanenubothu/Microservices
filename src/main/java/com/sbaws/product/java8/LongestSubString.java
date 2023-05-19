package com.sbaws.product.java8;

import java.util.LinkedHashMap;

public class LongestSubString {

    public static void longestSubstring(String inputString) {
        //Step 1 : Convert the given inputString to an array of characters called charArray.
        char[] charArray = inputString.toCharArray();

        //Initialization
        String longestSubstring = null;
        int longestSubstringLength = 0;

        //Creating LinkedHashMap with characters as keys and their position as values.
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<Character, Integer>();

        //Iterating through charArray
        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];
            //If character is not present in linkedHashMap, adding character into linkedHashMap along with its position
            if (!linkedHashMap.containsKey(character)) {
                linkedHashMap.put(character, i);
            }
            //If character is already present in linkedHashMap, reposioning the cursor i to the position of character and clearing the linkedHashMap
            else {
                i = linkedHashMap.get(character);
                linkedHashMap.clear();
            }

            //Updating longestSubstring and longestSubstringLength
            if (linkedHashMap.size() > longestSubstringLength) {
                longestSubstringLength = linkedHashMap.size();
                longestSubstring = linkedHashMap.keySet().toString();
            }
        }

        System.out.println("Input String : " + inputString);
        System.out.println("The longest substring : " + longestSubstring);
        System.out.println("The longest Substring Length : " + longestSubstringLength);
    }

    public static void reverseString(String input) {
        char[] charArrays = input.toCharArray();
        for (int i = charArrays.length - 1; i >= 0; i--) {
            System.out.println("Reverse String is:::" + charArrays[i]);
        }
    }

    public static void main(String[] args) {
        longestSubstring("abcabcbb");
        reverseString("abcd");
    }
}
