package com.seerkanyilmazz.factoryDesignPattern.factoryDesignPatternHumanExample;

public class HumanBehaviourFactoryPattern {
    public static void main(String[] args){
        BehaviourFactory behaviourFactory = new BehaviourFactory();

        IBehaviour cryingBehaviour = behaviourFactory.getBehaviour("crying");
        cryingBehaviour.behaviour();

        IBehaviour smilingBehaviour = behaviourFactory.getBehaviour("smiling");
        smilingBehaviour.behaviour();

        IBehaviour walkingBehaviour = behaviourFactory.getBehaviour("walking");
        walkingBehaviour.behaviour();
    }
}
