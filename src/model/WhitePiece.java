package model;

public class WhitePiece extends Piece {

    final String color;

    public WhitePiece(int n, Triangle p) {
        super(n, p);
        color = "white";
    }



    @Override
    public void setPlace(Place p) {
        if (this.place != p) {
            this.place.removePiece(this);
            this.place = p;
            this.place.addPiece(this);
            if (p instanceof Triangle | p instanceof OffBoard) {
                this.homeStatus = p.getPosition() >= 19 | p.getPosition() == 25;
            }
        }
    }

    @Override
    public String getColor() {
        return color;
    }


}
