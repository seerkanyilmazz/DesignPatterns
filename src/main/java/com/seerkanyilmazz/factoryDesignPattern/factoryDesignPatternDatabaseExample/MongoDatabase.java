package com.seerkanyilmazz.factoryDesignPattern.factoryDesignPatternDatabaseExample;

public class MongoDatabase implements IDatabase {
    public void connectDatabase() {
        System.out.println("Connected to MongoDB...");
    }
}
