/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;

import java.util.Arrays;

/**
 *
 * @author School_Jeffrey
 */
public class Setup {
    
    public int[][] gameBoard = new int[9][9];
    
    public Setup(int[][] numbers){
        //this.gameBoard = numbers;
    }    
    
        
    public int[][] setGame(){    
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int value = (int) (Math.random() * 9 + 1);
                if (value != 0){
                    gameBoard[row][col] = value; 
                }
               
            }
           
            // Als er meer dan 2 dezelfde getallen in de rij staan (Per 9)
           
                // Als er meer dan 2 in kolom staan (Per 9)
                // DELETE ALL DOUBLE ENTRY'S 
        } 
        
        //System.out.println(gameBoard);
        return gameBoard;
    }
    
    public void resetGame() {
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++)
                    gameBoard[row][col] = 0;
            }
    }
    
    public int[][] getGame() {
        for(int[] nr : gameBoard) {
           System.out.println(Arrays.toString(nr));
        }
        return gameBoard;
    }
        
        
}
