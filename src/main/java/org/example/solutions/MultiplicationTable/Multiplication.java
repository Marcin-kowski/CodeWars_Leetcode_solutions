package org.example.solutions.MultiplicationTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Multiplication{
  public static int[][] multiplicationTable(int n) {
      int[][] mTable = new int[n][n];
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              mTable[i][j] = (i+1)*(j+1);
          }
      }


    return mTable;
  }
}