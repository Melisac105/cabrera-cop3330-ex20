package util;

public class Calculations {

    static public double calcTax(String state, String county, double amount) {
        if(state.equalsIgnoreCase("Wisconsin") && county.equalsIgnoreCase("eau")) {
            return (amount * .05) + (amount * .005);
        }
        else if(state.equalsIgnoreCase("Wisconsin") && county.equalsIgnoreCase("Dunn")) {
            return (amount * .05) + (amount * .004);
        }
        else if(state.equalsIgnoreCase("Illinois")) {
            return amount * .08;
        }
        return -1;
    }

    static public double calcTotal(double amount, double tax) {
        return amount + tax;
    }
}
