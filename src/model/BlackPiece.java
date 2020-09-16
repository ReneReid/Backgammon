package model;

public class BlackPiece extends Piece {

    final String color;


    public BlackPiece(int n, Triangle p) {
        super(n, p);
        this.color = "black";
    }


    @Override
    public void setPlace(Place p) {
        if (this.place != p) {
            this.place.removePiece(this);
            this.place = p;
            this.place.addPiece(this);
//            boolean status;
//            if (p.getPosition() <= 6 && p.getPosition() > 0) {
//                status = true;
//            } else if (p.getPosition() >= 25) {
//                status = true;
//            } else {
//                status = false;
//            }
//            this.setHomeStatus(status);
            this.setHomeStatus(p.getPosition() <= 6 && p.getPosition() > 0 || p.getPosition() >= 25);
//            if (p instanceof Triangle | p instanceof OffBoard) {
//                this.homeStatus = p.getPosition() <= 6 | p.getPosition() == 25;
//            }
        }
    }


    @Override
    public String getColor() {
        return color;
    }




}
