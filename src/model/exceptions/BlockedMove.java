package model.exceptions;

import model.Triangle;

public class BlockedMove extends Exception {

    private Triangle t;

    public BlockedMove(Triangle t) {
        super("Position " + t.getPosition() + " is blocked. You cannot move there.");
        this.t = t;

    }

}
