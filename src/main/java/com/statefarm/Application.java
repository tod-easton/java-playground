package com.statefarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Application {

    public static void main(String[] args) {
        System.out.println(MapTesting.testingMaps());
        System.out.println(SetTesting.testingSets());
        System.out.println(ListTesting.testingLists());
//        System.out.println("Hello World");

//        int numStart = 45;
//        int numEnd = 50;
//        while (numStart <= numEnd) {
//            System.out.println(numStart);
//            numStart++;
//        }

//        for (int i = 2; i < 7; i++) {
//            if (i %2 == 0) {
//                System.out.println(i);
//            }
//        }

//        System.out.println(String.format("Hello %s", args[0]));

        // testing Integer.parseInt
//        if (args.length != 2) {
//            System.out.println("You MUST pass 2 arguments");
//            System.exit(1);
//        }
//
//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//
//        System.out.println(a + b);
    }

    // Implement the sortArray method below below
//    public ArrayList<String> sortArray(String[] inputArray) {
//        ArrayList<String> newAL = new ArrayList<>(Arrays.asList(inputArray));
//        newAL.sort(null);
//        return newAL;
//    }

    //For the given method signature, write an implementation that generates a HashMap, adds the following two items, and returns this new HashMap.
//    public HashMap<Integer, String> genHashMap() {
//        HashMap<Integer, String> numbers = new HashMap<>();
//        numbers.put(747, "Airplane");
//        numbers.put(10, "Laphroaig");
//        return numbers;
//    }

// Accumulator challenge
//    Input [""] should return ""
//    Input [] should return ""
//    Input ["Alice", "Bob"] should return "Alice and Bob"
//    Input ["Alice", "Bob", "Carol"] should return "Alice, Bob and Carol"
//    String toSentence(String[] array) {
//        String result = "";
//        if(array.length == 0) {  // array[0].isEqual() to compare if element is String
//            return result;
//        }
//        result += array[0];
//        for(int i = 1; i < array.length; i++) {
//            if (i == array.length -1){
//                result += " and " + array[i];
//            } else {
//                result += ", " + array[i];
//            }
//        }
//        return result;
//    }

// Lambda challenge
//    String[] fileNames = new String[3]; // or {"My Report.csv", "The Best Deck.pdf", "Thanks for all the fishes.doc"};
//    fileNames[0] = "My Report.csv";
//    fileNames[0] = "The Best Deck.pdf";
//    fileNames[0] = "Thanks for all the fishes.doc";
//    fileNames.forEach(words -> {
//        String result = words.replaceAll(" ", "-");
//        System.out.println(result);
//    });


//Try / Catch
//try {
//        result = riskyProcess.run(input);
//    } catch (NullPointerException ex) {
//        System.out.println("encountered null pointer");
//    } catch (IndexOutOfBoundsException e) {
//        System.out.println("index out of bounds");
//    } finally {
//        System.out.println("Done"); // always print this, no matter what
//    }

// System.out.println(result);

//Throwing Exceptions
// define IceCreamException class here
//public static class IceCreamException extends Exception {
//    public IceCreamException(String message) {
//        super(message);
//    }
//}
//
//    public static void run() throws IceCreamException{
//        // throw your IceCreamException here
//        throw new IceCreamException("Sorry, no vanilla left");
//    }

}
