package Menu.Desserts;

import Money.Dime;
import Money.Penny;
import Money.Quarter;

public class Cookie implements Dessert {
    /**
     * Instance variables
     */
    private Dime dime;
    private Quarter quarter;
    private Penny penny;

    /**
     * Constructor
     */
    public Cookie() {
        quarter = new Quarter(3);
        dime = new Dime(1);
        penny = new Penny(4);
    }

    public void add(Quarter quarter, Dime dime, Penny penny) {
        quarter.addQuarter(this.quarter.getQuarter());
        dime.addDime(this.dime.getDime());
        penny.addPenny(this.penny.getPenny());
    }

    /**
     * gets the Price
     * @return the price of Cookie
     */
    public double getPrice() {
        return dime.getDollar() + quarter.getDollar() + penny.getDollar();
    }
    public String toString() { return "Cookie"; }
}
