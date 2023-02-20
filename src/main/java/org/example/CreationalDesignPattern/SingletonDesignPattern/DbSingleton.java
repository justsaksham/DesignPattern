package org.example.CreationalDesignPattern.SingletonDesignPattern;

public class DbSingleton {
    private static volatile DbSingleton dbSingleton=null;
    private DbSingleton(){
        if(dbSingleton!=null)
            throw new IllegalStateException("Please use getDbSingleton to create an object");
    }

    public static DbSingleton getDbSingleton() {
        if(dbSingleton==null) {
            synchronized (DbSingleton.class) {
                if(dbSingleton==null) {
                    dbSingleton = new DbSingleton();
                }
            }
        }
        return dbSingleton;
    }
}
