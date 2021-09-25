
package vm;


public class Snacks {
    private int ID;
    private String name;
    private double price;
    private int amount;

    public Snacks(int ID, String name, double price, int amount) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
