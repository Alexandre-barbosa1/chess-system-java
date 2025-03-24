package Chess.pieces;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.Color;
import bordgame.Board;
import bordgame.Position;

public class Pawn extends ChessPiece {

	private ChessMatch chessMatch;

	public Pawn(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
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
			// #especialMove en passant white
			if (position.getRow() == 3) {
				Position left = new Position(position.getRow(), position.getColum() - 1);
				if (getBoard().positionExists(left) && isThereOponnentPiece(left)
						&& getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
					mat[left.getRow() - 1][left.getColum()] = true;
				}
				Position right = new Position(position.getRow(), position.getColum() + 1);
				if (getBoard().positionExists(right) && isThereOponnentPiece(right)
						&& getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
					mat[right.getRow() - 1][right.getColum()] = true;
				}

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
			// #especialMove en passant black
			if (position.getRow() == 4) {
				Position left = new Position(position.getRow(), position.getColum() - 1);
				if (getBoard().positionExists(left) && isThereOponnentPiece(left)
						&& getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
					mat[left.getRow() + 1][left.getColum()] = true;
				}
				Position right = new Position(position.getRow(), position.getColum() + 1);
				if (getBoard().positionExists(right) && isThereOponnentPiece(right)
						&& getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
					mat[right.getRow() + 1][right.getColum()] = true;
				}

			}
		}

		return mat;
	}

	@Override
	public String toString() {
		return "P";
	}

}
