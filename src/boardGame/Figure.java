package boardGame;

public abstract class Figure {
	
	protected Position position;
	private Board board;
	
	public Figure(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
	
}