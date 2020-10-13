package com.seerkanyilmazz.abstractFactoryPattern.abstractFactoryPatternShapesExample;

public abstract class AbstractShapesFactory {
    abstract IShape getShape(String shapeType);
}
