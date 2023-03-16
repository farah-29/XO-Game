package xo.game;

import java.util.Scanner;

public class XOGame {

    static void print(String[] board) {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("------------");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("------------");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);

    }

    public static void main(String[] args) {
        String[] Board = {"  ","  ","  ","  ","  ","  ","  ","  ","  "};
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            System.out.println("enter the square number ");
            int num = input.nextInt();
            if (i % 2 == 0) {
                Board[num-1] = "X";
            } else {
                Board[num-1] = "O";
            }
            print(Board);

        }
    }

}
