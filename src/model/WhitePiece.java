package model;

public class WhitePiece extends Piece {

    final String color;

    public WhitePiece(int n, Triangle p) {
        super(n, p);
        color = "white";
    }


    // MODIFIES: place, this
    // EFFECTS: updates places's list of pieces + updates piece's stated place. updates piece's homeStatus.
    // NOTE: piece's homeStatus only updated when setPlace is called.

    @Override
    public void setPlace(Place p) {
        if (this.place != p) {
            this.place.removePiece(this);
            this.place = p;
            this.place.addPiece(this);
            this.setHomeStatus(p.getPosition() >= 19);
//            if (p instanceof Triangle | p instanceof OffBoard) {
//                this.setHomeStatus(p.getPosition() >= 19 | p.getPosition() == 25);
//            }
        }
    }

    @Override
    public String getColor() {
        return color;
    }


}
