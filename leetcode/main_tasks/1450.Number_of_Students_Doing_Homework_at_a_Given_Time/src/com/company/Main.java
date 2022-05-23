package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,2,3 };
        int[] b = {3,2,7};
        int c = 4;
        new Solution().busyStudent(a,b,c);
    }
}
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for(int i =0; i< startTime.length; i++){
            if (startTime[i] <= queryTime && endTime[i] >= queryTime){
                result ++;
            }
        }
        System.out.println(result);
        return result;
    }
}
