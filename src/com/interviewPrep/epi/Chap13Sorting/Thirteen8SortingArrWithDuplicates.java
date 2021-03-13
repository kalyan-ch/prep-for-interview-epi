package com.interviewPrep.epi.Chap13Sorting;

import java.util.HashMap;
import java.util.Map;

public class Thirteen8SortingArrWithDuplicates {
    private static class Student{
        int age;
        String name;
        public Student(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String[] args) {
        char[] letters = {'b', 'a', 'c', 'b', 'd', 'a', 'b', 'd'};

        duplicatesTogether(letters);

        for(char c: letters)
            System.out.print(c+" ");
        System.out.println();
    }

    private static void duplicatesTogether(char[] letters) {
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c: letters){
            int num = charCount.getOrDefault(c, 0);
            charCount.put(c, ++num);
        }

        int i = 0;
        for(char c: charCount.keySet()){
            for(int j = i; j < i+charCount.get(c); j++) {
                letters[j] = c;
            }
            i += charCount.get(c);
        }
    }
}
