package board;

public class Board {

	private int row;
	private int column;
	private Piece[][] pieces;
	
	public Board(int row, int column) {
		if (row < 1 || column < 1) {
			throw new BoardException("Error: there must be at least 1 row and 1 column.");
		}
		this.row = row;
		this.column = column;
		pieces = new Piece[row][column];
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	public Piece piece(int row, int column) {
		if (!positionExists(row,column)) {
			throw new BoardException("Position not on the board.");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece at that position.");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getColumn());
	}
	
	public boolean positionExists(int row, int column) {
		return row >= 0 && row < row && column >= 0 && column < column;
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(row,column)) {
			throw new BoardException("Position not on the board.");
		}
		return piece(position) != null;
	}
	
}
