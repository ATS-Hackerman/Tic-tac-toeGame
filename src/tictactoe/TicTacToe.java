package tictactoe;

import java.util.*;

public class TicTacToe {

    //Lists current marks made on the board
    static ArrayList<Integer> player_marks = new ArrayList<Integer>();
    static ArrayList<Integer> cpu_marks = new ArrayList<Integer>();

    public static void main(String[] args) {
        //Draws the game board
        char[][] game_board = {{' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '}};

        printGameBoard(game_board);

        //Game listens
        Scanner scan = new Scanner(System.in);

        //Loops input from player and decides cpu moves
        while(true) {
            System.out.println("Enter your placement (1-9):");
            int player_mark = scan.nextInt();
            while(player_marks.contains(player_mark) || cpu_marks.contains(player_mark)) {
                System.out.println("Area taken, Enter an available area");
                player_mark = scan.nextInt();
            }

            //Player marks a spot
            placeMark(game_board, player_mark, "player");
            //Computer marks a random spot
            Random random = new Random();
            int cpu_mark = random.nextInt(9) + 1;
            while(player_marks.contains(cpu_mark) || cpu_marks.contains(cpu_mark)) {
                cpu_mark = random.nextInt(9) + 1;
            }
            placeMark(game_board, cpu_mark, "cpu");

            printGameBoard(game_board);

            String result = checkWinner();
            System.out.println(result);
        }
    }

    //Method for printing the game board to the console
    public static void printGameBoard(char[][] game_board) {
        for(char[] row : game_board) {
            for(char i : row) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //Method for placing marks on the board
    public static void placeMark(char[][] game_board, int mark, String user) {
        char symbol = ' ';

        //Assigns symbols for each player
        if(user.equals("player")) {
            symbol = 'X';
            player_marks.add(mark);
        }
        else if(user.equals("cpu")) {
            symbol = 'O';
            cpu_marks.add(mark);
        }

        //Cases for each position on the board
        switch(mark) {
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

    /*
    Method lists win conditions and checks if either player
    meets any of them for every mark made
     */
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

        //Loops through conditions
        for(List l : win_conditions) {
            if(player_marks.containsAll(l)) {
                return "You won! Congratulations!";
            } else if(cpu_marks.containsAll(l)) {
                return "You lost. Try harder";
            } else if(player_marks.size() + cpu_marks.size() == 9){
                return "The cat wins! She's a sly one.";
            }
        }

        return "";
    }
}