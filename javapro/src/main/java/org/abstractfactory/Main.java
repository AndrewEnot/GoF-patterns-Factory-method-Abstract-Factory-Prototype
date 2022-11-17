package org.abstractfactory;

import org.abstractfactory.api.Drink;
import org.abstractfactory.api.Food;
import org.abstractfactory.api.FoodFactory;
import org.abstractfactory.model.factories.Bakery;
import org.abstractfactory.model.factories.Confectionery;


/*
 * @author Oksiuta Andrii
 * $DATE
 * $TIME
 */
public class Main {

  public static void main(String[] args) {
    FoodFactory bakery = new Bakery(150, "BakerStreet", "Santano", "Italian");
    FoodFactory confectionery = new Confectionery(90, "Manghosova", "creamy");

    Food bakeryFood = bakery.createFood();
    Drink bakeryDrink = bakery.createDrink();
    bakery.printMenu(bakeryFood, bakeryDrink);

    Food confectioneryFood = confectionery.createFood();
    Drink confectioneryDrink = confectionery.createDrink();
    confectionery.printMenu(confectioneryFood, confectioneryDrink);
  }
}