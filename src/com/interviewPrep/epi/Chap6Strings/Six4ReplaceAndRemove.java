package com.interviewPrep.epi.Chap6Strings;

public class Six4ReplaceAndRemove {

    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'e'};
        replaceAandRemoveB(3, s);
        for(char c: s)
            System.out.print(c+" ");

        System.out.println();
    }

    private static void replaceAandRemoveB(int size, char[] s) {
        int aCount = 0, writeIdx = 0;
        for(int i = 0; i < size; i++){
            if(s[i] != 'b')
                s[writeIdx++] = s[i];

            if(s[i] == 'a')
                aCount++;
        }

        int currIdx = writeIdx - 1;
        writeIdx = writeIdx + aCount - 1;

        while(currIdx >= 0){
            if (s[currIdx] == 'a') {
                s[writeIdx--] = 'd';
                s[writeIdx--] = 'd';
            }else{
                s[writeIdx--] = s[currIdx];
            }
            --currIdx;
        }
    }

}
