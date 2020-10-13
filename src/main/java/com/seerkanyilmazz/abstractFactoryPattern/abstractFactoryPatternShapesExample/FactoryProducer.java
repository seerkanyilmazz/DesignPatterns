package com.seerkanyilmazz.abstractFactoryPattern.abstractFactoryPatternShapesExample;

public class FactoryProducer {

    public static AbstractShapesFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapesFactory();
        }
        else {
            return new ShapesFactory();
        }
    }
}
