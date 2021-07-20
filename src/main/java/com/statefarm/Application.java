package com.statefarm;

public class Application {

    public static void main(String[] args) {
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

        if (args.length != 2) {
            System.out.println("You MUST pass 2 arguments");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a + b);
    }
}
