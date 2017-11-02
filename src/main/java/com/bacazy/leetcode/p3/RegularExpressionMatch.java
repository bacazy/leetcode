package com.bacazy.leetcode.p3;


import java.util.ArrayList;
import java.util.List;

public class RegularExpressionMatch {

    public boolean isMatch(String s, String p) {
        List<Boolean> repeatable = new ArrayList<Boolean>();
        List<Character> pchars = new ArrayList<Character>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c == '*') {
                repeatable.set(repeatable.size() - 1, true);
            } else {
                repeatable.add(false);
                pchars.add(c);
            }
        }
        int j = 0;
        boolean[] marks = new boolean[repeatable.size()];
        int i = 0;
        while (i < s.length() && j < pchars.size()) {
            char sc = s.charAt(i);
            char pc = pchars.get(j);
            boolean repeat = repeatable.get(j);
            if (pc == '.' || sc == pc) {
                i++;
                marks[j] = true;
                if (!repeat) {
                    j++;
                }
            } else if (repeat) {
                j++;
            } else {
                return false;
            }
        }
        if (!(i == s.length() && j == pchars.size())) {
            return false;
        }
        for (boolean b : marks) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

}
