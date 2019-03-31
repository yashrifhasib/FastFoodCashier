package Menu.Entrees;

import Money.Dollar;
import Money.Penny;
import Money.Quarter;

public class VeggieSandwich implements Sandwich {
    /**
     * Instance variables
     */
    private Dollar dollar;
    private Quarter quarter;
    private Penny penny;

    /**
     * Constructor
     */
    public VeggieSandwich() {
        dollar = new Dollar(2);
        quarter = new Quarter(1);
        penny = new Penny(4);
    }

    public void add(Dollar dollar, Quarter quarter, Penny penny) {
        dollar.addDollar(this.dollar.getDollarCount());
        quarter.addQuarter(this.quarter.getQuarter());
        penny.addPenny(this.penny.getPenny());
    }

    /**
     *
     * @return The price of the Veggie Menu.Entrees.Sandwich
     */
    public double getPrice() {
        return dollar.getDollar() + quarter.getDollar() + penny.getDollar();
    }

    public String toString() { return "Veggie Sandwich"; }
}
