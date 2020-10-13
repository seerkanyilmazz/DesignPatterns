package com.seerkanyilmazz.factoryDesignPattern.factoryDesignPatternShapesExample;

public class ShapesFactoryPattern {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        IShape shapeRectangle = shapeFactory.getShape("Rectangle");
        shapeRectangle.draw();

        IShape shapeSquare = shapeFactory.getShape("Square");
        shapeSquare.draw();

        IShape shapeTriangle = shapeFactory.getShape("Triangle");
        shapeTriangle.draw();
    }
}
