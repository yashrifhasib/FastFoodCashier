package Menu.Drinks;
import Money.*;

public class Juice implements Drink {
    /**
     * Instance variables
     */
    private Dollar dollar;
    private Quarter quarter;
    private Dime dime;
    private Nickel nickel;
    private Penny penny;

    /**
     * Constructor
     */
    public Juice() {
        dollar = new Dollar(1);
        quarter = new Quarter(2);
        dime = new Dime(1);
        nickel = new Nickel(1);
        penny = new Penny(4);
    }

    /**
     * gets the Price
     * @return the price of Juice
     */
    public double getPrice() { return dollar.getDollar() + quarter.getDollar() + dime.getDollar() + nickel.getDollar() + penny.getDollar(); }

    public String toString() { return "Juice"; }
}
