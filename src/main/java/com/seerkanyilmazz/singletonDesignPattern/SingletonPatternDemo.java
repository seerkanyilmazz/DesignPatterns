package com.seerkanyilmazz.singletonDesignPattern;

public class SingletonPatternDemo {

    public static void main(String[] args){
        SingleObject singleObject = SingleObject.getInstance();

        singleObject.showMessage();
    }
}
