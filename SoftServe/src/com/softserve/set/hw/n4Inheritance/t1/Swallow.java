package com.softserve.set.hw.n4Inheritance.t1;

public class Swallow extends FlyingBird {
    public Swallow(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("I'm Swallow and I like flying...");
    }

    @Override
    public String toString() {
        return "Swallow has " + this.getFeathers()+" feathers and lays " + this.getLayEggs()+" eggs";
    }
}
