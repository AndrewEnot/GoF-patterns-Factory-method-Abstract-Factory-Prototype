package org.factorymethod.model;

import org.factorymethod.api.Product;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 20:26
 */
public class Croissant implements Product {

  private final String receipt;
  private final double weight;
  private final String filling;

  public Croissant(String receipt, double weight, String filling) {
    this.receipt = receipt;
    this.weight = weight;
    this.filling = filling;
  }

  @Override
  public void using() {
    System.out.println("Eating... " + receipt);
  }
}
