//class imports
import Menu.Desserts.Cookie;
import Menu.Desserts.DessertSelector;
import Menu.Desserts.IceCream;
import Menu.Desserts.Pie;
import Menu.Drinks.BottledWater;
import Menu.Drinks.DrinkSelector;
import Menu.Drinks.Juice;
import Menu.Drinks.Soda;
import Menu.Entrees.ChickenSandwich;
import Menu.Entrees.EntreeSelector;
import Menu.Entrees.Hamburger;
import Menu.Entrees.VeggieSandwich;
import Menu.Sides.CheeseSticks;
import Menu.Sides.FrenchFries;
import Menu.Sides.Rice;
import Menu.Sides.Salad;
import Menu.Sides.SideSelector;
import Money.Dime;
import Money.Dollar;
import Money.DollarFive;
import Money.DollarTen;
import Money.Nickel;
import Money.Penny;
import Money.Quarter;

//Library Imports
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Penny pennies = new Penny(100);
    private static Nickel nickels = new Nickel(40);
    private static Dime dimes = new Dime(50);
    private static Quarter quarters = new Quarter(40);
    private static Dollar dollars = new Dollar(42);
    private static DollarFive dollarFives = new DollarFive(4);
    private static DollarTen dollarTens = new DollarTen(2);

    private static void printMoney() {
        System.out.printf("%.2f", pennies.getDollar() + nickels.getDollar() +
                dimes.getDollar() + quarters.getDollar() + dollars.getDollar() +
                dollarFives.getDollar() + dollarTens.getDollar());
        System.out.println();
    }

    private static void entreeAdd(int rand, EntreeSelector entreeSelector) {
        switch (rand) {
            case 0:
                ((Hamburger) entreeSelector.getSelectedSandwich()).add(dollars, quarters, dimes, pennies);
                break;
            case 1:
                ((ChickenSandwich) entreeSelector.getSelectedSandwich()).add(dollars, quarters, dimes, pennies);
                break;
            case 2:
                ((VeggieSandwich) entreeSelector.getSelectedSandwich()).add(dollars, quarters, pennies);
                break;
        }
    }

    private static void sideAdd(int rand, SideSelector sideSelector) {
        switch (rand) {
            case 0:
                ((CheeseSticks) sideSelector.getSelectedSide()).add(dollars, quarters, dimes, pennies);
                break;
            case 1:
                ((FrenchFries) sideSelector.getSelectedSide()).add(quarters, dimes, pennies);
                break;
            case 2:
                ((Rice) sideSelector.getSelectedSide()).add(dollars, nickels, dimes, pennies);
                break;
            case 3:
                ((Salad) sideSelector.getSelectedSide()).add(dollars, quarters, dimes, pennies);
                break;
        }
    }

    private static void drinkAdd(int rand, DrinkSelector drinkSelector) {
        switch (rand) {
            case 0:
                ((BottledWater) drinkSelector.getSelectedDrink()).add(dollars, quarters);
                break;
            case 1:
                ((Juice) drinkSelector.getSelectedDrink()).add(dollars, quarters, dimes, nickels, pennies);
                break;
            case 2:
                ((Soda) drinkSelector.getSelectedDrink()).add(dollars, nickels, dimes, pennies);
                break;
        }
    }

    private static void dessertAdd(int rand, DessertSelector dessertSelector) {
        switch (rand) {
            case 0:
                ((Cookie) dessertSelector.getSelectedDessert()).add(quarters, dimes, pennies);
                break;
            case 1:
                ((IceCream) dessertSelector.getSelectedDessert()).add(dollars, quarters, dimes, pennies);
                break;
            case 2:
                ((Pie) dessertSelector.getSelectedDessert()).add(dollars, quarters, dimes, nickels, pennies);
        }
    }

    private static void newCustomer() {
        Random rand = new Random();
        int entree = rand.nextInt(6);
        int side = rand.nextInt(6);
        int drink = rand.nextInt(6);
        int dessert = rand.nextInt(6);

        boolean isPerfect = false;

        if (rand.nextInt() < 0.5)
            isPerfect = true;

        if (isPerfect) {
            entreeAdd(entree, new EntreeSelector(entree));
            sideAdd(side, new SideSelector(side));
            drinkAdd(drink, new DrinkSelector(drink));
            dessertAdd(dessert, new DessertSelector(dessert));
        }
        else {

        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Random rand = new Random();
        int entreeRand = rand.nextInt(4);
        int sideRand = rand.nextInt(5);
        int drinkRand = rand.nextInt(4);
        int dessertRand = rand.nextInt(4);
        EntreeSelector newEntree = new EntreeSelector(entreeRand);
        entreeAdd(entreeRand, newEntree);
        SideSelector newSide = new SideSelector(sideRand);
        sideAdd(sideRand, newSide);
        DrinkSelector newDrink = new DrinkSelector(drinkRand);
        drinkAdd(drinkRand, newDrink);
        DessertSelector newDessert = new DessertSelector(dessertRand);
        dessertAdd(dessertRand, newDessert);
        
    }
}
