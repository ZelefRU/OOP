package org.example.Lesson1.HomeTask1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotDrink coffee = new HotDrink("Coffee", 0.25f, 250, 80);
        HotDrink cacao = new HotDrink("Cacao", 0.25f, 250, 50);
        HotDrink tea = new HotDrink("Hot Tea", 0.35f, 450, 70);

        List<HotDrink> drinksList = new ArrayList<>(List.of(coffee,cacao,tea));

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();
        machine.initProducts(drinksList);

//        System.out.println("||".repeat(30));

//        machine.printProduct("Coffee");
        machine.getProduct("Coffee", 0.25f, 80);
        machine.getProduct("Coffee", 0.25f, 30);

    }
}
