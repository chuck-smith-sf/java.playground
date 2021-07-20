package com.statefarm;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        //System.out.println(String.format("hello %s", args));
        if (args.length == 0){
            System.out.println("Please specify a name and email");
            System.exit(1);
        } else if (args.length == 1){
            System.out.println("Please specify and email for " + args[0]);
            System.exit(1);
        }
        String name = (args[0]);
        String email  = (args[1]);
        System.out.println(name + " " + "<" + email + ">");
    }
}
