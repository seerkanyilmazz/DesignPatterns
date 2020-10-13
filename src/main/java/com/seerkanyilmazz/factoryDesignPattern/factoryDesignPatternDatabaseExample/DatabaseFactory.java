package com.seerkanyilmazz.factoryDesignPattern.factoryDesignPatternDatabaseExample;

public class DatabaseFactory {

    public IDatabase getDatabase(String databaseType){

        if (databaseType == null){
            return null;
        }
        if (databaseType.equalsIgnoreCase("ORACLE")){
            return new OracleDatabase();
        }
        if (databaseType.equalsIgnoreCase("MYSQL")){
            return new MySqlDatabase();
        }
        if (databaseType.equalsIgnoreCase("MONGO")){
            return new MongoDatabase();
        }
        return null;
    }
}
