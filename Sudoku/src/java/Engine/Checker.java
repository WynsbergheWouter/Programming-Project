/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;


public class Checker {
    
    
    // PAUSE GAME 
        // SAVE NUMS 
        // SAVE TIME 

    /**
     *
     * @param board
     * @return
     */
    
    
    public boolean isSudokuValid(char[][] board) {
	if (board == null || board.length != 9 || board[0].length != 9)
		return false;
	// check each column
	for (int i = 0; i < 9; i++) {
		boolean[] m = new boolean[9];
		for (int j = 0; j < 9; j++) {
			if (board[i][j] != '.') {
				if (m[(int) (board[i][j] - '1')]) {
					return false;
				}
				m[(int) (board[i][j] - '1')] = true;
			}
		}
	}
 
	//check each row
	for (int j = 0; j < 9; j++) {
		boolean[] m = new boolean[9];
		for (int i = 0; i < 9; i++) {
			if (board[i][j] != '.') {
				if (m[(int) (board[i][j] - '1')]) {
					return false;
				}
				m[(int) (board[i][j] - '1')] = true;
			}
		}
	}
 
	//check each 3*3 matrix
	for (int block = 0; block < 9; block++) {
		boolean[] m = new boolean[9];
		for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
			for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
				if (board[i][j] != '.') {
					if (m[(int) (board[i][j] - '1')]) {
						return false;
					}
					m[(int) (board[i][j] - '1')] = true;
				}
			}
		}
	}
 
	return true;
    }
}
