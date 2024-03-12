package org.example.solutions.KeypadTextEntry;

public class KeypadBetterSolution {
  public static int presses(String phrase) {
    final String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};
    int sum = 0;

    for (char c : phrase.toUpperCase().toCharArray()) {
      for (String s : keys) {
        sum += s.indexOf(c) + 1;
      }
    }



    return sum;
  }
}
