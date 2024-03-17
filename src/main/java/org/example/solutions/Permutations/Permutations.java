package org.example.solutions.Permutations;

import java.util.HashSet;
import java.util.List;

class Permutations {
    static HashSet<String> uniquePermutations;
    public static void permutation(String str) {
        permutation("", str);
    }

    public static void permutation(String prefix, String str) {
        int stringLength = str.length();
        if (stringLength==0) {
            uniquePermutations.add(prefix);
        } else {
            for (int i = 0; i < stringLength; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, stringLength));
            }
        }
    }
    public static List<String> singlePermutations(String s) {
        uniquePermutations = new HashSet<>();
        permutation(s);
        return uniquePermutations.stream().toList();
    }
}