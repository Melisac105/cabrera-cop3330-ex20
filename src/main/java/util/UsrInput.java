package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public double getAmount() {
        System.out.print("What is the order amount? ");
        return input.nextDouble();
    }

    static public String getState() {
        System.out.print("What state do you live in? ");
        return input.next();
    }

    static public String getCounty(String state) {
        if (state.equalsIgnoreCase("Wisconsin")) {
            System.out.print("What county do you live in? ");
            return input.next();
        }
        return "";
    }
}
