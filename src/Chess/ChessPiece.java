package Chess;

import bordgame.Board;
import bordgame.Piece;
import bordgame.Position;

public abstract class ChessPiece extends Piece {
	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	public int getMoveCount() {
		return moveCount;
	}

	public Color getColor() {
		return color;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	public void degreaseMoveCount() {
		moveCount--;
	}
	protected boolean isThereOponnentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p!=null && p.getColor() != color;
		
	}
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	
	
	
	

}
