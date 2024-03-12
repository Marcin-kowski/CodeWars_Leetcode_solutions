package org.example.solutions.ReverseWords;



public class Kata
{
  public static String reverseWords(final String original)
  {
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringBuilderResult = new StringBuilder();
    String[] splitString = original.split(" ");

    for (String element : splitString) {
      stringBuilder.append(element).reverse();
      stringBuilderResult.append(stringBuilder).append(" ");
      stringBuilder.delete(0, stringBuilder.length());
    }
    return stringBuilderResult.deleteCharAt(stringBuilderResult.length()-1).toString();
  }
}