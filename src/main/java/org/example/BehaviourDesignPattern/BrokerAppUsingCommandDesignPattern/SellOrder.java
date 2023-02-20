package org.example.BehaviourDesignPattern.BrokerAppUsingCommandDesignPattern;

public class SellOrder implements Command{
    private Order order;
    public SellOrder(Order order){
        this.order=order;
    }
    @Override
    public void execute() {
        order.sell();
    }
}
