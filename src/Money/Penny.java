package Money;

public class Penny {
    /**
     * Instance variable
     */
    private int penny;

    //Constructors
    /**
     * Constructor for a specific amount of pennies
     * @param penny Set the instance variable equal to the parameter.
     */
    public Penny(int penny) { this.penny = penny; }

    /**
     * Constructor for setting Money.Penny Object to 1.
     */
    public Penny() { this.penny = 1; }

    //Accessors
    /**
     * Accessor
     * @return The penny count
     */
    public int getPenny() { return this.penny; }

    /**
     * A dollar amount
     * @return the number of dollars
     */
    public double getDollar() { return (double) (this.penny) / 100;}

    //Modifiers
    /**
     * Modifier
     * @param penny Modifier for penny count.
     */
    public void modifyPenny(int penny) { this.penny = penny; }

    /**
     * Adds pennies to instance varialbe
     * @param penny adder
     */
    public void addPenny(int penny) { this.penny += penny; }

    /**
     * Takes away pennies from instance variable
     * @param penny taker
     */
    public void takePenny(int penny) { this.penny -= penny; }

    //Overrides
    /**
     * To String method
     * @return The penny in dollars.
     */
    public String toString() { return Double.toString((double) (this.penny) / 100); }
}
