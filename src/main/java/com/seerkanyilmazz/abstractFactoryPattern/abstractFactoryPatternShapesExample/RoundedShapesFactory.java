package com.seerkanyilmazz.abstractFactoryPattern.abstractFactoryPatternShapesExample;

public class RoundedShapesFactory extends AbstractShapesFactory {
    IShape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("rectangle")){
            return new RoundedRectangle();
        }
        else if (shapeType.equalsIgnoreCase("triangle")){
            return new RoundedTriangle();
        }
        return null;
    }
}
