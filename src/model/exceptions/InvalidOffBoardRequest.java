package model.exceptions;


import model.Piece;

public class InvalidOffBoardRequest extends Exception {

    private Piece piece;


    public InvalidOffBoardRequest(Piece piece) {
        super("Cannot move " + piece.getColor() + " pieces offBoard because not all " + piece.getColor() + " pieces are home.");
        this.piece = piece;

    }


}
