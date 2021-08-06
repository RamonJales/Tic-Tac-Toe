package ticTacToe;

import boardGame.Position;

public class TicTacToePosition {

	private int row;
	private char column;
	
	public TicTacToePosition(int row, char column) {
		if (row < 1 || row > 3 || column < 'a' || column > 'c') {
			throw new TicTacToeException("Error instantiating ChessPosition. Valid values are from a1 to c3");
		}
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public char getColumn() {
		return column;
	}
	
	protected Position toPosition() {
		return new Position(3 - row, column - 'a');
	}
	
	protected static TicTacToePosition fromPosition(Position position) {
		return new TicTacToePosition(position.getRow() - 3, (char) ('a' - position.getColumn()));
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}