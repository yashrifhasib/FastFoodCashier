package Menu.Sides;

import Money.Dime;
import Money.Dollar;
import Money.Penny;
import Money.Quarter;

public class CheeseSticks implements Side {
    /**
     * Instance variables
     */
    private Dollar dollar;
    private Quarter quarter;
    private Dime dime;
    private Penny penny;

    /**
     * Constructor
     */
    public CheeseSticks() {
        dollar = new Dollar(1);
        quarter = new Quarter(1);
        dime = new Dime(2);
        penny = new Penny(4);
    }

    public void add(Dollar dollar, Quarter quarter, Dime dime, Penny penny) {
        dollar.addDollar(this.dollar.getDollarCount());
        quarter.addQuarter(this.quarter.getQuarter());
        dime.addDime(this.dime.getDime());
        penny.addPenny(this.penny.getPenny());
    }

    /**
     * gets the Price
     * @return the price of cheese sticks
     */
    public double getPrice() {
        return dollar.getDollar() + quarter.getDollar() + dime.getDollar() + penny.getDollar();
    }

    public String toString() { return "Cheese Sticks"; }
}
