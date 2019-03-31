package Menu.Drinks;

import Money.*;

public class BottledWater implements Drink {
    /**
     * Instance variables
     */
    private Dollar dollar;
    private Quarter quarter;

    /**
     * Constructor
     */
    public BottledWater() {
        dollar = new Dollar(1);
        quarter = new Quarter(1);
    }

    public void add(Dollar dollar, Quarter quarter) {
        dollar.addDollar(this.dollar.getDollarCount());
        quarter.addQuarter(this.quarter.getQuarter());
    }

    /**
     * gets the Price
     * @return the price of bottled water
     */
    public double getPrice() {
        return dollar.getDollar() + quarter.getDollar();
    }

    public String toString() { return "Bottled Water"; }
}
