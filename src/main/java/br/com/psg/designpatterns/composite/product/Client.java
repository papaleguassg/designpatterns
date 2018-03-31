package br.com.psg.designpatterns.composite.product;

import br.com.psg.designpatterns.composite.product.order.ProducionOrder;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Product bike = new Product("Bike");

        Product wheel = new Product("wheel");
        Product frame = new Product("Frame");
        Product handlebar = new Product("Handlebar");

        Product tire = new Product("Tire");
        Product rim = new Product("rim");


        bike.add(wheel, 2).add(frame, 1).add(handlebar, 1);

        wheel.add(tire, 1).add(rim, 1);

        bike.print();


        List<ProducionOrder> orders = new ArrayList<>();
        bike.calculateProductionOrder(orders, 10);

        System.out.println();
        System.out.println();
        System.out.println();
        orders.forEach(System.out::println);
    }
}
