package model.exceptions;

public class NoSuchPieceColor extends Exception {

    private String color;

    public NoSuchPieceColor(String color) {
        super("there is no such piece color " + color);
        this.color = color;

    }


}
