/** * * * * * * * * * * * *
 * WhileLoop.java         *
 * @version 1.0           *
 * @author Joey Yearsley  *
 * * * * * * * * * * * * */

import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int quizScore;
        int highestScore = 0;
        double average;

        double sumOfScores = 0;
        int numScores = 0;

        System.out.println("Please enter the quiz scores followed by a -1:");
        quizScore = stdin.nextInt();

        // Start loop and stop when -1 is entered
        while (quizScore != -1) {
            sumOfScores = sumOfScores + quizScore;
            numScores++;

            if (quizScore > highestScore) {
                highestScore = quizScore;
            }

            quizScore = stdin.nextInt();
            }
        //Output the highest score and the average of all scores
        if (numScores > 0) {
         average = sumOfScores / numScores;
            System.out.println("The highest score is: " + highestScore);
            System.out.println("The average score is: " + average);
        }
    }
}