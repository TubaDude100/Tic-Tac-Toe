package com.company;

import java.util.Scanner;

public class UserInterface {

    private static final Scanner userInput = new Scanner(System.in);

    private TTTB board;
    private Board_AI ai;

    private char playerToken;

    //0 is choose token, 1 is back and forth play, 2 is end screen
    private int state = 0;

    private UserInterface(){}

    UserInterface(TTTB board){
        this.board = board;
    }

    public boolean active(){
        if (state != 2){
            return true;
        }
        return false;
    }

    private void playerChooseToken(){
        while (true) {
            System.out.println("Type Charecter You Want to Play As (X/O)\n--->");
            playerToken = userInput.nextLine().charAt(0);
            //System.err.println(playerToken);

            if (playerToken == 'X') {
                ai = new Board_AI('O');
                state = 1;
                return;
            } else if (playerToken == 'O') {
                ai = new Board_AI('X');
                state = 1;
                return;
            }
        }
    }

    public void update(){

        if (state == 0){
            playerChooseToken();
        }
        if (state == 1){


            board.print();

            playerMakeMove(board);
            if (board.isFull()){
                state = 2;
                return;
            }

            ai.makeMove(board);

            if (board.isWinner('X') || board.isWinner('O')){
                state =2;
                return;
            }
            if (board.isFull()){
                state = 2;
                return;
            }
        }

        if (state == 2){
            board.print();
            if (board.isWinner('X')){
                System.out.println("Player X Won");
            } else if (board.isWinner('O')){
                System.out.println("Player O Won");
            }else {
                System.out.println("Cat Game");
            }

        }
    }

    private void playerMakeMove(TTTB board){
        while (true) {
            System.out.println("Type position place on\n--->");
            int val = userInput.nextInt();

            int[] rowCol = convertNumpadToRowColumn(val);

            if (board.isOpenSpace(rowCol[0],rowCol[1])){
                board.assign(playerToken,rowCol[0], rowCol[1]);
                break;
            }
        }
    }

    private int[] convertNumpadToRowColumn(int val){
        if(val == 1){
            return new int[]{2,0};
        }if (val == 2){
            return new int[]{2,1};
        }if (val == 3){
            return new int[]{2,2};
        }if (val == 4){
            return new int[]{1,0};
        }if (val == 5){
            return new int[]{1,1};
        }if (val == 6){
            return new int[]{1,2};
        }if (val == 7){
            return new int[]{0,0};
        }if (val == 8){
            return new int[]{0,1};
        }if (val == 9){
            return new int[]{0,2};
        }
        return null;
    }
}
