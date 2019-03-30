package Menu.Entrees;

public class EntreeSelector {
    /**
     * Instance variable for picking a part of the menu.
     */
    private Sandwich selectedSandwich;

    /**
     * Customer chooses a random index and one of these get selected.
     * @param rand If rand is over 2 or less than 0, then null will be returned meaning this part of the menu was not selected
     */
    public EntreeSelector(int rand) {
        switch (rand) {
            case 0:
                selectedSandwich = new Hamburger();
                break;
            case 1:
                selectedSandwich = new ChickenSandwich();
                break;
            case 2:
                selectedSandwich = new VeggieSandwich();
                break;
            default:
                selectedSandwich = null;
        }
    }

    /**
     * Gets the price of the product picked
     * @return the price
     */
    public double getPrice() {
        return selectedSandwich.getPrice();
    }

    /**
     * The toString()
     * @return String to represent what burger it is.
     */
    public String toString() {
        return selectedSandwich.toString();
    }
}
