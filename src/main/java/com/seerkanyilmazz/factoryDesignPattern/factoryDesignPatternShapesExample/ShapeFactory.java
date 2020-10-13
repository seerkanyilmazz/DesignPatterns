package com.seerkanyilmazz.factoryDesignPattern.factoryDesignPatternShapesExample;

public class ShapeFactory {
    public IShape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        return null;
    }
}
