package chess;

import boardgame.Piece;
import boardgame.Position;

public class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Position position, Color color) {
		super(position);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
		
}
