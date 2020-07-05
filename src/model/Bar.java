package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bar extends Place {

    List<Piece> blackPieces;
    List<Piece> whitePieces;

    public Bar() {
        blackPieces = new ArrayList<>();
        whitePieces = new ArrayList<>();
    }


    public List<Piece> getBlackPieces() {
        return blackPieces;
    }

    public List<Piece> getWhitePieces() {
        return whitePieces;
    }

    public void setBlackPieces(List<Piece> blackPieces) {
        this.blackPieces = blackPieces;
    }

    public void setWhitePieces(List<Piece> whitePieces) {
        this.whitePieces = whitePieces;
    }


    @Override
    public void addPiece(Piece p) {
        if (p instanceof BlackPiece) {
            blackPieces.add(p);
        } if (p instanceof WhitePiece) {
            whitePieces.add(p);
        }
    }



    @Override
    public void removePiece(Piece p) {
        if (p instanceof BlackPiece) {
            blackPieces.remove(p);

        } if (p instanceof WhitePiece) {
            whitePieces.remove(p);
        }

    }

    @Override
    public int getPosition() {
        return 0;
    }
}
