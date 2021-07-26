package com.statefarm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTesting {

    public static String testingSets (){
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
    }
}
