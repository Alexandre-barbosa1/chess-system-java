package bordgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	public Piece(Board board) {
		this.board = board;
	}
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean [][] posibleMoves();
	
	public boolean posibleMove(Position position) {
		return posibleMoves() [position.getRow()][position.getColum()];
	}
	public boolean isThereAnyPossibleMove() {
		boolean mat[][] = posibleMoves();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
			return false;
	}
	
	
}
