/** * * * * * * * * * * * *
 *  IceCream.java         *
 *  @author Joey Yearsley *
 *  @version 1.0          *
 * * * * * * * * * * * **/

import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double scoops;
        double sprinkles;
        double mandms;
        double customerScoops;
        boolean Qmandms;
        boolean Qsprinkles;

        // Prompt User
        System.out.println("How many scoops of ice cream are there?");
        scoops = stdin.nextDouble();
        System.out.println("How many T of sprinkles are there?");
        sprinkles = stdin.nextDouble();
        System.out.println("How many T of M&Ms are there?");
        mandms = stdin.nextDouble();
        System.out.println("How many scoops are in the order?");
        customerScoops = stdin.nextDouble();
        System.out.println("Do they want sprinkles? (true/false)");
        Qsprinkles = stdin.nextBoolean();
        System.out.println("Do they want M&Ms? (true/false)");
        Qmandms = stdin.nextBoolean();

        // Validation vars
        String scoopCheck;
        String mandmsSuccess;
        String sprinklesSuccess;

        // Check Scoops
        if (scoops < customerScoops) {
            scoopCheck = "bad";
        } else {
            scoopCheck = "good";
        }

        // Check M&Ms
        if (Qmandms && mandms > 5) {
            mandmsSuccess = "good";
        } else {
            mandmsSuccess = "bad";
        }

        // Check Sprinkles
        if (Qsprinkles && sprinkles > 5) {
            sprinklesSuccess = "good";
        } else {
            sprinklesSuccess = "bad";
        }

        // Set vars to equal strings so they can be printed in output
        if ("good".equals(scoopCheck)) {
            scoopCheck = "Order up: ice cream ";
        } else {
            scoopCheck = "Sadness";
        }

        if ("good".equals(mandmsSuccess)) {
            mandmsSuccess = "and M&Ms ";
        } else {
            mandmsSuccess = "Sorry, can't top it.";
        }

        if ("good".equals(sprinklesSuccess)) {
            sprinklesSuccess = "with sprinkles";
        } else {
            sprinklesSuccess = "Sorry, can't top it.";
        }

        System.out.println(scoopCheck + mandmsSuccess + sprinklesSuccess);
    }
}