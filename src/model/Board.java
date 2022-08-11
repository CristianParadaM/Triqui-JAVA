package model;

/** Clase que maneja el objeto Board.java
 *
 * @author Cristian David Parada Martinez
 * @date 12/05/2021
 *
 */
public class Board {
	
	private String[][] board;

	/** Constructor de Board
	 * @param board
	 */
	public Board(String[][] board) {
		super();
		this.board = board;
	}
	
	public void play(int i, int j, String character) {
		this.board[i][j] = character;
	}
	
	private void finalizeGame() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				this.board[i][j] = "";
			}
		}
	}

	/** Metodo que
	 *  0 - X
	 *  1 - O
	 *  -1 - nothing
	 * @return
	 */
	public int analice() {
		if (board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X") ) {
			finalizeGame();
			return 0;
		}else if (board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X") ) {
			finalizeGame();
			return 0;
		}
		else if (board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X") ) {
			finalizeGame();
			return 0;
		}
		
		if (board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X") ) {
			finalizeGame();
			return 0;
		}else if (board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X") ) {
			finalizeGame();
			return 0;
		}
		else if (board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X") ) {
			finalizeGame();
			return 0;
		}
		
		//O
		if (board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O") ) {
			finalizeGame();
			return 1;
		}else if (board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O") ) {
			finalizeGame();
			return 1;
		}
		else if (board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O") ) {
			finalizeGame();
			return 1;
		}
		
		if (board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O") ) {
			finalizeGame();
			return 1;
		}else if (board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O") ) {
			finalizeGame();
			return 1;
		}
		else if (board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O") ) {
			finalizeGame();
			return 1;
		}
		
		//diagonal X
		if (board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) {
			finalizeGame();
			return 0;
		}else if (board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) {
			finalizeGame();
			return 0;
		}
		
		//diagonal O
		if (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")) {
			finalizeGame();
			return 1;
		}else if (board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")) {
			finalizeGame();
			return 1;
		}
		
		return -1;
	}
	
}
