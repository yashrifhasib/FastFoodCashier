package Menu.Entrees;

import Money.Dime;
import Money.Dollar;
import Money.Penny;
import Money.Quarter;

public class ChickenSandwich implements Sandwich {
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
    public ChickenSandwich() {
        dollar = new Dollar(1);
        quarter = new Quarter(3);
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
     *
     * @return The price of the Chicken Menu.Entrees.Sandwich
     */
    public double getPrice() {
        return dollar.getDollar() + quarter.getDollar() + dime.getDollar() + penny.getDollar();
    }

    public String toString() { return "Chicken Sandwich"; }
}
