package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int [] a ={1,1,2};
        new Solution().removeDuplicates(a);
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i: nums){
            num.add(i);
        }
        int tmp = 100000000;
        for (int i = 0; i<num.size(); i++){
            tmp = num.get(i);
            num.remove(i);
            if(num.contains(tmp) == false){
                num.add(i,tmp);
            }
        }
        System.out.println(num.size());
        return  num.size();
    }
}

