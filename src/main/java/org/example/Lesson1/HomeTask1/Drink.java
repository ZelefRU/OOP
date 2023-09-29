package org.example.Lesson1.HomeTask1;

public class Drink extends Product{

    float volume;

    public Drink(String name, int price, float volume) {
        super(name, price);
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

//    public Drink(String name, float volume, int price) {
//        this.name = name;
//        this.volume = volume;
//        this.price = price;
//    }

    @Override
    public String toString() {
        return ".".repeat(10) + "Drink info" + ".".repeat(10) + "\n" +
                "Name: " + name + "\n" +
                "Volume: " + volume + "\n" +
                "Price: " + price + "\n";
    }
}
