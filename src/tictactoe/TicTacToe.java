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
