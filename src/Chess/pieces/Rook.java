package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import bordgame.Board;


public class Rook extends ChessPiece {

	
	
	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	
	public String toString() {
		return "R";
	}
	@Override
	public boolean[][] posibleMoves() {
		boolean mat [][] = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

}
