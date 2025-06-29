package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String s1 = "abcabcbb";
        String s2 = "bbbbb";


        LongestString l1 = new LongestString();
        System.out.println("s1 : " +  l1.lengthOfLongestSubstring(s1));
        System.out.println("s2 : " +  l1.lengthOfLongestSubstring(s2));
    }
}