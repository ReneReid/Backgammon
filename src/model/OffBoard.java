package model;

import java.util.HashSet;
import java.util.Set;

public class OffBoard extends Place {

    Set<Piece> whitePieces;
    Set<Piece> blackPieces;

    public OffBoard() {
        whitePieces = new HashSet<>();
        blackPieces = new HashSet<>();

    }


    public Set<Piece> getWhitePieces() {
        return whitePieces;
    }

    public Set<Piece> getBlackPieces() {
        return blackPieces;
    }


    public void setWhitePieces(Set<Piece> whitePieces) {
        this.whitePieces = whitePieces;
    }

    public void setBlackPieces(Set<Piece> blackPieces) {
        this.blackPieces = blackPieces;
    }

    public int numberWhitePieces() {
        return whitePieces.size();
    }

    public int numberBlackPieces() {
        return blackPieces.size();
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
        return 25;
    }
}
