package org.example.BehaviourDesignPattern.BrokerAppUsingCommandDesignPattern;
//invoker
//can add different strategy to execute particular command
public class Broker {
    public void execute(Command command){
        command.execute();
    }
}
