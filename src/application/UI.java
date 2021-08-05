package application;

import ticTacToe.TicTacToeFigure;

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
	
}