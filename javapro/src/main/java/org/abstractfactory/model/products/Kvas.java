package org.abstractfactory.model.products;

import org.abstractfactory.api.Drink;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 14:11
 */
public class Kvas extends Drink {

  private final String mainTaste;

  public Kvas(String name, double price, String container, double capacity, String mainTaste) {
    super(name, price, container, capacity);
    this.mainTaste = mainTaste;
  }

  @Override
  public String toString() {
    return super.toString() + "\t" + "mainTaste=" + mainTaste;
  }
}
