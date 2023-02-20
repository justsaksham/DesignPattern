package org.example.BehaviourDesignPattern.Calculator;
//client//

//Run time configuration
public class CalculatorStarter {
    public static void main(String[] args) {
        Addition addition=new Addition();
        Substraction substraction=new Substraction();
        HandlerChainProvider provider=HandlerChainProvider.getChainProvider();
        Handler parent=provider.setHandler(addition,substraction);
        Calculator calculator=new Calculator();
        calculator.performOperation(parent,"+",5,9);
        calculator.performOperation(parent,"*",5,9);
    }
}
