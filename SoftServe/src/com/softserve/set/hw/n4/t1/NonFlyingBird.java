package com.softserve.set.hw.n4.t1;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("I can't flying");
    }
}
