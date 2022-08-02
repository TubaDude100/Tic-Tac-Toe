package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static String posOne = " ";
    public static String posTwo = " ";
    public static String posThree = " ";
    public static String posFour = " ";
    public static String posFive = " ";
    public static String posSix = " ";
    public static String posSeven = " ";
    public static String posEight = " ";
    public static String posNine = " ";

    public static boolean oneUsed = false;
    public static boolean twoUsed = false;
    public static boolean threeUsed = false;
    public static boolean fourUsed = false;
    public static boolean fiveUsed = false;
    public static boolean sixUsed = false;
    public static boolean sevenUsed = false;
    public static boolean eightUsed = false;
    public static boolean nineUsed = false;
    public static boolean checkNum = false;
    public static boolean checkPos = false;

    public static Random rand = new Random();

    public static float placement = 0;
    public static float cpuPlacement = rand.nextInt(9);

    public static Scanner input = new Scanner(System.in);

    public static float position() {
        System.out.println("Please select a position");
        return input.nextFloat();
    }

    public static void printBoard() {
        System.out.println("  " + posOne + " | " + posTwo + " | " + posThree + "  \n ----------- \n  "
                + posFour + " | " + posFive + " | " + posSix + "  \n ----------- \n  "
                + posSeven + " | " + posEight + " | " + posNine + " \n ");
    }

    public static void playerTurn() {
        checkPos = false;
        while (checkPos == false) {
            placement = position();
            if (placement == 1 && oneUsed == false) {
                posOne = "X";
                oneUsed = true;
                checkPos = true;
            }
            if (placement == 2 && twoUsed == false) {
                posTwo = "X";
                twoUsed = true;
                checkPos = true;
            }
            if (placement == 3 && threeUsed == false) {
                posThree = "X";
                threeUsed = true;
                checkPos = true;
            }
            if (placement == 4 && fourUsed == false) {
                posFour = "X";
                fourUsed = true;
                checkPos = true;
            }
            if (placement == 5 && fiveUsed == false) {
                posFive = "X";
                fiveUsed = true;
                checkPos = true;
            }
            if (placement == 6 && sixUsed == false) {
                posSix = "X";
                sixUsed = true;
                checkPos = true;
            }
            if (placement == 7 && sevenUsed == false) {
                posSeven = "X";
                sevenUsed = true;
                checkPos = true;
            }
            if (placement == 8 && eightUsed == false) {
                posEight = "X";
                eightUsed = true;
                checkPos = true;
            }
            if (placement == 9 && nineUsed == false) {
                posNine = "X";
                nineUsed = true;
                checkPos = true;
            }
            if (placement == 0) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
            if (placement % 1 != 0) {
                System.out.println("Not a valid position. Please try again.");
            }
            if (placement <= 0 || placement >= 9) {
                System.out.println("Not a valid position. Please try again.");
            }
        }
    }

    public static void cpuTurn() {
        cpuPlacement = rand.nextInt(9);
        checkNum = false;
        while (checkNum == false) {
            if (cpuPlacement == 0 && oneUsed == false) {
                posOne = "O";
                oneUsed = true;
                checkNum = true;
            }
            if (cpuPlacement == 1 && twoUsed == false) {
                posTwo = "O";
                twoUsed = true;
                checkNum = true;
            }
            if (cpuPlacement == 2 && threeUsed == false) {
                posThree = "O";
                threeUsed = true;
                checkNum = true;
            }
            if (cpuPlacement == 3 && fourUsed == false) {
                posFour = "O";
                fourUsed = true;
                checkNum = true;
            }
            if (cpuPlacement == 4 && fiveUsed == false) {
                posFive = "O";
                fiveUsed = true;
                checkNum = true;
            }
            if (cpuPlacement == 5 && sixUsed == false) {
                posSix = "O";
                sixUsed = true;
                checkNum = true;
            }
            if (cpuPlacement == 6 && sevenUsed == false) {
                posSeven = "O";
                sevenUsed = true;
                checkNum = true;
            }
            if (cpuPlacement == 7 && eightUsed == false) {
                posEight = "O";
                eightUsed = true;
                checkNum = true;
            }
            if (cpuPlacement == 8 && nineUsed == false) {
                posNine = "O";
                nineUsed = true;
                checkNum = true;
            } else {
                cpuPlacement = rand.nextInt(9);
            }
        }
    }

    public static void checkPlayerWin() {
        if (posOne == "X" && posTwo == "X" && posThree == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posOne == "X" && posFour == "X" && posSeven == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posOne == "X" && posFive == "X" && posNine == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posTwo == "X" && posFive == "X" && posEight == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posThree == "X" && posSix == "X" && posNine == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posThree == "X" && posFive == "X" && posSeven == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posFour == "X" && posFive == "X" && posSix == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posSeven == "X" && posEight == "X" && posNine == "X") {
            System.out.println("Player Wins!");
            System.exit(0);
        }
    }

    public static void checkCPUWin() {
        if (posOne == "O" && posTwo == "O" && posThree == "O") {
            System.out.println("Computer Wins!");
            System.exit(0);
        }
        if (posOne == "O" && posFour == "O" && posSeven == "O") {
            System.out.println("Computer Wins!");
            System.exit(0);
        }
        if (posOne == "O" && posFive == "O" && posNine == "O") {
            System.out.println("Computer Wins!");
            System.exit(0);
        }
        if (posTwo == "O" && posFive == "O" && posEight == "O") {
            System.out.println("Computer Wins!");
            System.exit(0);
        }
        if (posThree == "O" && posSix == "O" && posNine == "O") {
            System.out.println("Computer Wins!");
            System.exit(0);
        }
        if (posThree == "O" && posFive == "O" && posSeven == "O") {
            System.out.println("Computer Wins!");
            System.exit(0);
        }
        if (posFour == "O" && posFive == "O" && posSix == "O") {
            System.out.println("Computer Wins!");
            System.exit(0);
        }
        if (posSeven == "O" && posEight == "O" && posNine == "O") {
            System.out.println("Computer Wins!");
            System.exit(0);
        }
    }

    public static void finalCheck() {
        if (posOne == "X" && posTwo == "X" && posThree == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posOne == "X" && posFour == "X" && posSeven == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posOne == "X" && posFive == "X" && posNine == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posTwo == "X" && posFive == "X" && posEight == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posThree == "X" && posSix == "X" && posNine == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posThree == "X" && posFive == "X" && posSeven == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posFour == "X" && posFive == "X" && posSix == "X") {
            System.out.println("Player One Wins!");
            System.exit(0);
        }
        if (posSeven == "X" && posEight == "X" && posNine == "X") {
            System.out.println("Player Wins!");
            System.exit(0);
        } else {
            System.out.println("Draw Game. Nobody wins!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        // write your code here

        System.out.println("  1 | 2 | 3  \n ----------- \n  4 | 5 | 6  \n " +
                "----------- \n  7 | 8 | 9 \n \n Type '0' at any point to exit. \n");

        //Move One
        playerTurn();

        printBoard();

        //Move Two
        cpuTurn();

        printBoard();

        //Move Three
        playerTurn();

        printBoard();

        //Move Four
        cpuTurn();

        printBoard();

        //Move Five; start to check for win
        playerTurn();

        printBoard();

        checkPlayerWin();

        //Move Six
        cpuTurn();

        printBoard();

        checkCPUWin();

        //Move Seven
        playerTurn();

        printBoard();

        checkPlayerWin();

        //Move Eight
        cpuTurn();

        printBoard();

        checkCPUWin();

        //Move Nine; check for win for the last time
        playerTurn();

        printBoard();

        finalCheck();
    }
}