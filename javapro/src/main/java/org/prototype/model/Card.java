package org.prototype.model;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 7:31
 */
public class Card implements Cloneable {

  private String material;
  private double width;
  private double length;

  public Card() {
  }

  public Card(String material, double width, double length) {
    this.material = material;
    this.width = width;
    this.length = length;
  }

  @Override
  protected Card clone() throws CloneNotSupportedException {
    return (Card) super.clone();
  }
}
