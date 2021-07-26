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

    private static String testMap (Map<Integer, String> map) {
        map.put(1, "fox");
        map.put(12, "dog");
        map .put(8, "hippo");
        map.put(3, "aardvark");
        map.put(9, "pig");
        map.put(0, "bird");
        map.put(6, "elephant");
        map.put(7, "tiger");

        String result = "";
        for (Integer key : map.keySet()) {  // iterates over keys (ex. 1, 12, 8, ...)
            String value = map.get(key);
//            System.out.println(key + ": " + value);
            result += key + ":" + value + " ";
        }
        return result;
    }
}
