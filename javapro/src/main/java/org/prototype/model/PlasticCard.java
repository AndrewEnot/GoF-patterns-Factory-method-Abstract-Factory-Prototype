package org.prototype.model;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 7:50
 */
public class PlasticCard extends Card {

  private final String fieldUse;

  public PlasticCard(double weight, double length, String fieldUse) {
    super("plastic", weight, length);
    this.fieldUse = fieldUse;
  }
}
