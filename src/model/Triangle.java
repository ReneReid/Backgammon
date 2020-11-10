package model;

import java.util.HashSet;
import java.util.Iterator;

public class Triangle extends Place implements Iterable<Piece>{
    final int position;
    HashSet<Piece> pieces;

    public Triangle(int p) {
        this.position = p;
        pieces = new HashSet<>();

    }

    public int getPosition() {
        return position;
    }

    public HashSet<Piece> getPieces() {
        return pieces;
    }


    public void setPieces(HashSet<Piece> pieces) {
        this.pieces = pieces;
    }


    @Override
    public void addPiece(Piece p) {
        if (!pieces.contains(p)) {
            pieces.add(p);
            p.setPlace(this);
        }

    }

    @Override
    public void removePiece(Piece p) {
        if (pieces.contains(p)) {
            pieces.remove(p);
        }
    }

    @Override
    public Iterator<Piece> iterator() {
        return pieces.iterator();
    }
}
