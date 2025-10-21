/** * * * * * * * * * * * *
 *  PassingOrFailing.java    *
 *  @author Joey Yearsley *
 *  @version 1.0          *
 * * * * * * * * * * * **/

import  java.util.*;
public class PassingOrFailing {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        //Score variables
        double score1;
        double score2;
        double score3;
        double avgScore;
        //Prompt User
        System.out.println("Enter your 3 exam scores:");
        score1 = stdin.nextDouble();
        score2 = stdin.nextDouble();
        score3 = stdin.nextDouble();
        //Calculate average
        avgScore = ((score1 + score2 + score3) / 3.0);
        System.out.println("Your average score is " + avgScore);
        //Conditional evaluation
        if (avgScore < 0 || avgScore > 100) {
            System.out.println("Input error. Scores must be between 0 and 100.");
        } else if (avgScore >= 90) {
            System.out.println("Excellent Work!");
        } else if (avgScore >= 80) {
            System.out.println("Great work!");
        } else if (avgScore >= 70) {
            System.out.println("Passing");
        } else if (avgScore >= 60) {
            System.out.print("Passing but barely");
        } else {
            System.out.println("Failing");
        }

    }
}