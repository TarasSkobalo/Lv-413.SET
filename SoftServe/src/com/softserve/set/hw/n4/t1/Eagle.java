package com.softserve.set.hw.n4.t1;

public class Eagle extends FlyingBird {

    public Eagle(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("I'm Eagle and I like flying...");
    }

    @Override
    public String toString() {
        return "Eagle has " + this.getFeathers() + " feathers and lays " + this.getLayEggs() + " eggs";
    }
}
