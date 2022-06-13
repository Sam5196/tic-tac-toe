package com.bridgelabz;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game ");
        createBoard();
        playerChoice();
        showboard();
    }
    public static void createBoard(){
        char[] board = new char[10];
        for (int i=0;i<board.length;i++){
            board[i]=' ';
        }

    }
    public static void playerChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose X or O : ");
        char player = scanner.next().charAt(0);
        char computerPlayer;

        if (player == 'X'){
            computerPlayer = 'O';
        }else{
            computerPlayer = 'O';
        }
        System.out.println("player choice is: "+player+" computer choice is: "+ computerPlayer);
    }
    public static void showboard() {
        System.out.println(" " + board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
    }
}
