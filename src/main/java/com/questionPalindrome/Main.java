package com.questionPalindrome;

public class Main {
    public static void main(String[] args) {
        String input = "ababa";
        String reverse_input = "";
        for (int i = 0; i < input.length(); i++) {
            reverse_input = input.charAt(i) + reverse_input;
        }
        if (reverse_input.equals(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

