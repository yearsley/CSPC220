/**
 * TempConverter.java
 * @author Joey Yearsley
 * @version 1.0
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double fahrenheitTemp; //User inputted number
        double conversion; //conversion result
        System.out.println("Please enter a temperature in Fahrenheit:");
        fahrenheitTemp = stdin.nextDouble(); // pause for user input
        conversion = (fahrenheitTemp-32) * (5.0 / 9.0); // conversion variable change and formula implementation
        System.out.println("The equivalent temperature in Celsius is:" + conversion);

    }// end main() method
}// end Main class