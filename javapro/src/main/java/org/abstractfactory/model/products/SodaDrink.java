package org.abstractfactory.model.products;

import org.abstractfactory.api.Drink;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 17:10
 */
public class SodaDrink extends Drink {

  private final String taste;

  public SodaDrink(String name, double price, String container, double capacity, String taste) {
    super(name, price, container, capacity);
    this.taste = taste;
  }

  @Override
  public String toString() {
    return super.toString() + "\t" + "taste=" + taste;
  }
}
