package com.company;

import jdk.jshell.execution.JdiInitiator;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int [] a= {3,5,1};
       new Solution().canMakeArithmeticProgression(a);
    }
}
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        boolean gg = true;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i : arr){
            ar.add(i);
        }

        int max =0 , min = 100000;
        var difference = 0;
        for(int i : arr){
            if(i > max){
                max = i;
            }
            if (i < min){
                min = i;
            }
        }
        System.out.printf("max - %d , min - %d%n" , max, min);
        difference = (max - min)/(ar.size()-1);
        if (difference - Integer.valueOf(difference) != 0){
            gg = false;
            System.out.println("fsdfsdf");
        }
        else{
            difference = Integer.valueOf(difference);
        }
        System.out.println(difference);
        for(int i: ar){
            System.out.print(i + "  ");
        }
        Collections.sort(ar);


        while ( min <= max ){
            if( ar.contains(min+difference) == false ){
                gg=false;
            }
            min += difference;
        }
        System.out.println(gg);
        return gg;
    }
}
