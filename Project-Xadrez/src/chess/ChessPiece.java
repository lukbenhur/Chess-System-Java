package chess;

import chess.enums.Color;
import tabuleiro.Board;
import tabuleiro.Piece;

public class ChessPiece extends Piece{

	private Color color;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	protected Color getColor() {
		return color;
	}
	
	
}
