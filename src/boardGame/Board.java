package boardGame;

public class Board {
	
	private int rows;
	private int columns;
	private Figure[][] figures;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		figures = new Figure[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Figure figure(int row, int column) {
		return figures[row][column];
	}
	
	public Figure figure(Position position) {
		return figures[position.getRow()][position.getColumn()];
	}
	
}