package com.seerkanyilmazz.factoryDesignPattern.factoryDesignPatternDatabaseExample;

public class MySqlDatabase implements IDatabase {
    public void connectDatabase() {
        System.out.println("Connected to MySql...");
    }
}
