package com.interviewPrep.epi.Chap6Strings;

import java.util.HashMap;
import java.util.Map;

public class Six9RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("VIII"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LIX"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String roman){
        int result = 0;
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int prevVal = 0;
        for (int i = 0; i < roman.length(); i++) {
            int val = romanMap.get(roman.charAt(i));
            if(prevVal != 0 && prevVal < val){
                result -= prevVal;
                result += val - prevVal;
            }else{
                result += val;
            }

            prevVal = val;
        }

        return result;
    }

}
