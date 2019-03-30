package Menu.Sides;

import Money.*;

public class Rice implements Side {
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
    public Rice() {
        dollar = new Dollar(1);
        dime = new Dime(1);
        nickel = new Nickel(1);
        penny = new Penny(4);
    }

    /**
     * gets the Price
     * @return the price of rice
     */
    public double getPrice() {
        return dollar.getDollar() + dime.getDollar() + nickel.getDollar() + penny.getDollar();
    }

    public String toString() { return "Rice"; }
}
