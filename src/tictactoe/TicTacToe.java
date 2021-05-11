package tictactoe;

import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> player_positions = new ArrayList<Integer>();
    static ArrayList<Integer> cpu_positions = new ArrayList<Integer>();

    public static void main(String[] args) {
        char[][] game_board = {{' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '}};

        printGameBoard(game_board);

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your placement (1-9):");
            int player_pos = scan.nextInt();

            //Player marks a spot
            placePiece(game_board, player_pos, "player");
            //Computer marks a random spot
            Random random = new Random();
            int cpu_pos = random.nextInt(9) + 1;
            placePiece(game_board, cpu_pos, "cpu");

            printGameBoard(game_board);
        }
    }

    public static void printGameBoard(char[][] game_board) {
        for(char[] row : game_board) {
            for(char i : row) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] game_board, int pos, String user) {
        char symbol = ' ';

        if(user.equals("player")) {
            symbol = 'X';
        }
        else if(user.equals("cpu")) {
            symbol = 'O';
        }

        switch(pos) {
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

    public static String checkWinner() {
        List top_row = Arrays.asList(1, 2, 3);
        List middle_row = Arrays.asList(4, 5, 6);
        List bottom_row = Arrays.asList(7, 8, 9);

        List left_column = Arrays.asList(1, 4, 7);
        List middle_column = Arrays.asList(2, 5, 8);
        List right_column = Arrays.asList(3, 6, 9);

        List diagonal1 = Arrays.asList(1, 5, 9);
        List diagonal2 = Arrays.asList(7, 5, 3);

        List<List> win_conditions = new ArrayList<List>();
        win_conditions.add(top_row);
        win_conditions.add(middle_row);
        win_conditions.add(bottom_row);
        win_conditions.add(left_column);
        win_conditions.add(middle_column);
        win_conditions.add(right_column);
        win_conditions.add(diagonal1);
        win_conditions.add(diagonal2);

        for(List l : win_conditions) {

        }

        return "";
    }
}