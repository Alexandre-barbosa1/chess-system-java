package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import bordgame.Board;
import bordgame.Position;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();

	}

	@Override

	public String toString() {

		return "K";
	}

	@Override
	public boolean[][] posibleMoves() {
		boolean mat[][] = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);
		// Above

		p.setValues(position.getRow() - 1, position.getColum());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

// below
		p.setValues(position.getRow() + 1, position.getColum());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// left
		p.setValues(position.getRow(), position.getColum() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// right
		p.setValues(position.getRow(), position.getColum() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// nw
		p.setValues(position.getRow() - 1, position.getColum() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// ne
		p.setValues(position.getRow() - 1, position.getColum() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// sw
		p.setValues(position.getRow() + 1, position.getColum() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// se
		p.setValues(position.getRow() + 1, position.getColum() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		return mat;

	}
}