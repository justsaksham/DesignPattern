package org.example.BehaviourDesignPattern.Calculator;

// Without changing anything in this class we can perform any operation * / + - anything who so ever call this call
// class will provide handlers also we need not edit anything here....
//INVOKER
public class Calculator {
    public void performOperation(Handler handler,String operator,int a,int b){
        handler.performOperation(operator,a,b);
    }
}
