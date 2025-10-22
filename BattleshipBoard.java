/** * * * * * * * * * * * * *
 * BattleshipBoard.java     *
 * @author Joseph Yearsley  *
 * @version 1.0             *
 * * * * * * * * * * * * * */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Creates an empty 10x10 grid (they are 0 values rn)
        char[][] board = new char[10][10];
        // Nested loop to change all values in the grid to ' '
        // Outer loop allows us to iterate rows
        for (int i = 0; i < 10; i++) {
            // Inner loop iterates each character in the row and designates it as empty
            for (int j = 0; j < 10; j++) {
                board[i][j] = (' ');
            }
        }
        //Nested loop to change all empty values to . otherwise print current value
        //Outer loop allows us to iterate by row
        for (int i = 0; i < 10; i++) {
            //Inner loop iterates over each character in the row and if its empty it will assign it a value of ".", if not it's value stays what it is.
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == ' ') {
                    System.out.print("." + " ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }

        Scanner stdin = new Scanner(System.in);

        // Ship placement loop & logic
        for (int placed = 0; placed < 5; ) {
            System.out.println("Which ship would you like to place? A/B/S/D/P");
            char ship = Character.toUpperCase(stdin.next().charAt(0));
            int length = 0;

            if (ship == 'A') {
                length = 5;
            } else if (ship == 'B') {
                length = 4;
            } else if (ship == 'S') {
                length = 3;
            } else if (ship == 'D') {
                length = 3;
            } else if (ship == 'P') {
                length = 2;
            } else {
                System.out.println("Invalid ship");
                continue;
            }

            System.out.print("Enter starting row (0–9): ");
            int row = stdin.nextInt();

            System.out.print("Enter starting column (0–9): ");
            int col = stdin.nextInt();

            System.out.print("Vertical or Horizontal (V/H)? ");
            char orient = Character.toUpperCase(stdin.next().charAt(0));

            // Minimal bounds guard (assume no overlaps per instructions)
            boolean ok = true;
            if (orient == 'H') {
                ok = (row >= 0 && row < 10) && (col >= 0 && col + length <= 10);
            } else if (orient == 'V') {
                ok = (col >= 0 && col < 10) && (row >= 0 && row + length <= 10);
            } else {
                ok = false;
            }

            if (!ok) {
                System.out.println("Out of bounds/invalid. Try again.");
                continue;
            }

            // Place ship on board
            if (orient == 'H') {
                for (int j = 0; j < length; j++) {
                    board[row][col + j] = ship; // Horizontal placement
                }
            } else { // orient == 'V'
                for (int j = 0; j < length; j++) {
                    board[row + j][col] = ship; // Vertical placement
                }
            }

            // Re-print the board after each placement
            System.out.println("Updated Board:");
            for (int r = 0; r < 10; r++) {
                for (int c = 0; c < 10; c++) {
                    if (board[r][c] == ' ') System.out.print(". ");
                    else System.out.print(board[r][c] + " ");
                }
                System.out.println();
            }

            placed++;
        }

        // Final board print
        System.out.println("Final Board:");
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                if (board[r][c] == ' ') System.out.print(". ");
                else System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}
