package org.eminera.oop.lesson24.faq;

public class Pizza implements Cloneable {
  private Double price;
  private String name;

  public Pizza(Double price, String name) {
    this.price = price;
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Pizza{price=%s, name='%s'}", price, name);
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
