package org.example.Lesson1.HomeTask1;

import java.util.List;

public interface VendingMachine<T extends Product> {
    void initProducts(List<T> newList);
    void printProduct(String name);

}
