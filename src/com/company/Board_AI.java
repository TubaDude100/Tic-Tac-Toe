package com.company;

import java.util.Random;

public class Board_AI {
    char token;

    public static final Random rand = new Random();

    private Board_AI(){}

    Board_AI(char token_to_be){
        token = token_to_be;
    }

    void makeMove(TTTB board){
        while (true) {
            int row = rand.nextInt(3);
            int column = rand.nextInt(3);

            if (board.isOpenSpace(row,column)){
                board.assign(token,row,column);
                break;
            }

        }
    }
}
