package com.softserve.set.homework.n4_Inheritance.t1;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }


    @Override
    void fly() {
        System.out.println("I'm flying...");
    }
}
