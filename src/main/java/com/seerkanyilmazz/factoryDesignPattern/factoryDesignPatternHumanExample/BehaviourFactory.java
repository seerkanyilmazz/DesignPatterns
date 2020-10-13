package com.seerkanyilmazz.factoryDesignPattern.factoryDesignPatternHumanExample;

public class BehaviourFactory {

    public IBehaviour getBehaviour(String behaviourType) {
        if (behaviourType == null){
            return null;
        }
        if (behaviourType.equalsIgnoreCase("Crying")){
            return new Crying();
        }
        if (behaviourType.equalsIgnoreCase("Smiling")){
            return new Smiling();
        }
        if (behaviourType.equalsIgnoreCase("Walking")){
            return new Walking();
        }
        return null;
    }
}
