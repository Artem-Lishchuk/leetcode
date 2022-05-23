package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().validPalindrome("abca"));
    }
}
class Solution {
    public boolean validPalindrome(String s) {
        int differentCnt = 0, fromBeginning = 0, fromEnd = s.length()-1;
        while (fromBeginning < fromEnd){
            if(s.charAt(fromBeginning) != s.charAt(fromEnd)){
                differentCnt ++;
            }
            fromBeginning ++; fromEnd--;
            if(differentCnt == 2){
                return false;
            }
        }
        return true;

    }
}
