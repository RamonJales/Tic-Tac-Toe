package ticTacToe.figures;

import boardGame.Board;
import ticTacToe.TicTacToeFigure;

public class X extends TicTacToeFigure{

	public X(Board board) {
		super(board);
	}
	
	@Override
	public String toString() {
		return "X";
	}
	
}