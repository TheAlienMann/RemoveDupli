package com.thealienmann;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicates {
    public static String removeDupl(String str) {
        if (str.length() < 2)
            return str;

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
}
