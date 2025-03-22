package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import bordgame.Board;
import bordgame.Position;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] posibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p1 = new Position(0, 0);
		if (getColor() == Color.WHITE) {
			p1.setValues(position.getRow() - 1, position.getColum());
			if (getBoard().positionExists(p1) && !getBoard().thereIsAPiece(p1)) {
				mat[p1.getRow()][p1.getColum()] = true;
			}
			p1.setValues(position.getRow() - 2, position.getColum());
			Position position2 = new Position(position.getRow() - 1, position.getColum());
			if (getBoard().positionExists(p1) && !getBoard().thereIsAPiece(p1) && getBoard().positionExists(position2)
					&& !getBoard().thereIsAPiece(position2) && getMoveCount() == 0) {
				mat[p1.getRow()][p1.getColum()] = true;

			}
			p1.setValues(position.getRow() - 1, position.getColum() - 1);
			if (getBoard().positionExists(p1) && isThereOponnentPiece(p1)) {
				mat[p1.getRow()][p1.getColum()] = true;
			}
			p1.setValues(position.getRow() - 1, position.getColum() + 1);
			if (getBoard().positionExists(p1) && isThereOponnentPiece(p1)) {
				mat[p1.getRow()][p1.getColum()] = true;
			}
		} else {
			p1.setValues(position.getRow() + 1, position.getColum());
			if (getBoard().positionExists(p1) && !getBoard().thereIsAPiece(p1)) {
				mat[p1.getRow()][p1.getColum()] = true;
			}
			p1.setValues(position.getRow() + 2, position.getColum());
			Position position2 = new Position(position.getRow() + 1, position.getColum());
			if (getBoard().positionExists(p1) && !getBoard().thereIsAPiece(p1) && getBoard().positionExists(position2)
					&& !getBoard().thereIsAPiece(position2) && getMoveCount() == 0) {
				mat[p1.getRow()][p1.getColum()] = true;

			}
			p1.setValues(position.getRow() + 1, position.getColum() - 1);
			if (getBoard().positionExists(p1) && isThereOponnentPiece(p1)) {
				mat[p1.getRow()][p1.getColum()] = true;
			}
			p1.setValues(position.getRow() + 1, position.getColum() + 1);
			if (getBoard().positionExists(p1) && isThereOponnentPiece(p1)) {
				mat[p1.getRow()][p1.getColum()] = true;

			}
		}

		return mat;
	}

	@Override
	public String toString() {
		return "P";
	}

}
