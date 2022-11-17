package org.factorymethod.model;

import org.factorymethod.api.Product;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 20:15
 */
public class Coffee implements Product {

  private final String receipt;
  private final int volume;
  private final double price;

  public Coffee(String receipt, int volume, double price) {
    this.receipt = receipt;
    this.volume = volume;
    this.price = price;
  }

  @Override
  public void using() {
    System.out.println("Drinking... " + receipt);
  }
}
