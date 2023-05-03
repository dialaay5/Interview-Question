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


    public static void twoSum2(Integer target, Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.printf("index: [%d, %d]", j, i);
                }
            }
        }
    }


    public static void main(String[] args) {
        Integer[] arr = {1, 30, 12, 4, 51};
        twoSum1(81, arr);
        twoSum2(81, arr);
        System.out.printf("\n השיטה הכי טובה מבחינת ביצועים היא השיטה הראשונה כי היא יותר מהירה ויעילה יותר ");
    }
}