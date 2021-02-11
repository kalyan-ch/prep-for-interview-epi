package com.interviewPrep.epi.Chap8StacksAndQueues;

public class Eight1StackMaxAPITester {
    public static void main(String[] args) {
        StackMaxAPI stack = new StackMaxAPI(10);

        int i = -10;

        while( i < 100){
            stack.push(i);
            i *= -2;
        }

        for (int j = 0; j < 3; j++) {
            System.out.println(stack.pop());
            stack.printStack();
        }

        System.out.println(stack.getMaxNum());

    }
}
