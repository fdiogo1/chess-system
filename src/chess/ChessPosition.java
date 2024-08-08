package chess;

import boardgame.Position;

public class ChessPosition {
	
	private int row;
	private char column;
	
	public ChessPosition(char column, int row) {
		
		if (column < 'a' || column > 'h' || row < 1 || row > 8)
			throw new ChessException("Error in ChessPosition: valid values are from 'a1' to 'h8'");
		
		this.column = column;
		this.row = row;
	}

	public int getRow() {
		return row;
	}

	public char getColumn() {
		return column;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position p) {
		return new ChessPosition((char) ('a' - p.getColumn()), 8 - p.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row; // a1, a2; força o compilador a entender que é uma concatenação de strings
	}

	
	

}
