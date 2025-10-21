/** * * * * * * * * * * * * * * * *
 *  MaterialCostCalculator.java    *
 *  @author Joey Yearsley          *
 *  @version 1.0                   *
 * * * * * * * * * * *  * * * * **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner setup
        Scanner stdin = new Scanner(System.in);
        //Introduce user-inputted variables
        double diameterA;
        double diameterB;
        double diameterC;
        double price1;
        double price2;
        //Prompt user. Get inputs for each variable and output variables once defined
        System.out.println("Enter the 3 diameter values of the garden plots:");
        Scanner input = new Scanner(System.in);
        diameterA = stdin.nextDouble(); // pause for user input
        System.out.println(diameterA);
        diameterB = stdin.nextDouble();
        System.out.println(diameterB);
        diameterC = stdin.nextDouble();
        System.out.println(diameterC);
        System.out.println("Enter the 2 unit prices of the border materials to compare:");
        price1 = stdin.nextDouble();
        System.out.println(price1);
        price2 = stdin.nextDouble();
        System.out.println(price2);
        //Define output variables. Use Math.PI and diameter to find circumference and then multiply circumference by price to determine cost.
        double circumferenceA = Math.PI * diameterA;
        double circumferenceB = Math.PI * diameterB;
        double circumferenceC = Math.PI * diameterC;
        double costA1 = circumferenceA * price1;
        double costA2 = circumferenceA * price2;
        double costB1 = circumferenceB * price1;
        double costB2 = circumferenceB * price2;
        double costC1 = circumferenceC * price1;
        double costC2 = circumferenceC * price2;
        //Report output and formatting
        // Header (ONE line, ONE %n at the end)
        System.out.printf("%-6s %15s %20s %20s%n", "Circle", "Circumference", "Cost of Material 1", "Cost of Material 2");

        // Rows (right-align numbers, 2 decimals; widths match header)
        System.out.printf("%-6s %15.2f %20.2f %20.2f%n", "A", circumferenceA, costA1, costA2);
        System.out.printf("%-6s %15.2f %20.2f %20.2f%n", "B", circumferenceB, costB1, costB2);
        System.out.printf("%-6s %15.2f %20.2f %20.2f%n", "C", circumferenceC, costC1, costC2);



    }
}

