package org.example.BehaviourDesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleOfIteratorUsingList {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("Saksham");
        list.add("Gupta");
        list.add("liar");
        Iterator<String> stringIterator=list.iterator();
        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        MyBikeRepo repo=new MyBikeRepo();
        repo.add("Saksham");
        repo.add("Gupta");
        repo.add("liar");
        Iterator<String> stringIterator1= repo.iterator();
        while (stringIterator1.hasNext()){
            System.out.println(stringIterator1.next());
        }
    }

}
