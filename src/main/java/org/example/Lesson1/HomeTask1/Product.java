package org.example.Lesson1.HomeTask1;

public class Product {

    String name;
    int price;

    @Override
    public String toString() {
        return "-".repeat(10) + "Product" + "-".repeat(10) +
                "Name: " + name + '\n' +
                "Price: " + price +'\n';
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
