package tictactoe;

import java.util.Random;
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
        int playerPos = scan.nextInt();

        //Player marks a spot
        placePiece(game_board, playerPos, "player");
        //Computer marks a random spot
        Random random = new Random();
        int cpuPos = random.nextInt(9) + 1;
        placePiece(game_board, cpuPos, "cpu");

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
        char symbol = ' ';

        if(user.equals("player")){
            symbol = 'X';
        }
        else if(user.equals("cpu")){
            symbol = 'O';
        }

        switch(pos){
            case 1:
                game_board[0][0] = symbol;
                break;
            case 2:
                game_board[0][2] = symbol;
                break;
            case 3:
                game_board[0][4] = symbol;
                break;
            case 4:
                game_board[2][0] = symbol;
                break;
            case 5:
                game_board[2][2] = symbol;
                break;
            case 6:
                game_board[2][4] = symbol;
                break;
            case 7:
                game_board[4][0] = symbol;
                break;
            case 8:
                game_board[4][2] = symbol;
                break;
            case 9:
                game_board[4][4] = symbol;
                break;
        }
    }
}