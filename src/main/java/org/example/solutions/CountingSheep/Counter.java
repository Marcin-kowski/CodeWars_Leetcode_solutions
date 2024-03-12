package org.example.solutions.CountingSheep;

import java.util.Arrays;

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return (int) Arrays.stream(arrayOfSheeps).filter(sheep -> sheep != null && sheep).count();
  }
}