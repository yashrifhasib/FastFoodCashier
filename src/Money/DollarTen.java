package Money;

public class DollarTen {
    /**
     * Instance variable
     */
    private DollarFive dollarTen;

    /**
     * Constructor
     * @param dollarTen number of dollars
     */
    public DollarTen(int dollarTen) { this.dollarTen = new DollarFive(dollarTen); }

    /**
     * Constructor
     * Sets Money.dollar count to 1;
     */
    public DollarTen() { this.dollarTen = new DollarFive(1); }

    /**
     * Gets the number of bills
     * @return count of 5 dollar bills
     */
    public int getDollarTen() { return this.dollarTen.getDollarFive(); }

    /**
     * Gets the money consisting of dollars
     * @return dollars.
     */
    public double getDollar() { return this.dollarTen.getDollar() * 2; }

    /**
     * Changes dollar
     * @param dollar number of dollars.
     */
    public void modifyDollarTen(int dollar) { this.dollarTen.modifyDollarFive(dollar); }

    /**
     * Adds dollar
     * @param dollar number of dollar
     */
    public void addDollarTen(int dollar) { this.dollarTen.addDollarFive(dollar); }

    /**
     * Subtracts dollar
     * @param dollar number of dollars
     */
    public void takeDollarTen(int dollar) { this.dollarTen.takeDollarFive(dollar); }

    /**
     * toString method
     * @return String of the money.
     */
    public String toString() {
        DollarFive newDollar = new DollarFive(this.dollarTen.getDollarFive());
        newDollar.modifyDollarFive(newDollar.getDollarFive() * 2);
        return newDollar.toString();
    }
}
