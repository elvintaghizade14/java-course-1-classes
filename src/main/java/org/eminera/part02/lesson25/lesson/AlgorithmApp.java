package org.eminera.part02.lesson25.lesson;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class AlgorithmApp {
  public static void main(String[] args) {

    List<Integer> integers = new Random()
            .ints(20L, 0, 200)
            .boxed()
//            .limit(10L)
            .collect(Collectors.toList());

    integers.sort((i1, i2) -> - i1 + i2);
    System.out.println(integers);
    integers.sort((i1, i2) -> i1 - i2);
    System.out.println(integers);

  }
}