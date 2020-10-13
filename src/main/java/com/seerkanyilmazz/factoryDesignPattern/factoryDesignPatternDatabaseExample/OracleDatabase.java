package com.seerkanyilmazz.factoryDesignPattern.factoryDesignPatternDatabaseExample;

public class OracleDatabase implements IDatabase {

    public void connectDatabase() {
        System.out.println("Connected to Oracle...");
    }
}
