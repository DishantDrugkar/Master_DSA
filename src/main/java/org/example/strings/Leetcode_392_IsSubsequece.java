package org.example.strings;

public class Leetcode_392_IsSubsequece {
    public static void main(String[] args) {
        String s = "abc";
        String t = "afjdbc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t){
        int i=0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        if( i == s.length()){
            return true;
        }
        return false;
    }
}
