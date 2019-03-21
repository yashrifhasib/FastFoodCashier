package Money;

public class Quarter {
    /**
     * Instance variable
     */
    private Nickel quarter;

    /**
     * Constructor
     * @param quarter number of quarters
     */
    public Quarter(int quarter) { this.quarter= new Nickel(quarter); }

    /**
     * Constructor
     * Sets Money.quarter count to 1;
     */
    public Quarter() { this.quarter.modifyNickel(1); }

    /**
     * Gets the number of quarters
     * @return number of quarters
     */
    public int getQuarter() { return this.quarter.getNickel(); }

    /**
     * Gets the money consisting of quarters
     * @return quarters.
     */
    public double getDollar() { return this.quarter.getDollar() * 5;}

    /**
     * Changes quarter
     * @param quarter number of quarters.
     */
    public void modifyQuarter(int quarter) { this.quarter.modifyNickel(quarter); }

    /**
     * Adds quarter
     * @param quarter number of quarter
     */
    public void addQuarter(int quarter) { this.quarter.addNickel(quarter); }

    /**
     * Subtracts quarter
     * @param quarter number of quarters
     */
    public void takeQuarter(int quarter) { this.quarter.takeNickel(quarter); }

    /**
     * toString method
     * @return String of the money.
     */
    public String toString() {
        Nickel newQuarter = new Nickel(this.quarter.getNickel());
        newQuarter.modifyNickel(newQuarter.getNickel() * 5);
        return newQuarter.toString();
    }
}
