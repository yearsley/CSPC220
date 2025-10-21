/** * * * * * * * * * * * *
 *  IceCream.java         *
 *  @author Joey Yearsley *
 *  @version 1.0          *
 * * * * * * * * * * * **/

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int number;

        System.out.println("Enter a single digit number between 0 and 9: ");
        number = stdin.nextInt();
        switch (number) {
            case 0:
                System.out.println("You entered a zero.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("You entered an odd number.");
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                System.out.println("You entered an even number.");
                break;
            default:
                System.out.println("ERROR: Bad input:" + number);
                break;
        }

    }
}