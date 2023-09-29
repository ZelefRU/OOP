package org.example.Lesson1.Task2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineOfCola<BottleOfCola> implements Authomat<BottleOfCola> {
    public List<Product> list = new ArrayList<>();
    public List<BottleOfCola> bottleList = new ArrayList<BottleOfCola>();

//    @Override
//    public void initProducts (List <Product> newList) {
//        Product list = (BottleOfCola) bottleList;
//        this.list = newList;
//        System.out.println(newList);
//    }

    @Override
    public void initProducts(List<BottleOfCola> bottleList) {
        for (int i = 0; i < bottleList.size(); i++) {
//            if (bottleList.get(i).get() == vol){
//                System.out.println(list.get(i));
//            }
        }
    }

//    public void printProduct(int vol) {
//        Product listed = (BottleOfCola) bottleList;
//        for (int i = 0; i < list.size(); i++) {
//            if (bottleList.get(i).getVolumeSize() == vol){
//                System.out.println(list.get(i));
//            }
//        }
//    }



    public void printProduct(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                System.out.println(list.get(i));
            }
        }
    }
}
