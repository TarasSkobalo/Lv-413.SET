package com.softserve.set.practicalTasks.n6_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList(0);
        myCollection.add(3);
        myCollection.add(8);
        myCollection.add(117);
        myCollection.add(12);
        myCollection.add(5);
        myCollection.add(13);
        myCollection.add(16);
        myCollection.add(2);
        myCollection.add(22);
        myCollection.add(5);

        System.out.println(myCollection);
        ArrayList<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println();
        System.out.print("positions of elements >5 " + newCollection);

      /*  for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                newCollection.remove;
            }
        }
        System.out.println();
        System.out.println(myCollection);*/

        if (myCollection.size() > 2) {
            myCollection.set(2, 1);
        }
        if (myCollection.size() > 8) {
            myCollection.set(8, -3);
        }
        if (myCollection.size() > 5) {
            myCollection.set(5, -4);
        }
        System.out.println();
        System.out.println(myCollection);

        Collections.sort(myCollection);
        System.out.println(myCollection);

    }
}
