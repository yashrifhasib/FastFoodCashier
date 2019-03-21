public class Nickel {
    /**
     * Instance Variables
     */
    private Penny nickel;

    /**
     * Constructor
     * @param nickel The number of nickels
     */
    public Nickel(int nickel) { this.nickel = new Penny(nickel); }

    /**
     * Constructor
     * Makes 1 nickel
     */
    public Nickel() { this.nickel = new Penny(1); }

    /**
     * Accessor
     * @return Amount created by nickels
     */
    public int getNickel() { return this.nickel.getPenny(); }

    public double getDollar() { return this.nickel.getDollar() * 5;}

    /**
     * Modifiers
     * Sets the parameter to the instance variable
     * @param nickel The number of nickels
     */
    public void modifyNickel(int nickel) { this.nickel.modifyPenny(nickel); }

    /**
     * Adds the parameter to the instance variable
     * @param nickel the number of nickels
     */
    public void addNickel(int nickel) { this.nickel.addPenny(nickel); }

    /**
     * Subtracts the parameter from the instance variable
     * @param nickel the number of nickels
     */
    public void takeNickel(int nickel) { this.nickel.takePenny(nickel);}

    /**
     * ToString Method for Nickels
     * @return A String of money.
     */
    public String toString() {
        Penny newNickel = new Penny(nickel.getPenny());
        newNickel.modifyPenny(newNickel.getPenny() * 5);
        return newNickel.toString();
    }
}
