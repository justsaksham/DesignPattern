package org.example.BehaviourDesignPattern.BrokerAppUsingCommandDesignPattern;

public class Order {
    int Quantity;
    String name;
    public int buy(){
        System.out.println("Buy executed");
        return 0;
    }
    public void sell(){
        System.out.println("sell executed");
    }
}
