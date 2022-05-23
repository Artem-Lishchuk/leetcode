package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int [] a= {1,1,2};
        new Solution().removeDuplicates(a);

    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        if (nums.length == 0) return 0;
        for (int j =1; j< nums.length; j++){
            if (nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
   }
}
