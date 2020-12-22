package org.eminera.oop.lesson24.faq.service;

import org.eminera.oop.lesson24.faq.Pizza;

public class Service {
  public Pizza getPizza() {
    Pizza pizza1 = new Pizza(3.14, "PI");

//    Pizza pizza2 = new Pizza(pizza1.getPrice(), pizza1.getName());
//    System.out.println(pizza1);
//    System.out.println(pizza2);
//    pizza2.setPrice(3.999);
//    System.out.println(pizza1);
//    System.out.println(pizza2);

    try {
      return (Pizza) pizza1.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }
}
