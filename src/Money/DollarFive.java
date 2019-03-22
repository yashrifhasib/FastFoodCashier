package Money;

public class DollarFive {
    /**
     * Instance variable
     */
    private Dollar dollarFive;

    /**
     * Constructor
     * @param dollarFive number of dollars
     */
    public DollarFive(int dollarFive) { this.dollarFive = new Dollar(dollarFive); }

    /**
     * Constructor
     * Sets Money.dollar count to 1;
     */
    public DollarFive() { this.dollarFive = new Dollar(1); }

    /**
     * Gets the number of bills
     * @return count of 5 dollar bills
     */
    public int getDollarFive() { return this.dollarFive.getDollarCount(); }

    /**
     * Gets the money consisting of dollars
     * @return dollars.
     */
    public double getDollar() { return this.dollarFive.getDollar() * 5; }

    /**
     * Changes dollar
     * @param dollar number of dollars.
     */
    public void modifyDollarFive(int dollar) { this.dollarFive.modifyDollar(dollar); }

    /**
     * Adds dollar
     * @param dollar number of dollar
     */
    public void addDollarFive(int dollar) { this.dollarFive.addDollar(dollar); }

    /**
     * Subtracts dollar
     * @param dollar number of dollars
     */
    public void takeDollarFive(int dollar) { this.dollarFive.takeDollar(dollar); }

    /**
     * toString method
     * @return String of the money.
     */
    public String toString() {
        Dollar newDollar = new Dollar(this.dollarFive.getDollarCount());
        newDollar.modifyDollar(newDollar.getDollarCount() * 5);
        return newDollar.toString();
    }
}
