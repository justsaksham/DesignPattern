package org.example.BehaviourDesignPattern;

public abstract class Handler {
    private Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor){
        this.successor=successor;
    }
    public abstract void handleRequest(Request request);
}
