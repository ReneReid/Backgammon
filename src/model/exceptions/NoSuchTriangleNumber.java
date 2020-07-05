package model.exceptions;

public class NoSuchTriangleNumber extends Exception {

    private int num;

    public NoSuchTriangleNumber(int num) {
        super("there is no triangle number" + num);
        this.num = num;

    }


}
