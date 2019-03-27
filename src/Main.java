import Menu.ChickenSandwich;
import Menu.Sandwich;
import Menu.VeggieSandwich;
import Money.*;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(in);

        Penny pennies = new Penny(100);
        Nickel nickels = new Nickel(40);
        Dime dimes = new Dime(50);
        Quarter quarters = new Quarter(40);
        Dollar dollars = new Dollar(42);
        DollarFive dollarFives = new DollarFive(4);
        DollarTen dollarTens = new DollarTen(2);

        Sandwich ham = new VeggieSandwich();
        System.out.println(ham.getPrice());


    }
}
