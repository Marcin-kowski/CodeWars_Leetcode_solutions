package org.example.solutions.SumStringsAsNumbers;

public class Kata {
  public static String sumStrings(String a, String b) {
    char[] number1 = a.toCharArray();
    char[] number2 = b.toCharArray();
    char[] sum = new char[number1.length + 1];
    char carry = '\u0000';
    for (char i = (char)(number1.length - 1); i != '\uFFFF'; i--){
      char aSum = (char) (number1[i] + number2[i] - '0' + carry);
      carry = aSum > '9' ? '\u0001' : '\u0000';
      aSum = (carry == '\u0001') ? (char) (aSum - '\n') : aSum;
      sum[i + 1] = aSum;
    }
    sum[0] = (char)('0' + carry);
    return new String(sum).substring(1);
  }
}