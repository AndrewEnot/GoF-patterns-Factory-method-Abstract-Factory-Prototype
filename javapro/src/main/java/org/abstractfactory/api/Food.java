package org.abstractfactory.api;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 12:12
 */
public abstract class Food {

  private String name;
  private double weight;
  private double price;

  protected Food() {
  }

  protected Food(String name, double weight, double price) {
    this.name = name;
    this.weight = weight;
    this.price = price;
  }

  @Override
  public String toString() {
    return "name=" + name + "\t" +
        "weight=" + weight + "\t" +
        "price=" + price;
  }

  public String getName() {
    return name;
  }

}
