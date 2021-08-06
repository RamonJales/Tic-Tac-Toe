package application;

import ticTacToe.TicTacToeFigure;
import ticTacToe.TicTacToeMatch;
import ticTacToe.figures.O;
import ticTacToe.figures.X;

public class UI {
	
	public static void printBoard(TicTacToeFigure[][] figures) {
		
		for (int i = 0; i < figures.length; i++) {
			System.out.print((3 - i) + " ");
			for (int j = 0; j < figures.length; j++) {
				printFigure(figures[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c");
	}
	
	private static void printFigure(TicTacToeFigure figure) {
		if (figure == null) {
			System.out.print("-");
		}
		else {
			System.out.print(figure);
		}
		System.out.print(" ");
	}
	
	protected static void puttingDuringGame(char column, int row, char figure, TicTacToeMatch match) {
		if (figure == 'X') {
			match.placeNewFigure(column, row, new X(match.getBoard()));
		}
		else if (figure == 'O'){
			match.placeNewFigure(column, row, new O(match.getBoard()));
		}
		else {
			System.out.println("The only figures that exist are X or O!");
		}
	}
	
}