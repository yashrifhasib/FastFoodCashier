package Menu.Desserts;

import Money.*;

public class Pie implements Dessert {
    /**
     * Instance variables
     */
    private Dollar dollar;
    private Dime dime;
    private Quarter quarter;
    private Nickel nickel;
    private Penny penny;

    /**
     * Constructor
     */
    public Pie() {
        dollar = new Dollar(1);
        quarter = new Quarter(2);
        dime = new Dime(1);
        nickel = new Nickel(1);
        penny = new Penny(4);
    }

    public void add(Dollar dollar, Quarter quarter, Dime dime, Nickel nickel, Penny penny) {
        dollar.addDollar(this.dollar.getDollarCount());
        quarter.addQuarter(this.quarter.getQuarter());
        nickel.addNickel(this.nickel.getNickel());
        dime.addDime(this.dime.getDime());
        penny.addPenny(this.penny.getPenny());
    }

    /**
     * gets the Price
     * @return the price of Pie
     */
    public double getPrice() { return dollar.getDollar() + dime.getDollar() + quarter.getDollar() + nickel.getDollar() + penny.getDollar(); }
    public String toString() { return "Pie"; }
}
