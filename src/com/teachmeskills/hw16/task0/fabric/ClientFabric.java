package com.teachmeskills.hw16.task0.fabric;

import com.teachmeskills.hw16.task0.model.client.Client;
import com.teachmeskills.hw16.task0.util.Const;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for creating objects of the "Client" type
 * class for creating collections of the Map<String, Client>" type with adding keys: passport number and values: objects of the "Client" class
 * this class contains private constructor which does not allow creating objects of this class
 * returns clients collection.
 */
public class ClientFabric {
    private ClientFabric() {
    }

    public static Map<String, Client> createClientWithOrder() {
        Client cl1 = new Client("12.07.2018", "Daniil", 25, OrderFabric.createFirstOrder());
        Client cl2 = new Client("13.08.2019", "Eugene", 25, OrderFabric.createSecondOrder());
        Client cl3 = new Client("01.01.2021", "Vladislav", 24, OrderFabric.createThirdOrder());
        Map<String, Client> clients = new HashMap<>();
        clients.put(Const.PASS_NUMBER_FOR_FIRST_CLIENT, cl1);
        clients.put(Const.PASS_NUMBER_FOR_SECOND_CLIENT, cl2);
        clients.put(Const.PASS_NUMBER_FOR_THIRD_CLIENT, cl3);
        return clients;
    }
}
