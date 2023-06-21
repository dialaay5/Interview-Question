package com.questionTwoSum;

import java.util.HashMap;

public class Main {
    public static void twoSum1(Integer target, Integer[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target - arr[i])){
                System.out.printf("index: [%d, %d]\n", i, map.get(target - arr[i]));
            }
            else{
                map.put(arr[i], i);
            }
        }
    }



    public static int[] twoSum2(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[]{};
        } else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i == j) {
                        continue;
                    } else {
                        if (nums[i] + nums[j] == target) {
                            return new int[]{i, j};
                        }
                    }
                }
            }
            return new int[]{};
        }
    }



    public static void main(String[] args) {
        Integer[] arr = {1, 30, 12, 4, 51};
        twoSum1(81, arr);
        System.out.printf("\n השיטה הכי טובה מבחינת ביצועים היא השיטה הראשונה כי היא יותר מהירה ויעילה יותר ");
    }
}