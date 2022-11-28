package tabuleiro;

public class Board {

	private Integer rows;
	private Integer columns;
	
	private Piece[][] pieces;

	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	protected Integer getRows() {
		return rows;
	}

	protected void setRows(Integer rows) {
		this.rows = rows;
	}

	protected Integer getColumns() {
		return columns;
	}

	protected void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	
	
	
}
