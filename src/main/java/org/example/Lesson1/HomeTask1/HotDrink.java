package org.example.Lesson1.HomeTask1;

public class HotDrink extends Drink {
    int temp;

    public int getTemp() {
        return temp;
    }

    public HotDrink(String name, float volume, int price, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    @Override
    public String toString() {
        return ".".repeat(10) + "Drink info" + ".".repeat(10) + "\n" +
                "Name: " + name + "\n" +
                "Volume: " + volume + "\n" +
                "Price: " + price + "\n" +
                "Temp: " + temp + "\n";
    }

}
