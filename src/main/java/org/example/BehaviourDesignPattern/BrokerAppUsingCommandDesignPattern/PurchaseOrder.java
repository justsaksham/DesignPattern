package org.example.BehaviourDesignPattern.BrokerAppUsingCommandDesignPattern;

public class PurchaseOrder implements Command{
    private Order order;
    public PurchaseOrder(Order order){
       this.order=order;
    }
    @Override
    public void execute() {
        order.buy();
    }
}
