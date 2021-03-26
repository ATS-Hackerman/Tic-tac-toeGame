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
        printGameBoard(game_board);

    }

    public static void printGameBoard(char[][] game_board){
        for(char[] row : game_board){
            for(char i : row){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] game_board, int pos, String user){
        char symbol = 'X';

        if(user.equals("player")){
            symbol = 'X';
        }
        else{
            symbol = 'O';
        }

        switch(pos){
            case 1:
                game_board[0][0] = 'X';
                break;
            case 2:
                game_board[0][2] = 'X';
                break;
            case 3:
                game_board[0][4] = 'X';
                break;
            case 4:
                game_board[2][0] = 'X';
                break;
            case 5:
                game_board[2][2] = 'X';
                break;
            case 6:
                game_board[2][4] = 'X';
                break;
            case 7:
                game_board[4][0] = 'X';
                break;
            case 8:
                game_board[4][2] = 'X';
                break;
            case 9:
                game_board[4][4] = 'X';
                break;
        }
    }
}
