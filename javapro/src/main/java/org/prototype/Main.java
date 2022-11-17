package org.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.prototype.model.BankCard;
import org.prototype.model.CardMaker;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 8:02
 */
public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {

    CardMaker<BankCard> paymentCardMachine =
        new CardMaker<>(new BankCard("Visa", "Infinite"));

    List<BankCard> party = new ArrayList<>();

    /*create clones of cards*/
    for (int i = 0; i < 100; i++) {
      party.add(paymentCardMachine.conveyor());
    }

    /*fulfill data to cards*/
    party.stream()
        .peek(a -> a.setBank("OBank"))
        .peek(a -> a.setProgram("salary"))
        .skip(25)
        .peek(a -> a.setProgram("corporate"))
        .skip(25)
        .peek(a -> a.setBank("Mono"))
        .peek(a -> a.setProgram("credit"))
        .skip(25)
        .peek(a -> a.setProgram("shops"))
        .collect(Collectors.toList());

    /*create map with cards using as a key name of the Bank*/
    Map<String, List<BankCard>> partyCards = new HashMap<>();

    party.stream()
        .map(BankCard::getBank)
        .distinct()
        .forEach(key -> partyCards.put(key, party.stream()
            .filter(a -> a.getBank().equals(key))
            .collect(Collectors.toList())));

    System.out.println(partyCards);
  }
}
