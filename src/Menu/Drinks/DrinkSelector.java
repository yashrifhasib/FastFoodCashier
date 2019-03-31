package Menu.Drinks;

public class DrinkSelector {
    //Refer to EntreeSelector for comments and documentation

    private Drink selectedDrink;

    public DrinkSelector(int rand) {
        switch (rand) {
            case 0:
                selectedDrink = new BottledWater();
                break;
            case 1:
                selectedDrink = new Juice();
                break;
            case 2:
                selectedDrink = new Soda();
                break;
            default:
                selectedDrink = null;
        }
    }

    public Drink getSelectedDrink() { return this.selectedDrink; }

    public double getPrice() {
        return selectedDrink.getPrice();
    }

    public String toString() {
        return selectedDrink.toString();
    }
}
