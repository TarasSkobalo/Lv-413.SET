package com.softserve.set.homework.n4_Inheritance.t1;

public class Chicken extends NonFlyingBird {

    public Chicken(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {

        System.out.println("I'm Chicken and can't fly...");
    }

    @Override
    public String toString() {
        return "Chicken has " + this.getFeathers() + " feathers and lays " + this.getLayEggs() + " eggs}";
    }
}
