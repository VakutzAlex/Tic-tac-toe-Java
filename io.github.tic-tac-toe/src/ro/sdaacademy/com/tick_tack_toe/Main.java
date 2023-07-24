package ro.sdaacademy.com.tick_tack_toe;


import utils.ScannerUtils;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Variables
        int rows, columns;
        int win = 0;

        //Choose game type
        int gameType = chooseGameType();

        switch (gameType) {
            case 1: {
                rows = 3;
                columns = 3;
                char playArea[][] = new char[rows][columns];

                //Create and display table
                createPlayArea(rows, columns, playArea);
                displayPlayArea(rows, columns, playArea);

                //Start playing
                if (decideStart() == 1) {
                    System.out.println("Player X starts...");
                    int turns = 0;
                    while (win == 0) {

                        /*      Turn of X       */

                        if (playerX(rows, columns, playArea) == 1) {
                            System.out.println("Player X wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }

                        /*      Turn of X       */


                        /*      Turn of O       */

                        if (playerO(rows, columns, playArea) == 1) {
                            System.out.println("Player O wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }

                        /*      Turn of O       */


                    }
                } else if (decideStart() == 0) {
                    System.out.println("Player O starts...");
                    int turns = 0;


                    while (win == 0) {
                        /*      Turn of O       */

                        if (playerO(rows, columns, playArea) == 1) {
                            System.out.println("Player O wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }


                        /*      Turn of O       */

                        /*      Turn of X       */

                        if (playerX(rows, columns, playArea) == 1) {
                            System.out.println("Player X wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }

                        /*      Turn of X       */
                    }
                }

                break;
            }
            case 2: {
                rows = 5;
                columns = 5;
                char[][] playArea = new char[rows][columns];

                //Create and display table
                createPlayArea(rows, columns, playArea);
                displayPlayArea(rows, columns, playArea);

                //Start playing
                if (decideStart() == 1) {
                    System.out.println("Player X starts...");
                    int turns = 0;
                    while (win == 0) {

                        /*      Turn of X       */

                        if (playerX(rows, columns, playArea) == 1) {
                            System.out.println("Player X wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }

                        /*      Turn of X       */


                        /*      Turn of O       */

                        if (playerO(rows, columns, playArea) == 1) {
                            System.out.println("Player O wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }

                        /*      Turn of O       */


                    }
                } else if (decideStart() == 0) {
                    System.out.println("Player O starts...");
                    int turns = 0;


                    while (win == 0) {
                        /*      Turn of O       */

                        if (playerO(rows, columns, playArea) == 1) {
                            System.out.println("Player O wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }


                        /*      Turn of O       */

                        /*      Turn of X       */

                        if (playerX(rows, columns, playArea) == 1) {
                            System.out.println("Player X wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }

                        /*      Turn of X       */
                    }
                }

                break;
            }
            case 3: {
                rows = 7;
                columns = 7;

                char playArea[][] = new char[rows][columns];

                //Create and display play area
                createPlayArea(rows, columns, playArea);
                displayPlayArea(rows, columns, playArea);

                //Start game
                if (decideStart() == 1) {
                    System.out.println("Player X starts");
                    int turns = 0;

                    while (win == 0) {

                        /*      Turn of X       */

                        if (playerX(rows, columns, playArea) == 1) {
                            System.out.println("Player X wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }

                        /*      Turn of X       */

                        /*      Turn of 0       */

                        if (playerO(rows, columns, playArea) == 1) {
                            System.out.println("Player O wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }

                        /*      Turn of 0       */

                    }

                } else if (decideStart() == 0) {
                    System.out.println("Player O starts");
                    int turns = 0;

                    while (win == 0) {

                        /*      Turn of O       */

                        if (playerO(rows, columns, playArea) == 1) {
                            System.out.println("Player O wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }

                        /*      Turn of O       */

                        /*      Turn of X       */

                        if (playerX(rows, columns, playArea) == 1) {
                            System.out.println("Player X wins");
                            return;
                        }

                        turns++;

                        if (turns == rows * columns - 1) {
                            System.out.println("It's a draw...Re-run to play again");
                            return;
                        }

                        /*      Turn of X       */

                    }
                }

                break;
            }
            case 4: {
                char playArea[][] = new char[9][9];

                createPlayArea(9, 9, playArea);
                displayPlayArea(9, 9, playArea);

                break;
            }
            case 5: {
                System.out.println("Enter number of rows: ");
                rows = ScannerUtils.getIntNumberFromInput();

                System.out.println("Enter number of columns: ");
                columns = ScannerUtils.getIntNumberFromInput();

                char playArea[][] = new char[rows][columns];

                createPlayArea(rows, columns, playArea);
                displayPlayArea(rows, columns, playArea);
                break;
            }
            default: {
                System.out.println("Invalid option...");
                break;
            }
        }
    }

    public static int chooseGameType() {
        int option;

        System.out.println("1. Classic (3 x 3)");
        System.out.println("2. Classic with some extra steps (5 x 5)");
        System.out.println("3. Weird (7 x 7)");
        System.out.println("4. Ultimate (9 x 9)");
        System.out.println("5. Custom (rows x columns)");
        System.out.print("Choose game type: ");

        option = ScannerUtils.getIntNumberFromInput();

        return option;
    }

    public static int checkRowColumnInput(int defR, int defC, int inR, int inC, char matrix[][]) {
        if (inR >= defR) {
            return 0;
        }

        if (inC >= defC) {
            return 0;
        }

        if (matrix[inR][inC] != '*') {
            return 0;
        }

        return 1;
    }

    public static int decideStart() {
        Random rand = new Random();

        int playerX, playerO;

        playerX = rand.nextInt(10);
        playerO = rand.nextInt(10);

        while (playerX == playerO) {
            playerX = rand.nextInt(10);
            playerO = rand.nextInt(10);
        }

        if (playerX > playerO) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void createPlayArea(int rows, int columns, char matrix[][]) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = '*';
            }
        }
    }

    public static void displayPlayArea(int rows, int columns, char matrix[][]) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void changeMatrix(int indexRow, int indexColumn, char symbol, char matrix[][]) {
        matrix[indexRow][indexColumn] = symbol;
    }

    public static int checkWinX(int rows, int columns, char matrix[][]) {
        int count = 0;

        /*      check rows for win     */

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 'X' || matrix[i][j] == 'x') {
                    count++;
                }
            }
            if (count == 3) {
                return 1;
            } else {
                count = 0;
            }
        }

        /*      check rows for win     */

        /*      check columns for win     */

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < columns; i++) {
                if (matrix[i][j] == 'X' || matrix[i][j] == 'x') {
                    count++;
                }
            }
            if (count == 3) {
                return 1;
            } else {
                count = 0;
            }
        }

        /*      check columns for win     */

        if (rows == columns && rows <= 3) {

            /*      check main diagonal for win     */

            for (int i = 0; i < rows; i++) {
                if (matrix[i][i] == 'X' || matrix[i][i] == 'x') {
                    count++;
                }
            }

            if (count == 3) {
                return 1;
            } else {
                count = 0;
            }

            /*      check main diagonal for win     */

            /*      check second diagonal for win     */

            for (int i = 0; i < rows; i++) {
                if (matrix[i][rows - 1 - i] == 'X' || matrix[i][rows - 1 - i] == 'x') {
                    count++;
                }
            }

            if (count == 3) {
                return 1;
            } else {
                count = 0;
            }

            /*      check second diagonal for win     */
        }

        if(rows == columns && rows > 3){
            /*      Check for any other diagonals  \      */

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j] == 'X' || matrix[i][j] == 'x') {
                        count++;
                        if ((i + 1 < rows && j + 1 < columns) && (matrix[i + 1][j + 1] == 'X' || matrix[i + 1][j + 1] == 'x')) {
                            count++;
                            if ((i + 2 < rows && j + 2 < columns) && (matrix[i + 2][j + 2] == 'X' || matrix[i + 2][j + 2] == 'x')) {
                                count++;
                            }
                        }
                    }
                    if (count == 3) {
                        return 1;
                    } else {
                        count = 0;
                    }
                }
            }

            /*      Check for any other diagonals  \      */

            /*      Check for any other diagonals  /      */

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j] == 'X' || matrix[i][j] == 'x') {
                        count++;
                        if ((i - 1 >= 0 && j - 1 >= 0) && (matrix[i - 1][j - 1] == 'X' || matrix[i - 1][j - 1] == 'x')) {
                            count++;
                            if ((i - 2 >= 0 && j - 2 >= 0) && (matrix[i - 2][j - 2] == 'X' || matrix[i - 2][j - 2] == 'x')) {
                                count++;
                            }
                        }
                    }

                    if (count == 3) {
                        return 1;
                    } else {
                        count = 0;
                    }
                }
            }

            /*      Check for any other diagonals  /      */
        }

        return 0;
    }

    public static int checkWinO(int rows, int columns, char matrix[][]) {
        int count = 0;

        /*      check rows for win     */

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 'O' || matrix[i][j] == 'o' || matrix[i][j] == '0') {
                    count++;
                }
            }
            if (count == 3) {
                return 1;
            } else {
                count = 0;
            }
        }

        /*      check rows for win     */

        /*      check columns for win     */

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < columns; i++) {
                if (matrix[i][j] == 'O' || matrix[i][j] == 'o' || matrix[i][j] == '0') {
                    count++;
                }
            }
            if (count == 3) {
                return 1;
            } else {
                count = 0;
            }
        }

        /*      check columns for win     */

        if (rows == columns && rows <= 3) {

            /*      check main diagonal for win     */

            for (int i = 0; i < rows; i++) {
                if (matrix[i][i] == 'O' || matrix[i][i] == 'o' || matrix[i][i] == '0') {
                    count++;
                }
            }

            if (count == 3) {
                return 1;
            } else {
                count = 0;
            }

            /*      check main diagonal for win     */

            /*      check second diagonal for win     */

            for (int i = 0; i < rows; i++) {
                if (matrix[i][rows - 1 - i] == 'O' || matrix[i][rows - 1 - i] == 'o' || matrix[i][rows - 1 - i] == '0') {
                    count++;
                }
            }

            if (count == 3) {
                return 1;
            } else {
                count = 0;
            }

            /*      check second diagonal for win     */

        }

        if(rows == columns && rows > 3){
            /*      Check for any other diagonals  \      */

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j] == 'O' || matrix[i][j] == 'o') {
                        count++;
                        if ((i + 1 < rows && j + 1 < columns) && (matrix[i + 1][j + 1] == 'O' || matrix[i + 1][j + 1] == 'o')) {
                            count++;
                            if ((i + 2 < rows && j + 2 < columns) && (matrix[i + 2][j + 2] == 'O' || matrix[i + 2][j + 2] == 'o')) {
                                count++;
                            }
                        }
                    }
                    if (count == 3) {
                        return 1;
                    } else {
                        count = 0;
                    }
                }
            }

            /*      Check for any other diagonals  \      */

            /*      Check for any other diagonals  /      */

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j] == 'O' || matrix[i][j] == 'o') {
                        count++;
                        if ((i - 1 >= 0 && j - 1 >= 0) && (matrix[i - 1][j - 1] == 'O' || matrix[i - 1][j - 1] == 'o')) {
                            count++;
                            if ((i - 2 >= 0 && j - 2 >= 0) && (matrix[i - 2][j - 2] == 'O' || matrix[i - 2][j - 2] == 'o')) {
                                count++;
                            }
                        }
                    }
                    if (count == 3) {
                        return 1;
                    } else {
                        count = 0;
                    }
                }
            }

            /*      Check for any other diagonals  /      */
        }

        return 0;
    }

    public static int playerX(int row, int col, char matrix[][]) {
        int inputRow, inputColumn;

        System.out.println("Player X place your mark");

        do {
            System.out.print("Row: ");
            inputRow = ScannerUtils.getIntNumberFromInput();
            System.out.print("Column: ");
            inputColumn = ScannerUtils.getIntNumberFromInput();
        } while (checkRowColumnInput(row, col, inputRow, inputColumn, matrix) == 0);

        changeMatrix(inputRow, inputColumn, 'X', matrix);
        displayPlayArea(row, col, matrix);

        if (checkWinX(row, col, matrix) == 1) {
            //System.out.println("Player X wins");
            return 1;
        }
        return 0;
    }

    public static int playerO(int row, int col, char matrix[][]) {
        int inputRow, inputColumn;

        System.out.println("Player O place your mark");

        do {
            System.out.print("Row: ");
            inputRow = ScannerUtils.getIntNumberFromInput();
            System.out.print("Column: ");
            inputColumn = ScannerUtils.getIntNumberFromInput();
        } while (checkRowColumnInput(row, col, inputRow, inputColumn, matrix) == 0);

        changeMatrix(inputRow, inputColumn, 'O', matrix);
        displayPlayArea(row, col, matrix);


        if (checkWinO(row, col, matrix) == 1) {
            //System.out.println("Player O wins");
            return 1;
        }

        return 0;
    }

}
