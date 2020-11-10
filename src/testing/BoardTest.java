package testing;

import model.BlackPiece;
import model.Board;
import model.Triangle;
import model.WhitePiece;
import model.exceptions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;


public class BoardTest {

    private Board board;

    private Triangle triangle1 = new Triangle(1);
    private Triangle triangle2 = new Triangle(2);
    private Triangle triangle3 = new Triangle(3);
    private Triangle triangle4 = new Triangle(4);
    private Triangle triangle5 = new Triangle(5);
    private Triangle triangle6 = new Triangle(6);
    private Triangle triangle7 = new Triangle(7);
    private Triangle triangle8 = new Triangle(8);
    private Triangle triangle9 = new Triangle(9);
    private Triangle triangle10 = new Triangle(10);
    private Triangle triangle11 = new Triangle(11);
    private Triangle triangle12 = new Triangle(12);
    private Triangle triangle13 = new Triangle(13);
    private Triangle triangle14 = new Triangle(14);
    private Triangle triangle15 = new Triangle(15);
    private Triangle triangle16 = new Triangle(16);
    private Triangle triangle17 = new Triangle(17);
    private Triangle triangle18 = new Triangle(18);
    private Triangle triangle19 = new Triangle(19);
    private Triangle triangle20 = new Triangle(20);
    private Triangle triangle21 = new Triangle(21);
    private Triangle triangle22 = new Triangle(22);
    private Triangle triangle23 = new Triangle(23);
    private Triangle triangle24 = new Triangle(24);
    private WhitePiece whitePiece1 = new WhitePiece(1, triangle1);
    private WhitePiece whitePiece2 = new WhitePiece(2, triangle1);
    private WhitePiece whitePiece3 = new WhitePiece(3, triangle12);
    private WhitePiece whitePiece4 = new WhitePiece(4, triangle12);
    private WhitePiece whitePiece5 = new WhitePiece(5, triangle12);
    private WhitePiece whitePiece6 = new WhitePiece(6, triangle12);
    private WhitePiece whitePiece7 = new WhitePiece(7, triangle12);
    private WhitePiece whitePiece8 = new WhitePiece(8, triangle17);
    private WhitePiece whitePiece9 = new WhitePiece(9, triangle17);
    private WhitePiece whitePiece10 = new WhitePiece(10, triangle17);
    private WhitePiece whitePiece11 = new WhitePiece(11, triangle19);
    private WhitePiece whitePiece12 = new WhitePiece(12, triangle19);
    private WhitePiece whitePiece13 = new WhitePiece(13, triangle19);
    private WhitePiece whitePiece14 = new WhitePiece(14, triangle19);
    private WhitePiece whitePiece15 = new WhitePiece(15, triangle19);
    private BlackPiece blackPiece1 = new BlackPiece(1, triangle24);
    private BlackPiece blackPiece2 = new BlackPiece(2, triangle24);
    private BlackPiece blackPiece3 = new BlackPiece(3, triangle13);
    private BlackPiece blackPiece4 = new BlackPiece(4, triangle13);
    private BlackPiece blackPiece5 = new BlackPiece(5, triangle13);
    private BlackPiece blackPiece6 = new BlackPiece(6, triangle13);
    private BlackPiece blackPiece7 = new BlackPiece(7, triangle13);
    private BlackPiece blackPiece8 = new BlackPiece(8, triangle8);
    private BlackPiece blackPiece9 = new BlackPiece(9, triangle8);
    private BlackPiece blackPiece10 = new BlackPiece(10, triangle8);
    private BlackPiece blackPiece11 = new BlackPiece(11, triangle6);
    private BlackPiece blackPiece12 = new BlackPiece(12, triangle6);
    private BlackPiece blackPiece13 = new BlackPiece(13, triangle6);
    private BlackPiece blackPiece14 = new BlackPiece(14, triangle6);
    private BlackPiece blackPiece15 = new BlackPiece(15, triangle6);


    @BeforeEach
    public void runBefore() {

        board = new Board();

        board.setBlackPieces(new HashSet<>(Arrays.asList(blackPiece1, blackPiece2, blackPiece3, blackPiece4,
                blackPiece5, blackPiece6, blackPiece7, blackPiece8, blackPiece9, blackPiece10, blackPiece11,
                blackPiece12, blackPiece13, blackPiece14, blackPiece15)));
        board.setWhitePieces(new HashSet<>(Arrays.asList(whitePiece1, whitePiece2, whitePiece3, whitePiece4,
                whitePiece5, whitePiece6, whitePiece7, whitePiece8, whitePiece9, whitePiece10, whitePiece11,
                whitePiece12, whitePiece13, whitePiece14, whitePiece15)));
        board.setBlackHome(new HashSet<>(Arrays.asList(triangle6, triangle5, triangle4,
                triangle3, triangle2, triangle1)));
        board.setWhiteHome(new HashSet<>(Arrays.asList(triangle19,
                triangle20, triangle21, triangle22, triangle23, triangle24)));
        board.setTriangleList(new ArrayList<>(Arrays.asList(triangle1, triangle2, triangle3, triangle4, triangle5,
                triangle6, triangle7, triangle8, triangle9, triangle10, triangle11, triangle12, triangle13,
                triangle14, triangle15, triangle16, triangle17, triangle18, triangle19, triangle20, triangle21,
                triangle22, triangle23, triangle24)));


    }


    @Test
    public void testRemovePieceContained() {
        triangle1.removePiece(whitePiece1);
        assertFalse(triangle1.getPieces().contains(whitePiece1));
        assertEquals(1, triangle1.getPieces().size());

    }

    @Test
    public void testRemovePieceNotContained() {
        triangle1.removePiece(whitePiece4);
        assertFalse(triangle1.getPieces().contains(whitePiece4));
        assertTrue(triangle1.getPieces().contains(whitePiece1));
        assertTrue(triangle1.getPieces().contains(whitePiece2));
        assertEquals(2, triangle1.getPieces().size());

    }


    @Test
    public void testSetPosition() {
        assertEquals(1, whitePiece1.getPlace().getPosition());
        whitePiece1.setPlace(triangle3);
        assertFalse(triangle1.getPieces().contains(whitePiece1));
        assertTrue(triangle3.getPieces().contains(whitePiece1));
        assertEquals(3, whitePiece1.getPlace().getPosition());

    }


    @Test
    public void testGetPieceNoExceptionsThrown() {
        try {
            assertEquals(whitePiece1, board.getPiece("white", 1));
            assertEquals(blackPiece1, board.getPiece("black", 1));
            assertEquals(blackPiece15, board.getPiece("black", 15));
            assertEquals(whitePiece15, board.getPiece("white", 15));
        } catch (NoSuchPieceNumber /*| NoSuchPieceColor */e) {
            fail();
        }
    }



    @Test
    public void testGetPieceNumberExceptionThrown() {
        try {
            board.getPiece("white", 16);
            fail();
        } catch (NoSuchPieceNumber e) {
            e.getMessage();
        } /*catch (NoSuchPieceColor e) {
            fail();
        }*/

    }


    @Test
    public void testGetPieceBothExceptionsThrown() {
        try {
            board.getPiece("green", 16);
            fail();

        } catch (NoSuchPieceNumber /*| NoSuchPieceColor*/ e) {
            e.getMessage();
        }
    }


    @Test
    public void testGetTriangleNoExceptionsThrown() {
        try {
            assertEquals(triangle1, board.getTriangle(1));

        } catch (NoSuchTriangleNumber e) {
            fail();
        }
    }


    @Test
    public void testGetTriangleExceptionThrown() {
        try {
            board.getTriangle(25);
            fail();
        } catch (NoSuchTriangleNumber e) {
            e.getMessage();
        }
    }

    @Test
    public void testMovePieceNoIncumbents() {
        try {
            board.movePiece(whitePiece1, triangle3);
            assertEquals(triangle3, whitePiece1.getPlace());
            assertTrue(triangle3.getPieces().contains(whitePiece1));
            assertFalse(triangle1.getPieces().contains(whitePiece1));
            assertEquals(1, triangle3.getPieces().size());
            assertEquals(1, triangle1.getPieces().size());
        } catch (BlockedMove | PieceOnBarException e) {
            fail();
        }

    }


    @Test
    public void testMovePieceOneIncumbentSameColor() {
        try {
            board.movePiece(whitePiece1, triangle3);
            board.movePiece(whitePiece2, triangle3);
            assertTrue(triangle3.getPieces().contains(whitePiece1));
            assertTrue(triangle3.getPieces().contains(whitePiece2));
            assertFalse(triangle1.getPieces().contains(whitePiece1));
            assertFalse(triangle1.getPieces().contains(whitePiece3));
            assertEquals(triangle3, whitePiece1.getPlace());
            assertEquals(2, triangle3.getPieces().size());
            assertEquals(0, triangle1.getPieces().size());
        } catch (BlockedMove | PieceOnBarException e) {
            fail();
        }
    }


    @Test
    public void testMovePieceOneIncumbentDifferentColor() {
        try {
            board.movePiece(blackPiece15, triangle4);
            assertTrue(triangle4.getPieces().contains(blackPiece15));
            assertEquals(triangle4, blackPiece15.getPlace());
            assertEquals(1, triangle4.getPieces().size());
            assertFalse(triangle6.getPieces().contains(blackPiece15));
            assertEquals(4, triangle6.getPieces().size());
            board.movePiece(whitePiece1, triangle4);
            assertTrue(triangle4.getPieces().contains(whitePiece1));
            assertFalse(triangle4.getPieces().contains(blackPiece15));
            assertEquals(1, triangle4.getPieces().size());
            assertTrue(board.getTheBar().getBlackPieces().contains(blackPiece15));
            assertEquals(1, board.getTheBar().getBlackPieces().size());
        } catch (BlockedMove | PieceOnBarException e) {
            fail();
        }

    }


    @Test
    public void testMovePieceTwoIncumbentsSameColor() {
        try {

            board.movePiece(blackPiece10, triangle6);
            assertTrue(triangle6.getPieces().contains(blackPiece10));
            assertFalse(triangle8.getPieces().contains(blackPiece10));
            assertEquals(6, triangle6.getPieces().size());
            assertEquals(2, triangle8.getPieces().size());


        } catch (BlockedMove | PieceOnBarException e) {
            fail();
        }


    }

    @Test
    public void testMovePieceTwoIncumbentsDifferentColor() {
        try {
            board.movePiece(whitePiece1, triangle6);
            fail();

        } catch (BlockedMove | PieceOnBarException e) {
            e.getMessage();
        }

    }


    @Test
    public void testMovePieceWithBarOccupiedExceptionThrown() {

        try {
            board.movePiece(whitePiece1, triangle3);
            board.movePiece(blackPiece15, triangle3);
            board.movePiece(whitePiece2, triangle3);
            fail();


        } catch (BlockedMove | PieceOnBarException e) {
            e.getMessage();
        }

    }


    @Test
    public void testMovePieceWithBarOccupiedNoExceptionThrown() {

        try {

            board.movePiece(whitePiece1, triangle3);
            board.movePiece(blackPiece15, triangle3);
            board.movePiece(whitePiece1, triangle1);

        } catch (BlockedMove | PieceOnBarException e) {
            fail();

        }

    }


}
