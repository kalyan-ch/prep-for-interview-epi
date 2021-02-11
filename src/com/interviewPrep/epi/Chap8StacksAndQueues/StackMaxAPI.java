package com.interviewPrep.epi.Chap8StacksAndQueues;

import java.util.ArrayList;
import java.util.List;

import static com.interviewPrep.epi.Chap5Arrays.ArrayUtils.printIntArr;

public class StackMaxAPI {
    private List<Integer> stack;
    private int head;

    private int maxNum;

    public StackMaxAPI(int size){
        stack = new ArrayList<>(size);
        head = -1;
    }


    public void push(int num){
        stack.add(num);
        maxNum = Math.max(maxNum, num);
        head++;
    }

    public int pop(){
        if(head >= 0) {
            int num = stack.get(head);
            stack.remove(head--);
            if(stack.isEmpty())
               maxNum = -1;
            else
                maxNum = Integer.MIN_VALUE;
                stack.forEach(n -> maxNum = Math.max(maxNum, n));

            return num;
        }

        throw new IndexOutOfBoundsException("stack empty");
    }

    public int getMaxNum(){
        return maxNum;
    }

    public void printStack(){
        printIntArr(stack);
    }



}
