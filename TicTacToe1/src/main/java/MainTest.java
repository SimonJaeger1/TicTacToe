
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class MainTest {

        @Test
        public void testGenerateField() {
            char[][] expectedField = {
                    {'-', '-', '-'},
                    {'-', '-', '-'},
                    {'-', '-', '-'}
            };
            char[][] generatedField = Main.generateField();
            assertArrayEquals(expectedField, generatedField);
        }

        @Test
        public void testGenerateFieldNotNull() {
            assertNotNull(Main.generateField());
        }

        @Test
        public void testCheckWinner_NoWinnerAtStart() {
            assertFalse(Main.checkWinner());
        }
        @Test
        public void testCheckWinner_NoWinner() {
            char[][] playfield = {
                    {'X', 'O', 'X'},
                    {'O', 'X', 'O'},
                    {'O', 'X', 'O'}
            };
            Main.playfield = playfield;
            Main.playerTurn = 'X';
            assertFalse(Main.checkWinner());
        }

        @Test
        public void testCheckWinner_RowWin() {
            char[][] playfield = {
                    {'X', 'X', 'X'},
                    {'O', '-', 'O'},
                    {'-', 'O', '-'}
            };
            Main.playfield = playfield;
            Main.playerTurn = 'X';
            assertTrue(Main.checkWinner());
        }

        @Test
        public void testCheckWinner_ColumnWin() {
            char[][] playfield = {
                    {'X', 'O', '-'},
                    {'X', 'O', '-'},
                    {'X', '-', 'O'}
            };
            Main.playfield = playfield;
            Main.playerTurn = 'X';
            assertTrue(Main.checkWinner());
        }

        @Test
        public void testCheckWinner_DiagonalWin() {
            char[][] playfield = {
                    {'X', 'O', 'O'},
                    {'-', 'X', '-'},
                    {'O', '-', 'X'}
            };
            Main.playfield = playfield;
            Main.playerTurn = 'X';
            assertTrue(Main.checkWinner());
        }

        @Test
        public void testCheckWinner_ReverseDiagonalWin() {
            char[][] playfield = {
                    {'O', 'O', 'X'},
                    {'-', 'X', '-'},
                    {'X', '-', 'O'}
            };
            Main.playfield = playfield;
            Main.playerTurn = 'X';
            assertTrue(Main.checkWinner());
        }

     /*   @Test
        public void testIsValidMove_Valid() {
            assertTrue(Main.isValidMove(0, 0));
        }

        @Test
        public void testIsValidMove_Invalid() {
            Main.playfield[0][0] = 'X';
            assertFalse(Main.isValidMove(0, 0));
        }

        @Test
        public void testIsValidMove_OutOfBounds() {
            assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                Main.isValidMove(3, 3);
            });
        }*/

        @Test
        public void testRequestGame_Continue() {
            // Simulate user input "y" for continue
            Main.keepPlaying = "y";
            Main.requestGame();
            assertFalse(Main.gameWon);
            assertEquals(0, Main.turnCounter);
            assertEquals('X', Main.playerTurn);
            assertEquals('-', Main.playfield[0][0]);
        }



    }

