package com.yxz.orderserviceconsumer;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        
    }
}
class Solution {
    public int reachNumber(int target) {
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        while (true) {
            if (set.contains(target)) {
                return res;
            }
            res++;
            HashSet<Integer> temp = new HashSet<>();
            for (Integer i : set) {
                temp.add(i - res);
                temp.add(i + res);
            }
            set = temp;
        }
    }
}