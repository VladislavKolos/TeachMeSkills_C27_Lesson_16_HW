package com.teachmeskills.hw16.task0.fabric;

import com.teachmeskills.hw16.task0.model.order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for creating objects of the "Order" type
 * class for creating collections of the "List<Order>" type with adding already created objects to the collection
 * this class contains private constructor which does not allow creating objects of this class
 * returns a collection with orders.
 */
public class OrderFabric {
    private OrderFabric() {
    }

    public static List<Order> createFirstOrder() {
        Order ord1 = new Order("Milk", 2.05, "Milk product", false);
        Order ord2 = new Order("Bread", 1.95, "Bakery products", false);
        Order ord3 = new Order("Chicken", 5.50, "Meat products", false);
        Order ord4 = new Order("Water", 1.80, "Drinking water", true);
        List<Order> firstOrder = new ArrayList<>();
        firstOrder.add(ord1);
        firstOrder.add(ord2);
        firstOrder.add(ord3);
        firstOrder.add(ord4);
        return firstOrder;
    }

    public static List<Order> createSecondOrder() {
        Order ord5 = new Order("iPhone", 3500, "Apple product", true);
        Order ord6 = new Order("Video card", 3800, "Video adapter for computer", true);
        Order ord7 = new Order("Computer mouse", 150, "A coordinate device for controlling the cursor and issuing various commands to the computer", false);
        List<Order> secondOrder = new ArrayList<>();
        secondOrder.add(ord5);
        secondOrder.add(ord6);
        secondOrder.add(ord7);
        return secondOrder;
    }

    public static List<Order> createThirdOrder() {
        Order ord8 = new Order("Painkiller", 50, "Pharmaceuticals", true);
        Order ord9 = new Order("Medical cotton wool", 5.80, "Pharmaceuticals", false);
        List<Order> thirdOrder = new ArrayList<>();
        thirdOrder.add(ord8);
        thirdOrder.add(ord9);
        return thirdOrder;
    }
}
