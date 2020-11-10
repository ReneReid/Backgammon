package model;

public abstract class Piece {

    final int number;
    Place place;
    Boolean barStatus;
    Boolean homeStatus;
    Boolean offBoardStatus;
    String color;


    public Piece(int n, Triangle p) {
        this.number = n;
        this.place = p;
        p.addPiece(this);
        barStatus = false;
        homeStatus = false;
        offBoardStatus = false;
        this.color = "";

    }


    public int getNumber() {
        return number;
    }





    public Place getPlace() {
        return place;

    }



    //REQUIRES: valid place object
    //MODIFIES: this, place
    //EFFECTS: changes the place position of the piece

    public void setPlace(Place p) {
        if (this.place != p) {
            this.place.removePiece(this);
            this.place = p;
            this.place.addPiece(this);

        }
    }


    public Boolean getBarStatus() {
        return barStatus;
    }

    public Boolean getHomeStatus() {
        return homeStatus;
    }

    public void setHomeStatus(Boolean s) {
        this.homeStatus = s;

    }


    public void setBarStatus(Boolean s) {
        this.barStatus = s;

    }

    public Boolean getOffBoardStatus() {
        return offBoardStatus;
    }

    public void setOffBoardStatus(Boolean offBoardStatus) {
        this.offBoardStatus = offBoardStatus;
    }


    public String getColor() {
        return color;
    }
}
