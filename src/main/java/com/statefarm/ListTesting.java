package com.statefarm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTesting {

    public static String testingLists() {
        List<String> arrayList = new ArrayList<String>();  // use when add/remove items from 'end' of the myList
        List<String> linkedList = new LinkedList<String>();  // use when need to add/remove items 'anywhere' in myList

        return testList(linkedList);
    }

    public static String testList(List<String> myList) {
        myList.add("hat");
        myList.add("shirt");
        myList.add("shorts");
        myList.add("shorts"); // duplicate elements are allowed in a LinkedList
        myList.add("shoes");
        myList.add("sunglasses");

        String result = "";
        for (String clothes : myList) {
            result += clothes + " ";
        }

        Iterator iter = myList.iterator();
        while (iter.hasNext()) {
            if (iter.next() == "shorts") {
                System.out.println("Iter found 'shorts'");
            }
        }
        //System.out.println(myList);
        return result;
    }
}
