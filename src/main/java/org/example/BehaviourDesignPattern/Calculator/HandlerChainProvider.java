package org.example.BehaviourDesignPattern.Calculator;

public class HandlerChainProvider {
    static private HandlerChainProvider chainProvider;
    private Handler start;
    private Handler last;

    private HandlerChainProvider(){

    }
    public static HandlerChainProvider getChainProvider() {
       if(chainProvider==null) {
           chainProvider=new HandlerChainProvider();
       }
        return chainProvider;
    }
    /**
     * This will return always a new Handler Chain
     * */
    public Handler setHandler(Handler... handlers){
       for(int i=0;i<handlers.length-1;i++){
           handlers[i].setSuccessor(handlers[i+1]);
       }
       start=handlers[0];
       last=handlers[handlers.length-1];
       return start;
    }
    public Handler addHandler(Handler child){
      last.setSuccessor(child);
      last=child;
      return start;
    }
}
