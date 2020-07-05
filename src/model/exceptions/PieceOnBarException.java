package model.exceptions;

import model.Piece;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PieceOnBarException extends Exception {

    //private int piece;

    private Piece piece;

    public PieceOnBarException(Piece p) {
        super("piece " + p.getNumber() +  " on the bar");
        this.piece = p;

    }





}
