package org.example.array.leetcode;

import java.util.HashMap;

public class Leetcode_13_RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInteger(s));
    }
    public static int romanToInteger(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();
        int result = map.get(s.charAt(n-1));

        for(int i = n-2; i>=0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result = result - map.get(s.charAt(i));
            }else{
                result = result + map.get(s.charAt(i));
            }
        }
        return result;
    }
}
