package application;

import java.util.Scanner;

import ticTacToe.TicTacToeMatch;
import ticTacToe.figures.O;
import ticTacToe.figures.X;

public class MainProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TicTacToeMatch match = new TicTacToeMatch();
		
		UI.printBoard(match.getFigures());
		
		while (true) {
			char column = sc.next().charAt(0);
			int row = sc.nextInt();
			char figure = sc.next().toUpperCase().charAt(0);
			
			UI.puttingDuringGame(column, row, figure, match);
			
			UI.printBoard(match.getFigures());
		}
		
	}
}