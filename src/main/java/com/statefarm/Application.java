package com.statefarm;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        //System.out.println(String.format("hello %s", args));
        if (args.length != 2){
            System.out.println("You must enter two arguments");
            System.exit(1);
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a + b);
//        byte a = 7;
//        byte b = a;
//
//        a = 12;
//        System.out.println("b = " + b);
//
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("item1");
//        ArrayList<String> list2 = list1;
//        list1.add("item2");
//        System.out.println("list two = " + list2);
//        System.out.println("hello world");
//
//        int x = 45;
//
//        while (x <= 50){
//            System.out.println(x);
//            x++;
//        }
//
//        for (int i = 2; i < 7; i+=2) System.out.println(i);

        //if (args.length == 0) return;

//        int x = 10;
//        int y = 10;

//        if (x == y) {
//            System.out.println("the numbers are equal");
//        }

//        String foo = "foo";
//        String bar = "bar";
//
//        if (foo.equals(bar)) System.out.println("the strings are not equal");;
//
//        if (x < 0) {
//            System.out.println("x is negative");
//        } else if (x > 0) {
//            System.out.println("x is positive");
//        } else {
//            System.out.printf("x is zero");
//        }
    }


}
