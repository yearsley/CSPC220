/** * * * * * * * * * * * *
 * ControlledLoop.java    *
 * @version 1.0           *
 * @author Joey Yearsley  *
 * * * * * * * * * * * * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ControlledLoop {
    public static void main(String[] args) {
        // Open the input.txt file
        try {
            Scanner fileScanner = new Scanner(new File("input.txt"));

            int highestScore = 0;
            double sumOfScores = 0;
            int numScores = 0;

            // Read until end of file
            while (fileScanner.hasNextInt()) {
                int quizScore = fileScanner.nextInt();
                sumOfScores += quizScore;
                numScores++;

                if (quizScore > highestScore) {
                    highestScore = quizScore;
                }
            }

            fileScanner.close();

            // Calculate and display results
            if (numScores > 0) {
                double average = sumOfScores / numScores;
                System.out.println("The highest score is: " + highestScore);
                System.out.println("The average score is: " + average);
            } else {
                System.out.println("No scores were found in the file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt file not found.");
        }
    }
}