package Menu.Sides;

public class SideSelector {
    //Refer to EntreeSelector for comments and documentation.

    private Side selectedSide;

    public SideSelector(int rand) {
        switch (rand) {
            case 0:
                selectedSide = new CheeseSticks();
                break;
            case 1:
                selectedSide = new FrenchFries();
                break;
            case 2:
                selectedSide = new Rice();
                break;
            case 3:
                selectedSide = new Salad();
                break;
            default:
                selectedSide = null;
        }
    }

    public Side getSelectedSide() { return this.selectedSide;}

    public double getPrice() {
        return selectedSide.getPrice();
    }

    public String toString() {
        return selectedSide.toString();
    }
}
