package org.example.solutions.MaximumSubarraySum;

public class Max {
  public static int sequence(int[] arr) {
    int maximumSoFar = 0;
    int maximumEndingHere = 0;

    for (int current : arr) {
      maximumEndingHere = Math.max(0, maximumEndingHere + current);
      maximumSoFar = Math.max(maximumSoFar, maximumEndingHere);
    }
    return maximumSoFar;
  }
}