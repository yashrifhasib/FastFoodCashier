package Menu.Drinks;

import Money.Dime;
import Money.Dollar;
import Money.Nickel;
import Money.Penny;

public class Soda implements Drink {
    /**
     * Instance variables
     */
    private Dollar dollar;
    private Dime dime;
    private Nickel nickel;
    private Penny penny;

    /**
     * Constructor
     */
    public Soda() {
        dollar = new Dollar(1);
        dime = new Dime(1);
        nickel = new Nickel(1);
        penny = new Penny(4);
    }

    /**
     * gets the Price
     * @return the price of soda
     */
    public double getPrice() {
        return dollar.getDollar() + dime.getDollar() + nickel.getDollar() + penny.getDollar();
    }

    public String toString() { return "Soda"; }
}
