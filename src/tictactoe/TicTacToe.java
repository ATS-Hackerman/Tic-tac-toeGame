package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        char[][] game_board = {{' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '}};

        printGameBoard(game_board);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement (1-9):");
        int pos = scan.nextInt();

        System.out.println(pos);

        switch(pos){
            case 1:
                game_board[0][0] = 'X';
        }
    }

    public static void printGameBoard(char[][] game_board){
        for(char[] row : game_board){
            for(char i : row){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
