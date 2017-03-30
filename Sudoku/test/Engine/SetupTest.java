/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author School_Jeffrey
 */
public class SetupTest {
    
    public SetupTest() {
    }

    /**
     * Test of setGame method, of class Setup.
     */
    @Test
    public void testSetGame() {
        System.out.println("_____setGame_____");
        
        
        Setup newGame = new Setup(null);
        newGame.setGame();
        newGame.getGame();
        //newGame.resetGame();
        //newGame.toString();
        //newGame.setGame();
        //newGame.toString();
       
        
        //System.out.println(gameBoard.toString());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetGame method, of class Setup.
     */
    @Test
    public void testResetGame() {
        System.out.println("resetGame");
        //Setup instance = new Setup();
        //instance.resetGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Setup.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        //Setup instance = new Setup();
        //String expResult = "";
        //String result = instance.toString();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
