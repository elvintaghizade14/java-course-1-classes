package org.eminera.part01.oop.lesson24.faq.controller;

import org.eminera.part01.oop.lesson24.faq.Pizza;
import org.eminera.part01.oop.lesson24.faq.service.Service;

public class Controller {
  private static final Service SERVICE = new Service();
  public void aVoid() {
    Pizza pizza = SERVICE.getPizza();
    pizza.setPrice(0D);
    System.out.println(pizza);
    System.out.println(SERVICE.getPizza());

  }
}
