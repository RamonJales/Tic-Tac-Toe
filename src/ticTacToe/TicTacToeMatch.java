package ticTacToe;

import boardGame.Board;

public class TicTacToeMatch {
	
	private Board board;
	
	public TicTacToeMatch() {
		board = new Board(3, 3);
	}
	
	public TicTacToeFigure[][] getFigures(){
		TicTacToeFigure[][] mat = new TicTacToeFigure[board.getRows()][board.getColumns()];
		
		for (int i = 0; i < board.getRows(); i++) {
			for (int j =0; j < board.getColumns(); j++) {
				mat[i][j] = (TicTacToeFigure) board.figure(i, j);
			}
		}
		return mat;
	}
}