package com.softserve.set.homework.n6_Collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class parameterizedMethods {

    public static Set<Integer> union(Set set1, Set set2) {
        Set<Integer> setUnion = new HashSet<>();
        setUnion.addAll(set2);
        setUnion.addAll(set1);
        return setUnion;
    }

    public static Set<Integer> intersect(Set set1, Set set2) {
        Set<Integer> setIntersect = new HashSet<>();
        setIntersect.addAll(set1);
        setIntersect.retainAll(set2);
        return setIntersect;
    }

    public static void main(String[] args) {
        Random rd = new Random();

        Set set1 = new HashSet<Integer>();
        Set set2 = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            set1.add(rd.nextInt(30));
            set2.add(rd.nextInt(15));
        }
        System.out.println(set1);
        System.out.println(set2);

        Set<Integer> setUnion = union(set1, set2);
        System.out.println(setUnion);

        Set<Integer> setIntersect = intersect(set1, set2);
        System.out.println(setIntersect);


    }
}
