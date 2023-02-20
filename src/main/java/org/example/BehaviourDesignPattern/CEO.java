package org.example.BehaviourDesignPattern;

public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType()==RequestType.CONFERNCE){
            System.out.println("Confluence is there approved by CEO");
        }
        else{
            getSuccessor().handleRequest(request);
        }
    }
}
