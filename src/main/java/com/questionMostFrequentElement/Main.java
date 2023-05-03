package com.questionMostFrequentElement;

import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 1, 12, 4};

        System.out.println("Question 1: by looping the array one time.");
        HashMap<Integer, Integer> counter_numbers = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (counter_numbers.containsKey(numbers[i])) {
                counter_numbers.replace(numbers[i], counter_numbers.get(numbers[i]) + 1);
            } else {
                counter_numbers.put(numbers[i], 1);
            }
        }

        for (var entry : counter_numbers.entrySet()) {
            if(entry.getValue() == Collections.max(counter_numbers.values())){
                System.out.printf("%d appears max times %d times.\n\n", entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Question 2: by looping the array more than one time.");
        int max_times_the_number_appears = 0;
        int the_number = 0;
        for (int i = 0; i < numbers.length; i++) {
            int counter = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    counter++;
                }
            }
            if(counter > max_times_the_number_appears){
                max_times_the_number_appears = counter;
                the_number = numbers[i];
            }
        }
        System.out.printf("%d appears max times %d times.\n\n", the_number, max_times_the_number_appears);

    }

}



