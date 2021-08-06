package application;

import java.util.Scanner;

import ticTacToe.TicTacToeMatch;
import ticTacToe.TicTacToePosition;

public class MainProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TicTacToeMatch match = new TicTacToeMatch();
		
		
		while (true) {
			
			UI.printBoard(match.getFigures());
			
			System.out.print("Position: ");
			String pos = sc.next();
			TicTacToePosition position = UI.readChessPosition(pos);
			
			System.out.print("Figure: ");
			char figure = sc.next().toUpperCase().charAt(0);
			
			UI.puttingDuringGame(position.getColumn(), position.getRow(), figure, match);
		}
		
	}
}