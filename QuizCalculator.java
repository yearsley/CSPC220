import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int quizNumber;
        int sum = 0;
        int biggestNumber;
        int score;
        double average;
        String description;

        System.out.println("How many quiz scores are there?");
        quizNumber = stdin.nextInt();
        stdin.nextLine(); // clear newline after the number

        System.out.println("Please enter a description and score for each of the " + quizNumber + " quizzes:");

        // Read the first description + score
        description = stdin.nextLine();
        score = stdin.nextInt();
        // Clear newline
        stdin.nextLine();
        biggestNumber = score;
        sum += score;

        // Start from quiz #2
        for (int i = 1; i < quizNumber; i++) {
            description = stdin.nextLine();
            score = stdin.nextInt();
            // Clear newline
            stdin.nextLine();

            sum += score;
            if (score > biggestNumber) {
                biggestNumber = score;
            }
        }

        average = (double) sum / quizNumber;

        System.out.println("The largest value is: " + biggestNumber);
        System.out.println("The average score is: " + average);
    }
}