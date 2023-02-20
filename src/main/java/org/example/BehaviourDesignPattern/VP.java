package org.example.BehaviourDesignPattern;

public class VP extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType()==RequestType.PURCHASE && request.getAmount()<1000){
            System.out.println("Purchase is there and approved by VP");
        }
        else{
            getSuccessor().handleRequest(request);
        }
    }
}
