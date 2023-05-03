package com.questionLongestSubstring;

import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String word = "dialaayoub";
        int sum_of_character = 0;

        HashMap<Character, Integer> counter_character = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (!counter_character.containsKey(word.charAt(i))) {
                counter_character.put(word.charAt(i), 1);
            }
        }
        for (var entry : counter_character.entrySet()) {
            sum_of_character += entry.getValue();
        }
        System.out.println(sum_of_character);
    }
}




