package com.interviewPrep.epi.Chap6Strings;

public class Six11SinusoidalString {
    public static void main(String[] args) {
        writeStringSinusoidally("hey vsauce micheal here what is poop");
    }

    private static void writeStringSinusoidally(String s){

        // top
        StringBuilder snakeStr = new StringBuilder();
        for(int i = 1; i < s.length(); i+= 4){
            snakeStr.append(s.charAt(i));
        }

        System.out.print(" ");
        for (int i = 0; i < snakeStr.toString().length(); i++) {
            System.out.print(snakeStr.charAt(i)+"   ");
        }

        System.out.println();

        // middle
        snakeStr = new StringBuilder();

        for(int i = 0; i < s.length(); i+= 2){
            snakeStr.append(s.charAt(i));
        }

        for (int i = 0; i < snakeStr.toString().length(); i++) {
            System.out.print(snakeStr.charAt(i)+" ");
        }

        System.out.println();


        //bottom
        snakeStr = new StringBuilder();

        for(int i = 3; i < s.length(); i+= 4){
            snakeStr.append(s.charAt(i));
        }


        System.out.print("   ");
        for (int i = 0; i < snakeStr.toString().length(); i++) {
            System.out.print(snakeStr.charAt(i)+"   ");
        }

        System.out.println();


    }
}
