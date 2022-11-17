package org.abstractfactory.model.factories;

import org.abstractfactory.api.Drink;
import org.abstractfactory.api.Food;
import org.abstractfactory.api.FoodFactory;
import org.abstractfactory.model.products.Croissant;
import org.abstractfactory.model.products.SodaDrink;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 17:05
 */
public class Confectionery extends FoodFactory {

  private final String technology;

  public Confectionery(double area, String brand, String technology) {
    super(area, brand);
    this.technology = technology;
  }

  @Override
  public Food createFood() {
    return new Croissant("French", 0.15, 2, "vanilla");
  }

  @Override
  public Drink createDrink() {
    return new SodaDrink("Classic", 3, "glass bottle", 0.33,
        "cream soda");
  }
}
