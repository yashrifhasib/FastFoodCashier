package Money;

public class Dollar {
    /**
     * Instance variable
     */
    private Quarter dollar;

    /**
     * Constructor
     * @param dollar number of dollars
     */
    public Dollar(int dollar) { this.dollar = new Quarter(dollar); }

    /**
     * Constructor
     * Sets Money.dollar count to 1;
     */
    public Dollar() { this.dollar = new Quarter(1); }

    /**
     * Gets the count of the bills
     * @return It s the same number as getDollar();
     */
    public int getDollarCount() { return this.dollar.getQuarter(); }

    /**
     * Gets the money consisting of dollars
     * @return dollars.
     */
    public double getDollar() { return this.dollar.getDollar() * 4; }

    /**
     * Changes dollar
     * @param dollar number of dollars.
     */
    public void modifyDollar(int dollar) { this.dollar.modifyQuarter(dollar); }

    /**
     * Adds dollar
     * @param dollar number of dollar
     */
    public void addDollar(int dollar) { this.dollar.addQuarter(dollar); }

    /**
     * Subtracts dollar
     * @param dollar number of dollars
     */
    public void takeDollar(int dollar) { this.dollar.takeQuarter(dollar); }

    /**
     * toString method
     * @return String of the money.
     */
    public String toString() {
        Quarter newDollar = new Quarter(this.dollar.getQuarter());
        newDollar.modifyQuarter(newDollar.getQuarter() * 4);
        return newDollar.toString();
    }
}
