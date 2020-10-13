package com.seerkanyilmazz.abstractFactoryPattern.abstractFactoryPatternShapesExample;


public class ShapesFactory extends AbstractShapesFactory {
    IShape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        else if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
