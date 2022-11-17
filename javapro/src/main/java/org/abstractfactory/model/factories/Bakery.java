package org.abstractfactory.model.factories;

import org.abstractfactory.api.Drink;
import org.abstractfactory.api.Food;
import org.abstractfactory.api.FoodFactory;
import org.abstractfactory.model.products.Bread;
import org.abstractfactory.model.products.Kvas;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 13:44
 */
public class Bakery extends FoodFactory {

  private final String retail;
  private final String cuisine;

  public Bakery(double area, String brand, String retail, String cuisine) {
    super(area, brand);
    this.retail = retail;
    this.cuisine = cuisine;
  }

  @Override
  public Food createFood() {
    return new Bread("Hala", 0.75, 2, "poppy");
  }

  @Override
  public Drink createDrink() {
    return new Kvas("Ukrainian", 2, "glass bottle", 0.5, "hop");
  }

}
