package Menu;

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

    /**
     *
     * @return The price of the Chicken Sandwich
     */
    public double getPrice() {
        return dollar.getDollar() + quarter.getDollar() + dime.getDollar() + penny.getDollar();
    }
}
