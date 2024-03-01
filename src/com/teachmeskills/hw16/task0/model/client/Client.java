package com.teachmeskills.hw16.task0.model.client;

import com.teachmeskills.hw16.task0.model.order.Order;

import java.util.List;

/**
 * "Client" type class
 * contains four private fields
 * contains one constructor
 * contains getters and setters for each of the fields
 * overridden "toString" method.
 */
public class Client {
    private String registrationDate;
    private String name;
    private int age;
    private List<Order> clientOrder;

    public Client(String registrationDate, String name, int age, List<Order> clientOrder) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
        this.clientOrder = clientOrder;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order> getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(List<Order> clientOrder) {
        this.clientOrder = clientOrder;
    }

    @Override
    public String toString() {
        return "Client{" +
                "registrationDate='" + registrationDate + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", clientOrder=" + clientOrder +
                '}';
    }
}
