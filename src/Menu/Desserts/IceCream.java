package Menu.Desserts;

import Money.*;

public class IceCream implements Dessert {
    /**
     * Instance variables
     */
    private Dollar dollar;
    private Dime dime;
    private Quarter quarter;
    private Penny penny;

    /**
     * Constructor
     */
    public IceCream() {
        dollar = new Dollar(1);
        quarter = new Quarter(3);
        dime = new Dime(1);
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
     * @return the price of Ice cream
     */
    public double getPrice() {
        return dollar.getDollar() + dime.getDollar() + quarter.getDollar() + penny.getDollar();
    }
    public String toString() { return "Ice Cream"; }
}
