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

    /**
     * gets the Price
     * @return the price of bottled water
     */
    public double getPrice() {
        return dollar.getDollar() + quarter.getDollar();
    }

    public String toString() { return "Bottled Water"; }
}
