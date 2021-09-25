package vm;

public class Coins extends MoneySlots {

  private double coinValue;

  public double getCoinValue() {
    return coinValue;
  }

  public void setCoinValue(double coinValue) {
    this.coinValue = coinValue;
  }

  public Coins(int ID, String type) {
    super(ID, type);
  }

}