package com.example;

public class LongestString {

    public static int lengthOfLongestSubstring(String s) {

        int leftPointer = 0, rightPointer = 0;
        int maxLen = 0;

        HashSet<Character> hashSet = new HashSet<>();

        while (rightPointer < s.length()) {
            char currentChar = s.charAt(rightPointer);

            //check if char is present in the set
            if (!hashSet.contains(currentChar)) {
                hashSet.add(currentChar);
                maxLen = Math.max(maxLen, rightPointer - leftPointer + 1);
                rightPointer++;
            } else {
                hashSet.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }

        return maxLen;

    }

}
