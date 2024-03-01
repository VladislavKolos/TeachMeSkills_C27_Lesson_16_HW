package com.teachmeskills.hw16.task0.runner;

import com.teachmeskills.hw16.task0.service.Service;

/**
 * Class with method main to run the program
 * methods are called in this class.
 */
public class Runner {
    public static void main(String[] args) {
        Service.showInfAboutClientsWithForEach();
        Service.showInfAboutClientsWithIterator();
        Service.showInfAboutClientsKeys();
        Service.showInfAboutClientsValues();
    }
}
