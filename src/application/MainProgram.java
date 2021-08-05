package application;

import ticTacToe.TicTacToeMatch;

public class MainProgram {

	public static void main(String[] args) {
		
		TicTacToeMatch match = new TicTacToeMatch();
		UI.printBoard(match.getFigures());
		
		
	}
}