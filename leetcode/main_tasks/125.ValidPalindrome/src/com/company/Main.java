package com.company;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("0P"));
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        String clearString = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return clearString.equals(new StringBuffer(clearString).reverse().toString());
    }
}
