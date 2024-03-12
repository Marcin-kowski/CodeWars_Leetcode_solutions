package org.example.solutions.Tribonacci;

import java.util.ArrayList;
import java.util.Arrays;

public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
    if(n==0) return new double[0];
    double[] output = new double[n];

    for (int i = 0; i < n; i++) {
      if(i<3) {
        output[i] = s[i];
      } else {
        output[i] += output[i-1]+output[i-2]+output[i-3];
      }
    }
      return output;
  }
}