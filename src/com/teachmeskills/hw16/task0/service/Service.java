package com.teachmeskills.hw16.task0.service;

import com.teachmeskills.hw16.task0.fabric.ClientFabric;
import com.teachmeskills.hw16.task0.model.client.Client;

import java.util.Iterator;
import java.util.Map;

/**
 * Class contains private constructor which does not allow creating objects of this class
 * contains static methods to show information about clients by using "ForEach", "Iterator", show information about clients keys and show information about clients values.
 */
public class Service {
    private Service() {
    }

    public static void showInfAboutClientsWithForEach() {
        Map<String, Client> clients = ClientFabric.createClientWithOrder();
        for (Map.Entry<String, Client> element : clients.entrySet()) {
            System.out.println("\nKey = " + element.getKey() + " -> Value: " + element.getValue().toString());
        }
    }

    public static void showInfAboutClientsWithIterator() {
        Map<String, Client> clients = ClientFabric.createClientWithOrder();
        Iterator<Map.Entry<String, Client>> iterator = clients.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("\nKey = " + entry.getKey() + " -> Value: " + entry.getValue().toString());
        }
    }

    public static void showInfAboutClientsKeys() {
        Map<String, Client> clients = ClientFabric.createClientWithOrder();
        System.out.println("\nKeys = " + clients.keySet());
    }

    public static void showInfAboutClientsValues() {
        Map<String, Client> clients = ClientFabric.createClientWithOrder();
        System.out.println("\nValues: " + clients.values());
    }
}
