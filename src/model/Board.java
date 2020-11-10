package model;

import model.exceptions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Board {

    List<Triangle> triangleList;
    Bar theBar;
    OffBoard theOffBoard;
    Set<WhitePiece> whitePieces;
    Set<BlackPiece> blackPieces;
    Set<Triangle> whiteHome;
    Set<Triangle> blackHome;

    public Board() {

        triangleList = new ArrayList<>();
        theBar = new Bar();
        theOffBoard = new OffBoard();
        whitePieces = new HashSet<>();
        blackPieces = new HashSet<>();
        whiteHome = new HashSet<>();
        blackHome = new HashSet<>();

    }


    public List<Triangle> getTriangleList() {
        return triangleList;
    }

    public Bar getTheBar() {
        return theBar;
    }

    public OffBoard getTheOffBoard() {
        return theOffBoard;
    }

    public Set<WhitePiece> getWhitePieces() {
        return whitePieces;
    }

    public Set<BlackPiece> getBlackPieces() {
        return blackPieces;
    }


    // REQUIRES: integer between 1 and 15, color either black or white
    // MODIFIES: NA
    // EFFECTS: returns corresponding piece

    public Piece getPiece(String color, int n) throws NoSuchPieceNumber {
        if (color.equals("black")) {
            for (BlackPiece bp : blackPieces) {
                if (bp.getNumber() == n) {
                    return bp;
                }
            }
        }
        else {
            for (WhitePiece wp : whitePieces) {
                if (wp.getNumber() == n) {
                    return wp;
                }
            }

        }
        throw new NoSuchPieceNumber(n);
    }

    // REQUIRES: integer between 1 and 24
    // MODIFIES: NA
    // EFFECTS: returns corresponding triangle

    public Triangle getTriangle(int n) throws NoSuchTriangleNumber {
        for (Triangle t : triangleList) {
            if (t.getPosition() == n) {
                return t;
            }
        }

        throw new NoSuchTriangleNumber(n);

    }


    public Set<Triangle> getWhiteHome() {
        return whiteHome;
    }

    public Set<Triangle> getBlackHome() {
        return blackHome;
    }

    public void setTriangleList(List<Triangle> triangleList) {
        this.triangleList = triangleList;
    }

    public void setTheBar(Bar theBar) {
        this.theBar = theBar;
    }


    public void setTheOffBoard(OffBoard theOffBoard) {
        this.theOffBoard = theOffBoard;
    }

    public void setWhitePieces(Set<WhitePiece> whitePieces) {
        this.whitePieces = whitePieces;
    }

    public void setBlackPieces(Set<BlackPiece> blackPieces) {
        this.blackPieces = blackPieces;
    }

    public void setWhiteHome(Set<Triangle> whiteHome) {
        this.whiteHome = whiteHome;
    }


    public void setBlackHome(Set<Triangle> blackHome) {
        this.blackHome = blackHome;
    }


    //EFFECTS: returns true if player has won the game.

    public Boolean win(Piece piece) {
        if (piece.getColor().equals("white")) {
            return theOffBoard.getWhitePieces().size() == 15;

        } else if (piece.getColor().equals("black")) {
            return theOffBoard.getBlackPieces().size() == 15;

        } return false;

    }



    //EFFECTS: returns true if can move pieces offBoard.
    public Boolean canMoveOffBoard(Piece piece) {
        boolean allStatusHome = true;
        if (piece.getColor().equals("white")) {
            for (WhitePiece wp: whitePieces) {
                if (!wp.getHomeStatus()) {
                    allStatusHome = false;
                    break;
                }

            }

        } else if (piece.getColor().equals("black")) {
            for (BlackPiece bp: blackPieces) {
                if (!bp.homeStatus) {
                    allStatusHome = false;
                    break;
                }
            }

        } return allStatusHome;

    }

    //MODIFIES: piece, this
    //EFFECTS: moves a piece to the offBoard position of the board.

    public void movePieceOffBoard(Piece piece) throws InvalidOffBoardRequest {
        if (canMoveOffBoard(piece)) {
            //theOffBoard.addPiece(piece);
            //piece.place = theOffBoard;
            //piece.getPlace().removePiece(piece);
            piece.setPlace(theOffBoard);

        } else {
            throw new InvalidOffBoardRequest(piece);
        }

    }




    //MODIFIES: Piece, this (board)
    //EFFECTS: moves a piece to indicated position (if valid). Throw relevant exception if not valid.

    public void movePiece(Piece piece, Triangle t) throws BlockedMove, PieceOnBarException {
        if (piece.getColor().equals("white") && theBar.getWhitePieces().size() > 0
                && !theBar.getWhitePieces().contains(piece)) {
            throw new PieceOnBarException(theBar.getWhitePieces().get(0));
        } else if (piece.getColor().equals("black") && theBar.getBlackPieces().size() > 0
                && !theBar.getBlackPieces().contains(piece)) {
            throw new PieceOnBarException(theBar.getBlackPieces().get(0));
        } else if (t.getPieces().isEmpty()) {
            piece.setPlace(t);
        } else if (!t.getPieces().isEmpty()) {
            Piece ip = t.getPieces().iterator().next();
            if (ip.getColor().equals(piece.getColor())) {
                piece.setPlace(t);
            } else if (!ip.getColor().equals(piece.getColor())) {
                if (t.getPieces().size() == 1) {
                    piece.setPlace(t);
                    t.removePiece(ip);
                    ip.setPlace(theBar);
                    //ip.setHomeStatus(false);
                }
                if (t.getPieces().size() > 1) {
                    throw new BlockedMove(t);

                }

            }

        }

    }


}
