package Menu.Sides;

import Money.Dime;
import Money.Penny;
import Money.Quarter;

public class FrenchFries implements Side {
    /**
     * Instance variables
     */
    private Quarter quarter;
    private Dime dime;
    private Penny penny;

    /**
     * Constructor
     */
    public FrenchFries() {
        quarter = new Quarter(3);
        dime = new Dime(2);
        penny = new Penny(4);
    }

    public void add(Quarter quarter, Dime dime, Penny penny) {
        quarter.addQuarter(this.quarter.getQuarter());
        dime.addDime(this.dime.getDime());
        penny.addPenny(this.penny.getPenny());
    }

    /**
     * gets the Price
     * @return the price of french fries
     */
    public double getPrice() {
        return quarter.getDollar() + dime.getDollar() + penny.getDollar();
    }

    public String toString() { return "French Fries"; }
}
