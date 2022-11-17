package org.abstractfactory.model.products;

import org.abstractfactory.api.Food;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 12:29
 */
public class Bread extends Food {

  private String specialIngredient;

  public Bread() {
  }

  @Override
  public String toString() {
    return super.toString() + "\t" + "specialIngredient" + specialIngredient;
  }

  public Bread(String name, double weight, double price, String specialIngredient) {
    super(name, weight, price);
    this.specialIngredient = specialIngredient;
  }
}
