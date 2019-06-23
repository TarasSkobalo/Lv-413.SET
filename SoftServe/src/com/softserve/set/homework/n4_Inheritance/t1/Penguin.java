package com.softserve.set.homework.n4_Inheritance.t1;

public class Penguin extends NonFlyingBird {
    public Penguin(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
             System.out.println("I'm Penguin and can't fly...");
    }

    @Override
    public String toString() {
        return "Penguin has " + this.getFeathers() + " feathers and lays " + this.getLayEggs() + " eggs";
    }
}
