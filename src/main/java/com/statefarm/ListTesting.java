package com.statefarm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTesting {

    public static String testingLists() {
        List<String> arrayList = new ArrayList<String>();  // if only need to add/remove items from 'end' of the list
        List<String> linkedList = new LinkedList<String>();  // if need to add/remove items 'anywhere' in list

        return testList(linkedList);
    }

    public static String testList(List<String> list) {
        list.add("hat");
        list.add("shirt");
        list.add("shorts");
        list.add("shoes");
        list.add("sunglasses");

        String result = "";
        for (String clothes : list) {
            result += clothes + " ";
        }
        //System.out.println(list);
        return result;
    }
}
