package com.interviewPrep.epi.Chap8StacksAndQueues;

public class Eight3WellFormedNess {
    public static void main(String[] args) {
        String[] parentheses = {"{[]}", "([{}])", "{{]]))"};
        for (String s: parentheses) {
            System.out.println(isValid(s));
        }
    }

    public static boolean isValid(String s) {
        if(s.length() % 2 != 0)
            return false;

        int head = 0;
        char[] stk = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '{':
                case '[':
                case '(':
                    stk[head++] = s.charAt(i);
                    break;
                case '}':
                    if(head == 0 || stk[--head] != '{')
                        return false;
                    break;
                case ']':
                    if(head == 0 || stk[--head] != '[')
                        return false;
                    break;
                case ')':
                    if(head == 0 || stk[--head] != '(')
                        return false;
                    break;
            }
        }

        return head == 0;
    }
}
