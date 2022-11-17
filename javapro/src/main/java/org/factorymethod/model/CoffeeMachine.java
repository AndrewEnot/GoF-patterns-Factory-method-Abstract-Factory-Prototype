package org.factorymethod.model;

import java.time.LocalDate;
import org.factorymethod.api.Creatable;
import org.factorymethod.api.Product;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 20:11
 */
public class CoffeeMachine implements Creatable {

  private final String brand;
  private final String model;
  private final LocalDate dateProduction;
  private final int power;

  public CoffeeMachine(String brand, String model, LocalDate dateProduction, int power) {
    this.brand = brand;
    this.model = model;
    this.dateProduction = dateProduction;
    this.power = power;
  }

  @Override
  public Product factoryMethod() {
    return new Coffee("Espresso", 35, 55);
  }
}
