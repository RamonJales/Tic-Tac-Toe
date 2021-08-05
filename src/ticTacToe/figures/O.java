package ticTacToe.figures;

import boardGame.Board;
import ticTacToe.TicTacToeFigure;

public class O extends TicTacToeFigure{

	public O(Board board) {
		super(board);
	}
	
	@Override
	public String toString() {
		return "O";
	}
	
}