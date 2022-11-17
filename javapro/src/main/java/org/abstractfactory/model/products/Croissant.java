package org.abstractfactory.model.products;

import org.abstractfactory.api.Food;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 17:08
 */
public class Croissant extends Food {

  private final String filling;

  public Croissant(String name, double weight, double price, String filling) {
    super(name, weight, price);
    this.filling = filling;
  }

  @Override
  public String toString() {
    return super.toString() + "\t" + "filling=" + filling;
  }
}
