package org.example.BehaviourDesignPattern.BrokerAppUsingCommandDesignPattern;

public class BrokingApp {
    public static void main(String[] args){
        Order requestBuy=new Order();
        Order requestSell=new Order();
        Command purchaseOrder=new PurchaseOrder(requestBuy);
        Command sellOrder=new SellOrder(requestSell);
        Broker broker=new Broker();
        broker.execute(purchaseOrder);
        broker.execute(sellOrder);
    }
}
