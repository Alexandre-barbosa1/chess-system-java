package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import bordgame.Board;
import bordgame.Position;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] posibleMoves() {
		boolean mat[][] = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(0, 0);
		// nw
		p.setValues(position.getRow() - 1, position.getColum() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() - 1, p.getColum() - 1);
		}
		if (getBoard().positionExists(p) && isThereOponnentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

		// ne
		p.setValues(position.getRow()-1, position.getColum() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() - 1, p.getColum() + 1);
		}
		if (getBoard().positionExists(p) && isThereOponnentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

		// se
		p.setValues(position.getRow() + 1, position.getColum()+1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() + 1, p.getColum() + 1);
		}
		if (getBoard().positionExists(p) && isThereOponnentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}
		// sw
		p.setValues(position.getRow() + 1, position.getColum()-1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
			p.setValues(p.getRow() + 1, p.getColum() - 1);
		}
		if (getBoard().positionExists(p) && isThereOponnentPiece(p)) {
			mat[p.getRow()][p.getColum()] = true;
		}

		return mat;
	}

	public String toString() {
		return "B";
	}
}
