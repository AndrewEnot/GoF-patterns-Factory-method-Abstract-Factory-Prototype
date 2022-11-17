package org.abstractfactory.api;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 12:09
 */
public abstract class FoodFactory {

  private final double area;
  private final String brand;

  protected FoodFactory(double area, String brand) {
    this.area = area;
    this.brand = brand;
  }

  public abstract Food createFood();

  public abstract Drink createDrink();

  public void printMenu(Food food, Drink drink) {
    if (food != null && drink != null) {
      System.out.println("Name of the Factory: " + brand);
      System.out.println(food);
      System.out.println(drink);
    }
  }
}

