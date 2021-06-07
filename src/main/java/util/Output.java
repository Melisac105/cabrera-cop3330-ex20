package util;

public class Output {

    static public void printOutput(String state, double tax, double total, double amount) {
        if(state.equalsIgnoreCase("Wisconsin") || state.equalsIgnoreCase("Illinois")) {
            System.out.printf("The tax is $%.2f\n", tax);
            System.out.printf("The total is $%.2f", total);
        }
        else {
            System.out.printf("The total is %.2f", amount);
        }
    }
}
