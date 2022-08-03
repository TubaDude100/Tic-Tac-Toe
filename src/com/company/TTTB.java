package com.company;

public class TTTB {
    char[] tic = new char[9];

    public TTTB(){
        clearBoard();
    }

    void clearBoard(){

        for (int i = 0; i<3; i++){
            for (int y = 0; y<3;y++){
                assign(' ',i,y);
            }
        }
    }

    boolean isOpenSpace(int row, int column){
        if(tic[row_col_to_index(row,column)]==' '){
            return true;
        }
        return false;
    }

    void assign(char assignVal,int row, int column){
        //Checks that assignVal is proper
        if(!(assignVal == 'X' || assignVal ==  'O' || assignVal == ' ')){
            throw new IllegalArgumentException(assignVal + " is not a valid argument");
        }

        //Checks that row is valid
        if(!(row == 0 || row == 1 || row == 2)){
            throw new IllegalArgumentException(row + " is not a valid row number");
        }

        //checks that column is valid
        if(!(column == 0 || column == 1 || column == 2)){
            throw new IllegalArgumentException(column + " is not a valid column number");
        }

        //Does actual assignment
        tic[row_col_to_index(row,column)] = assignVal;
    }

    boolean isFull(){
        for (int i = 0; i<9;i++){
            if (tic[i] == ' '){
                return false;
            }
        }
        return true;
    }

    int row_col_to_index(int row, int col){
        return (3*row) + col;
    }

    void print(){
        System.out.println("  " + tic[0] + " | " + tic[1] + " | " + tic[2] + "  \n ----------- \n  "
                + tic[3] + " | " + tic[4] + " | " + tic[5] + "  \n ----------- \n  "
                + tic[6] + " | " + tic[7] + " | " + tic[8] + " \n ");
    }

    boolean isWinner(char token){
        if (tic[0] == token && tic[1] == token && tic[2] == token) {
            return true;
        }
        if (tic[3] == token && tic[4] == token && tic[5] == token) {
            return true;
        }if (tic[6] == token && tic[7] == token && tic[8] == token) {
            return true;
        }if (tic[0] == token && tic[3] == token && tic[6] == token) {
            return true;
        }if (tic[1] == token && tic[4] == token && tic[7] == token) {
            return true;
        }if (tic[2] == token && tic[5] == token && tic[8] == token) {
            return true;
        }if (tic[0] == token && tic[4] == token && tic[8] == token) {
            return true;
        }if (tic[2] == token && tic[4] == token && tic[6] == token) {
            return true;
        }

        return false;
    }


}
