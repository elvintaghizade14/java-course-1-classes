package org.eminera.oop.lesson22.lesson.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PizzaApp {
  public static void main(String[] args) {

    Pizza[] pizzas = {
            new Pizza("p1", 1),
            new Pizza("p2", 2),
            new Pizza("p3", 3),
            new Pizza("p4", 4),
            new Pizza("p5", 5),
    };

    for (int i = 0; i < pizzas.length; i++) {
      System.out.println(pizzas[i]);
    }

    System.out.println("=-=-=--=--=-=--");

    for (Pizza pizza : pizzas) {
      System.out.println(pizza);
    }

    // map != xerite
    // map  = manipulate
    //                      IntStream
    // Stream<Pizza> ==> Stream<Integer>  ==> int
    int sum = Arrays.stream(pizzas).mapToInt(pizza -> pizza.price).sum();

    Stream<Pizza> pizzaStream = Arrays.stream(pizzas);
    IntStream intStream = pizzaStream.mapToInt(pizza -> pizza.price);
    int sum1 = intStream.sum();

    System.out.println(sum);

  }
}