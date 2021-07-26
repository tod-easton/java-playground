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

    private static String testSet (Set<String> mySet) {
        mySet.add("Dodge");
        mySet.add("Chevrolet");
        mySet.add("Ford");
        mySet.add("Nissan");
        mySet.add("Volkswagen");
        mySet.add("Ferrari");

        String result = "";
        for (String car : mySet) {
            result += car + " ";
        }
        //System.out.println(mySet);
        return result;

        // To check common elements between sets
//        Set<String> set2 = new TreeSet<>();
//        set2.add("Dodge");
//        set2.add("Chevrolet");
//        mySet.add("Mazda");
//        mySet.add("Kia");
//        Set<String> intersection = new HashSet<>(mySet); // make a copy of initial mySet
//        intersection.retainAll(set2);
//        System.out.println(intersection); // prints Dodge, Chevrolet

        // Conversely, check uncommon elements between sets
//        Set<String> difference = new HashSet<>(mySet); // make a copy of initial mySet
//        intersection.removeAll(set2);
//        System.out.println(intersection); // prints Nissan, Volkswagen, Ferrari, Mazda, Kia
    }
}
