public class Dime {
    /**
     * Instance variable
     */
    private Nickel dime;

    /**
     * Constructor
     * @param dime number of dimes
     */
    public Dime(int dime) { this.dime = new Nickel(dime); }

    /**
     * Constructor
     * Sets Dime count to 1;
     */
    public Dime() { this.dime.modifyNickel(1); }

    /**
     * Gets the number of dimes
     * @return number of dimes
     */
    public int getDime() { return this.dime.getNickel(); }

    /**
     * Gets the money consisting of dimes
     * @return Dimes.
     */
    public double getDollar() { return this.dime.getDollar() * 2;}

    /**
     * Changes dime
     * @param dime number of dimes.
     */
    public void modifyDime(int dime) { this.dime.modifyNickel(dime); }

    /**
     * Adds dime
     * @param dime number of dime
     */
    public void addDime(int dime) { this.dime.addNickel(dime); }

    /**
     * Subtracts dime
     * @param dime number of dimes
     */
    public void takeDime(int dime) { this.dime.takeNickel(dime); }

    /**
     * toString method
     * @return String of the money.
     */
    public String toString() {
        Nickel newDime = new Nickel(this.dime.getNickel());
        newDime.modifyNickel(newDime.getNickel() * 2);
        return newDime.toString();
    }
}
