# TeachMeSkills_C27_Lesson_16_HW
Homework for lesson #16

**Task #0** 

The program displays information about clients' passport numbers, about clients in general and about their orders.
The program contains:
- Class **"Client"** with four private fields;
- Class **"Client"** with constructor;
- Class **"Client"** which contains getters and setters for each of the fields;
- Class **"Client"** which contains overridden method **"toString"**;
- Class **"Order"** with four private fields;
- Class **"Order"** with constructor;
- Class **"Order"** which contains getters and setters for each of the fields;
- Class **"Order"** which contains overridden method **"toString"**;
- Class **"OrderFabric"** with private constructor which does not allow creating objects of this class;
- Class **"OrderFabric"** which contains static methods **"createFirstOrder", "createSecondOrder" and "createThirdOrder"** which create collections of the "List<Order>" type with adding already created objects to the collection;
- Class **"ClientFabric"** with private constructor which does not allow creating objects of this class;
- Class **"ClientFabric"** which contains static method **"createClientWithOrder"** to create collections of the Map<String, Client>" type with adding keys: passport number and values: objects of the "Client" class;
- Class **"Service"** with private constructor which does not allow creating objects of this class;
- Class **"Service"** which contains static void methods to show information about clients by using **"ForEach", "Iterator"**, show information about clients **keys** and show information about clients **values**;
- Interface **"Const"** for storing constants (client passport numbers, the same **keys**);
- Class **"Runner"** which runs the program and calls the methods **"showInfAboutClientsWithForEach", "showInfAboutClientsWithIterator", "showInfAboutClientsKeys" and "showInfAboutClientsValues"**.
