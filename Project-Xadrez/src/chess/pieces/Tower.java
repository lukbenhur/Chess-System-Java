package chess.pieces;

import chess.ChessPiece;
import chess.enums.Color;
import tabuleiro.Board;

public class Tower extends ChessPiece{
//TORRE
	public Tower(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "T";
	}
	
	
}
