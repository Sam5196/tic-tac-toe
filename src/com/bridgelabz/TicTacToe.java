package com.bridgelabz;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game ");
        createBoard();
    }
    public static void createBoard(){
        char[] board = new char[10];
        for (int i=0;i<board.length;i++){
            board[i]=' ';
        }

    }
}
