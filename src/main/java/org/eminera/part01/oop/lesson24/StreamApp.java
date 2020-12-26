package org.eminera.part01.oop.lesson24;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamApp {
  public static void main(String[] args) {
    int[] nums = {2, 3, 4, 5, 6, 7, 8, 9};

    int sum1 = IntStream.of(nums).sum();

    int sum2 = Arrays.stream(nums).sum();
  }
}