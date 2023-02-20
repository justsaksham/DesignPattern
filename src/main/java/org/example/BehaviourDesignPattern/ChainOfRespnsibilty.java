package org.example.BehaviourDesignPattern;

public class ChainOfRespnsibilty {
    public static void main(String[] args){
CEO ceo=new CEO();
VP vp=new VP();
Director director=new Director();
vp.setSuccessor(director);

ceo.setSuccessor(vp);
Request rq=new Request();
rq.setAmount(1500);
rq.setRequestType(RequestType.PURCHASE);
ceo.handleRequest(rq);
    }
}
