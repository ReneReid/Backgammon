package model.exceptions;

public class NoSuchPieceNumber extends Exception {

    private int num;

    public NoSuchPieceNumber(int num) {
        super("there is no piece number " + num);
        this.num = num;
    }

}
