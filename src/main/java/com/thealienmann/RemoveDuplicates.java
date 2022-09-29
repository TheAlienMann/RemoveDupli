package com.thealienmann;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicates {

    public static String removeDupl(String name) {
        if (name.length() < 2)
            return name;
        name = name.replaceAll("[\\s0-9]", "");
        // it's better to using StringBuilder instead of String in the line below.
        StringBuilder converted = new StringBuilder();
        char charAtHand = name.charAt(0);
        if (name.length() < 256) {
            for (int i = 1; i < name.length(); i++) {
                char character = name.charAt(i);
                if (charAtHand == character) {
                    continue;
                } else {
                    charAtHand = character;
                    converted.append(character);
                }
//                if (converted.toString().indexOf(character) == -1) {
//                    converted.append(character);
//                }
            }
        }
        return name.charAt(0) + converted.toString().toLowerCase();
    }

    /*
    public static String removeDupl(String str) {
        if (str.length() < 2) // here i am checking an edge case, where if the input is a space or just a character, then i can return immediately
            return str;

        // here i am removing all the spaces and numbers.
        str = str.replaceAll("[\\s0-9]", "");
        int[] lastIndex = new int[26];
        for (int idx = 0; idx < str.length(); idx++)
            lastIndex[str.charAt(idx) - 'a'] = idx;
        boolean[] seen = new boolean[26];
        Stack<Integer> stack = new Stack<>();
        for (int idx = 0; idx < str.length(); idx++) {
            int chr = str.charAt(idx) - 'a';
            if (seen[chr]) continue;
            while (!stack.isEmpty() && stack.peek() > chr && idx < lastIndex[stack.peek()])
                seen[stack.pop()] = false;
            stack.push(chr);
            seen[chr] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append((char) (stack.pop() + 'a'));
        return sb.reverse().toString();
    }
     */
}
