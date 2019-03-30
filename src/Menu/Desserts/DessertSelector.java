package Menu.Desserts;

public class DessertSelector {

    //Refer to EntreeSelector for comments and documentation

    private Dessert selectedDessert;

    public DessertSelector(int rand) {
        switch (rand) {
            case 0:
                selectedDessert= new Cookie();
                break;
            case 1:
                selectedDessert = new IceCream();
                break;
            case 2:
                selectedDessert = new Pie();
                break;
            default:
                selectedDessert = null;
        }
    }

    public double getPrice() {
        return selectedDessert.getPrice();
    }

    public String toString() {
        return selectedDessert.toString();
    }
}
