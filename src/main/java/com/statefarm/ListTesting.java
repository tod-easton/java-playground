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
        //myList.get(index);
        //myList.set(index, 'new value');
        //myList.size();  // returns # of elements in the Array
        //myList.indexOf(1);  // returns the value at the passed index; in this case 1 = 'shirt'
        //myList.contains("shoes");  // returns true if value 'shoes" exists in myList, else false
        //myList.isEmpty();  // helpful to verify element is not empty (ex. if(!myList.isEmpty) {...} )
        String result = "";
        for (String clothes : myList) {
            result += clothes + " ";
        }

        Iterator iter = myList.iterator();
        while (iter.hasNext()) {
            if (iter.next() == "shorts") {
                System.out.println("iter found 'shorts'");
            }
        }
        //System.out.println(myList);
        return result;
    }
}
