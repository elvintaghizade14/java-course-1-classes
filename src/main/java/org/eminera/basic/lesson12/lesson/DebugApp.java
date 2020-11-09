package org.eminera.basic.lesson12.lesson;

public class DebugApp {
  public static void main(String[] args) {
    int[] array = {1, 34, 56, 6, 2, 6, -2};
    int max = array[0];
    int min = array[0];
    int sum = array[0];
    for (int i = 1; i < array.length; i++) {
      max = Math.max(max, array[i]);
      min = Math.min(min, array[i]);
      sum += array[i];
    }
  }
}