package org.example.solutions.KeypadTextEntry;

public class Keypad {
  public static int presses(String phrase) {
    final String oneKeyPress = "1AaDdGgJjMmPpTtWw*# ";
    final String twoKeyPress = "BbEeHhKkNnQqUuXx0";
    final String threeKeyPress = "CcFfIiLlOoRrVvYy";
    final String fourKeyPress = "23456Ss8Zz";
    final String fiveKeyPress = "79";
    int sum = 0;

    for (int i = 0; i < phrase.length(); i++) {
      if (oneKeyPress.indexOf(phrase.charAt(i)) != -1) {
        sum+=1;
      }
      if (twoKeyPress.indexOf(phrase.charAt(i)) != -1) {
        sum+=2;
      }
      if (threeKeyPress.indexOf(phrase.charAt(i)) != -1) {
        sum+=3;
      }
      if (fourKeyPress.indexOf(phrase.charAt(i)) != -1) {
        sum+=4;
      }
      if (fiveKeyPress.indexOf(phrase.charAt(i)) != -1) {
        sum+=5;
      }


    }
    return sum;
  }
}
