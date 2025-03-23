package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import bordgame.Board;
import bordgame.Position;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();

	}

	@Override

	public String toString() {

		return "N";
	}

	@Override
	public boolean[][] posibleMoves() {
		boolean mat[][] = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);

		p.setValues(position.getRow() - 1, position.getColum() - 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

		p.setValues(position.getRow() - 1, position.getColum() +2 );
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

		p.setValues(position.getRow() - 2, position.getColum() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

		p.setValues(position.getRow() -2, position.getColum() -1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

		p.setValues(position.getRow() + 1, position.getColum() - 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

		p.setValues(position.getRow() + 1, position.getColum() + 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

			p.setValues(position.getRow() + 2, position.getColum() - 1);
			if (getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColum()] = true;
			}

			p.setValues(position.getRow() + 2, position.getColum() + 1);
			if (getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColum()] = true;
			}
			return mat;
		}
	}

