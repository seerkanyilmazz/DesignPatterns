package com.seerkanyilmazz.factoryDesignPattern.factoryDesignPatternDatabaseExample;

public class DatabaseFactoryPattern {
    public static void main(String[] args){

        DatabaseFactory databaseFactory = new DatabaseFactory();

        IDatabase oracleDatabase = databaseFactory.getDatabase("oracle");
        IDatabase mySqlDatabase  = databaseFactory.getDatabase("mysql");
        IDatabase mongoDatabase  = databaseFactory.getDatabase("mongo");

        oracleDatabase.connectDatabase();
        mySqlDatabase.connectDatabase();
        mongoDatabase.connectDatabase();
    }
}
