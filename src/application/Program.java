package application;

import boardgame.BoardException;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		try {
		ChessMatch match = new ChessMatch();
		UI.printBoard(match.getPieces());
		}
		catch (BoardException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
