package org.factorymethod;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.factorymethod.api.Creatable;
import org.factorymethod.api.Product;
import org.factorymethod.model.CoffeeMachine;
import org.factorymethod.model.Oven;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 20:30
 */
public class Main {

  public static void main(String[] args) {
    List<Creatable> producers = new ArrayList<>();
    producers.add(new CoffeeMachine("LaMarzocco", "GB5",
        LocalDate.of(2013, 10, 11), 3500));
    producers.add(new Oven("TEFAL", "SH804",
        LocalDate.of(2020, 11, 11), 2500));

    List<Product> products = new ArrayList<>();
    for (Creatable producer : producers) {
      products.add(producer.factoryMethod());
    }
    products.forEach(Product::using);
  }
}
