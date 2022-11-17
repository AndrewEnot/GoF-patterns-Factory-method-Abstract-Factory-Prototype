package org.factorymethod.model;

import java.time.LocalDate;
import org.factorymethod.api.Creatable;
import org.factorymethod.api.Product;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 20:24
 */
public class Oven implements Creatable {

  private final String brand;
  private final String model;
  private final LocalDate dateProduction;
  private final int power;

  public Oven(String brand, String model, LocalDate dateProduction, int power) {
    this.brand = brand;
    this.model = model;
    this.dateProduction = dateProduction;
    this.power = power;
  }

  @Override
  public Product factoryMethod() {
    return new Croissant("French croissant", 150, "vanilla");
  }
}
