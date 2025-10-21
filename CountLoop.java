/** * * * * * * * * * * * *
 * CountLoop.java         *
 * @version 1.0           *
 * @author Joey Yearsley  *
 * * * * * * * * * * * * */

import java.util.Scanner;

public class CountLoop {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int highestScore = 0;
        double sumOfScores = 0;

        // Loop exactly 5 times
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter quiz score " + i + ": ");
            int quizScore = stdin.nextInt();
            sumOfScores += quizScore;

            if (quizScore > highestScore) {
                highestScore = quizScore;
            }
        }
        // Output the highest score and the average of all scores
        double average = sumOfScores / 5;
        System.out.println("The highest score is: " + highestScore);
        System.out.println("The average score is: " + average);
    }
}