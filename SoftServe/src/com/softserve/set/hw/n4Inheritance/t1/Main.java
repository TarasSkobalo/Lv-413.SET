package com.softserve.set.hw.n4Inheritance.t1;

public class Main {
    public static void main(String[] args) {

        Bird[] birds = new Bird[4];

        birds[0] = new Eagle("Brown", 1);
        birds[1] = new Swallow("White", 2);
        birds[2] = new Chicken("Black", 7);
        birds[3] = new Penguin("White and Black", 5);

        for (Bird i : birds) {
            System.out.println(i);
            i.fly();
            System.out.println();
        }

    }
}
