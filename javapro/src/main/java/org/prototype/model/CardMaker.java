package org.prototype.model;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 7:56
 */
public class CardMaker<T extends Card> {

  private final T card;

  public CardMaker(T card) {
    this.card = card;
  }

  /**
   * This method creates clones of card
   */
  public T conveyor() throws CloneNotSupportedException {
    return (T) this.card.clone();
  }
}
