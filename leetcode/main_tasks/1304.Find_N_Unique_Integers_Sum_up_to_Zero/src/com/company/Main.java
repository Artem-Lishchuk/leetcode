package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        new Solution().sumZero(4);
    }
}
class Solution {
    public int[] sumZero(int n){
        int a[];
        int len =0;
        a = new int[n];
        if ( n % 2 == 1){
            a[0] = 0;
            n--;
            int i = 1;
            while (n > 0){
                a[i] = Integer.valueOf(n / 2);
                a[i + 1] = Integer.valueOf(-(n / 2));
                i += 2;
                n -= 2;
            }
        }
        else{
            int i = 0;
            while (n > 0) {
                a[i] = Integer.valueOf(n / 2);
                a[i + 1] = Integer.valueOf(-(n / 2));
                i += 2;
                n -= 2;
            }
            }
        return a;
    }
}
