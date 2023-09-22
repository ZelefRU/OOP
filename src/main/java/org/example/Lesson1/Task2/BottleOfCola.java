package org.example.Lesson1.Task2;

public class BottleOfCola extends Product{

    //    final String name = "bottleOfCola";
    int volumeSize;

    public int getVolumeSize() {
        return volumeSize;
    }

    public BottleOfCola(int volumeSize, int cost) {
        this.name = "bottleOfCola";
        this.cost = cost;
        this.volumeSize = volumeSize;
    }

//    public int getCost() {
//        return cost;
//    }

    @Override
    public String toString() {
        return "Product {" + name +
                " Vol = " + volumeSize +
                " cost = " + cost +
                '}';
    }
}
