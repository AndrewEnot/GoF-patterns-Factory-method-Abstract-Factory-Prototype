package org.prototype.model;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 7:42
 */
public class PaymentCard extends PlasticCard {

  private final String paymentSystem;
  private final String type;

  public PaymentCard(String paymentSystem, String type) {
    super(53.98, 85.60, "payments");
    this.paymentSystem = paymentSystem;
    this.type = type;
  }
}
