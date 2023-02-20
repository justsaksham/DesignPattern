package org.example.BehaviourDesignPattern.Calculator;

public class Substraction extends Handler{
    @Override
    public void performOperation(String operator, int param1, int param2) {
        if(operator.equals("-")){
            System.out.println(param1-param2);
        }
        else {
            if(getSuccessor()!=null)
                getSuccessor().performOperation(operator,param1,param2);
            else{
                System.out.println("Such Handler is not present msg from "+Substraction.class.getSimpleName());
            }
        }
    }
}