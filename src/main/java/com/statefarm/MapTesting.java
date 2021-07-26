package com.statefarm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTesting {

    public static String testingMaps() {
//        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> hashMap = new HashMap<Integer, String>();  // sorted ?
//        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(); // sorted by order entered
//        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(); // sorted by key

        return testMap(treeMap);
    }

    private static String testMap (Map<Integer, String> myMap) {
        myMap.put(1, "fox");
        myMap.put(12, "dog");
        myMap .put(8, "hippo");
        myMap.put(3, "aardvark");
        myMap.put(9, "pig");
        myMap.put(0, "bird");
        myMap.put(6, "elephant");
        myMap.put(7, "tiger");

        String result = "";
        for (Integer key : myMap.keySet()) {  // iterates over keys (ex. 1, 12, 8, ...)
            String value = myMap.get(key);
//            System.out.println(key + ": " + value);
            result += key + ":" + value + " ";
        }
        return result;
    }
}
