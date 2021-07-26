package com.statefarm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTesting {

    public static String testingSets() {
    Set<String> hashSet = new HashSet<String>(); // does not retain order
    Set<String> linkedHashSet = new LinkedHashSet<String>(); // sorted by order items added
    Set<String> treeSet = new TreeSet<String>(); // sorted by natural order

    return testSet(treeSet);
    }

    private static String testSet (Set<String> set) {
        set.add("Dodge");
        set.add("Chevrolet");
        set.add("Ford");
        set.add("Nissan");
        set.add("Volkswagen");
        set.add("Ferrari");

        String result = "";
        for (String car : set) {
            result += car + " ";
        }
        //System.out.println(set);
        return result;

        // To check common elements between sets
//        Set<String> set2 = new TreeSet<>();
//        set2.add("Dodge");
//        set2.add("Chevrolet");
//        set.add("Mazda");
//        set.add("Kia");
//        Set<String> intersection = new HashSet<>(set); // make a copy of initial set
//        intersection.retainAll(set2);
//        System.out.println(intersection); // prints Dodge, Chevrolet

        // Conversely, check uncommon elements between sets
//        Set<String> difference = new HashSet<>(set); // make a copy of initial set
//        intersection.removeAll(set2);
//        System.out.println(intersection); // prints Nissan, Volkswagen, Ferrari, Mazda, Kia
    }
}
