package org.example.Lesson1.Task2;

import java.util.ArrayList;
import java.util.List;

/*
Реализуйте класс Товар,
содержащий данные о товаре, и
ТорговыйАвтомат, содержащий в себе методы
initProducts (List <Product>) сохраняющий
в себе список исходных продуктов
и getProduct(String name)

Сделать класс Товар абстрактным,
создать нескольких наследников (к примеру: БутылкаВоды),
сделать интерфейсом ТорговыйАвтомат и реализовать
класс какого-то одного типа ТорговогоАвтомата
(пример: ПродающийБутылкиВодыАвтомат)
 */
public class Main {
    public static void main(String[] args) {

        PieceOfColbasa pieceOfColbasa = new PieceOfColbasa(1,20,"вареная");
        BottleOfCola bottleOfCola1l = new BottleOfCola(1,30);
        BottleOfCola bottleOfCola2l = new BottleOfCola(2,30);
        BottleOfCola bottleOfCola3l = new BottleOfCola(3,30);
        List<Product> prodList = new ArrayList<>(List.of(bottleOfCola1l, pieceOfColbasa)); //добавление нескольких объектов
        List<Product> colaList = new ArrayList<>(List.of(bottleOfCola1l, bottleOfCola2l ,bottleOfCola3l)); //добавление нескольких объектов
//        prodList.add(cola);
//        prodList.add(colbasa);
//        prodList.add(smetana);

//        Authomat authomat = new Authomat();
//
//        authomat.initProducts(prodList);
//        authomat.printProduct("bottleOfCola");
//        authomat.printProduct("pieceOfColbasa");

        VendingMachineOfCola vendingMachineOfCola = new VendingMachineOfCola();
        vendingMachineOfCola.initProducts(colaList);
        System.out.println("-".repeat(10));
        vendingMachineOfCola.printProduct("bottleOfCola");
//        System.out.println(bottleOfCola1l.getName());
//        vendingMachineOfCola.printProduct(3);


    }
}