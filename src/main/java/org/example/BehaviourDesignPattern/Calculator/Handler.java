package org.example.BehaviourDesignPattern.Calculator;

public abstract class Handler {
    private Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public abstract void performOperation(String operator,int param1,int param2);
}
