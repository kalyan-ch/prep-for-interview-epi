package com.interviewPrep.epi.Chap8StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Eight2EvaluateRPNExpressions {
    public static void main(String[] args) {
        String[] rpns = {"3,4,+,2,x,1,+", "1,1,+,-2,x"};
        for (String rpn: rpns) {
            System.out.println(evaluateRPN(rpn));
        }
    }

    private static int evaluateRPN(String rpn) {

        String[] chars = rpn.split(",");
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < chars.length; i++) {
            String s = chars[i];
            if("+-x/".contains(s)){
                int x = stack.pop();
                int y = stack.pop();
                switch(chars[i].charAt(0)){
                    case '+':
                        stack.push(x+y);
                        break;
                    case '-':
                        stack.push(x-y);
                        break;
                    case 'x':
                        stack.push(x*y);
                        break;
                    case '/':
                        stack.push(x/y);
                        break;
                }
            }else{
                stack.push(Integer.parseInt(s));
            }

        }

        return stack.pop();
    }


}
