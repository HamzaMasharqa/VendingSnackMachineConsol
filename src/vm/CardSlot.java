package vm;

public class CardSlot extends MoneySlots {

  private int cardId;
  private int password;
  private double amount;

  public CardSlot(int ID, String type, int cardId, int password) {
    super(ID, type);
    this.cardId = cardId;
    this.password = password;
  }

  public int getCardId() {
    return cardId;
  }

  public void setCardId(int cardId) {
    this.cardId = cardId;
  }

  public int getPassword() {
    return password;
  }

  public void setPassword(int password) {
    this.password = password;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

}