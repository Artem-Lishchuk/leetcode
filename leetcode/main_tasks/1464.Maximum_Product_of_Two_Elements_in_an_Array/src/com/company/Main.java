package com.company;

public class Main {

    public static void main(String[] args) {
        int [] a = {1,5,4 ,5};
        new Solution().maxProduct(a);
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        int max = 0 , premax = 0 , ind = -1;
        for (int i = 0; i<nums.length ; i++){
            if(nums[i] >max){
                max = nums[i];
                ind = i;
            }
        }
        for (int i = 0; i<nums.length ; i++){
            if(nums[i] > premax && ind != i){
                premax = nums[i];
            }
        }
        int z = (max-1)*(premax - 1);
        System.out.println(z);
        return z;
    }
}