package org.eminera.basic.lesson13.exam;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LetterCountingApp {
  public static void main(String[] args) {
//    1. input
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

//    2. process
    Map<Integer, Long> output = process(line);

//    3. output
    showOutput(output);
  }

  private static void showOutput(Map<Integer, Long> output) {
    output.entrySet()
            .stream()
            .map(entry -> String.format("%s -> %d", (char) ((int) entry.getKey()), entry.getValue()))
            .forEach(System.out::println);
  }

  private static Map<Integer, Long> process(String line) {
    return line.chars()
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }
}
