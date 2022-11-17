package org.prototype.model;

/*
 * @author Oksiuta Andrii
 * 17.11.2022
 * 8:10
 */
public class BankCard extends PaymentCard {

  private String bank;
  private String program;

  public BankCard(String system, String type) {
    super(system, type);
  }

  public BankCard(String system, String type, String bank, String program) {
    super(system, type);
    this.bank = bank;
    this.program = program;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public void setProgram(String program) {
    this.program = program;
  }

  public String getBank() {
    return bank;
  }

  public String getProgram() {
    return program;
  }
}
