package com.softserve.set.homework.n6_Collections;

import java.util.*;

public class PersonMap {

    Map<String, String> person = new HashMap();

    public static boolean sameName(Map<String, String> personMap) {
        Set<String> stringSet = new HashSet<String>();
        stringSet.addAll(personMap.values());
        return personMap.size() == stringSet.size() ? false : true;
    }

    public static void remove(Map<String, String> person, String firstName) {
        if (person.containsValue(firstName)) {
            for (Iterator<Map.Entry<String, String>> iterator = person.entrySet().iterator(); iterator.hasNext(); ) {
                if (iterator.next().getValue().equalsIgnoreCase(firstName)) {
                    iterator.remove();
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> person = new HashMap();
        person.put("Oleg", "Twix");
        person.put("Oleg2", "Twix1");
        person.put("Oleg3", "Twix2");
        person.put("Oleg4", "Twix3");
        person.put("Oleg5", "Twix4");
        person.put("Oleg6", "Twix5");
        person.put("Oleg7", "Twix");
//      Task 1
        for (Map.Entry<String, String> entry : person.entrySet()) {
            System.out.println(entry.getKey() + " "
                    + entry.getValue());
        }
//      Task 2
        System.out.println("\n" + "Is there persons with the same name: " + sameName(person));
        System.out.println(" ");
//      Task 3
        remove(person, "Twix1");

        for (Map.Entry<String, String> entry : person.entrySet()) {
            System.out.println(entry.getKey() + " "
                    + entry.getValue());
        }
    }
}
