package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    }
    class Solution {
        public String destCity(List<List<String>> paths) {
            ArrayList<String> arr = new ArrayList<String>();
            ArrayList<String> ar = new ArrayList<String>();
            ArrayList<String> ar1 = new ArrayList<String>();
            paths.toArray();
            for (var element: paths) {
                arr.addAll(element);
            }
            for (int i = 1; i < arr.size() ; i += 2) {
                ar1.add(arr.get(i));
                arr.remove(i);
                if (arr.contains(ar1.get(0)) == false) {
                    ar.add(ar1.get(0));
                }
                arr.add(i,ar1.get(0));
                ar1.remove(0);
            }

            System.out.println(ar.get(0));
            return ar.get(0);
        }
    }
}
