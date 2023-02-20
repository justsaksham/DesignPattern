package org.example.BehaviourDesignPattern.IteratorPattern;

import java.util.Iterator;

public class MyBikeRepo implements Iterable<String> {
    private String[] cursor;
    private int index=0;
    public MyBikeRepo(){
        cursor=new String[5];

    }
    public void add(String value){
        if(cursor.length==index){
            String[] str=new String[cursor.length*2];
            int i=0;
        for(String st:cursor){
            str[i++]=st;
        }
        cursor=str;
        }
        cursor[index++]=value;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator() {
           private int i=0;
            @Override
            public boolean hasNext() {
                return i!=index;
            }

            @Override
            public Object next() {
                return cursor[i++];
            }

            @Override
            public void remove() {
           throw new UnsupportedOperationException();
            }
        };

    }

}
