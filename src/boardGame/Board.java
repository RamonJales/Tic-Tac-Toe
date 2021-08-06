package boardGame;

public class Board {
	
	private int rows;
	private int columns;
	private Figure[][] figures;
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
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
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		
		return figures[row][column];
	}
	
	public Figure figure(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		
		return figures[position.getRow()][position.getColumn()];
	}
	
	public void placeFigure(Figure figure, Position position) {
		if (thereIsAFigure(position)) {
			throw new BoardException("you cannot place a figure in position: "+ position);
		}
		
		figures[position.getRow()][position.getColumn()] = figure;
		figure.position = position;
	}
	
	public boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAFigure(Position position) {
		
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return figure(position) != null;
	}
}