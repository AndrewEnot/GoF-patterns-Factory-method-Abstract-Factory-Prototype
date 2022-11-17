package org.abstractfactory.api;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 16:42
 */
public abstract class Drink {

  private String name;
  private double price;
  private String container;
  private double capacity;

  protected Drink() {
  }

  protected Drink(String name, double price, String container, double capacity) {
    this.name = name;
    this.price = price;
    this.container = container;
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return "name=" + name + "\t" +
        "container=" + container + "\t" +
        "price=" + price + "\t" +
        "capacity=" + capacity;
  }

  public String getName() {
    return name;
  }
}
