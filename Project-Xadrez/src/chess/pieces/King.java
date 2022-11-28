package chess.pieces;

import chess.ChessPiece;
import chess.enums.Color;
import tabuleiro.Board;

public class King extends ChessPiece {
//REI
	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

	
}
