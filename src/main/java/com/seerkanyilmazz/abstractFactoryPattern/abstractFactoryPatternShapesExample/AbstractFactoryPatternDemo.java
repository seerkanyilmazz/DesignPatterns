package com.seerkanyilmazz.abstractFactoryPattern.abstractFactoryPatternShapesExample;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args){
        AbstractShapesFactory shapesFactory = FactoryProducer.getFactory(false);

        IShape triangleShape = shapesFactory.getShape("Triangle");
        triangleShape.draw();

        IShape rectangleShape = shapesFactory.getShape("Rectangle");
        rectangleShape.draw();

        AbstractShapesFactory roundedShapesFactory = FactoryProducer.getFactory(true);

        IShape roundedTriangleShape = roundedShapesFactory.getShape("Triangle");
        roundedTriangleShape.draw();

        IShape roundedRectangleShape = roundedShapesFactory.getShape("rectangle");
        roundedRectangleShape.draw();
    }
}
