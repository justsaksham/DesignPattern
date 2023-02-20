package org.example.CreationalDesignPattern.SingletonDesignPattern;

public class DbSingletonDemo {
    public static void main(String[] args){
        DbSingleton dbSingleton=DbSingleton.getDbSingleton();
        System.out.println(dbSingleton);
        DbSingleton testingSingleton=DbSingleton.getDbSingleton();
        System.out.println(testingSingleton);
    }
}
