package model;


import java.util.ArrayList;
import java.util.List;

public class Dice {


    public static List<Integer> getRandomIntegerBetweenRange(double min, double max) {
        List<Integer> diceList = new ArrayList<>();
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        double y = (int) (Math.random() * ((max - min) + 1)) + min;
        if (x != y) {
            diceList.add((int) x);
            diceList.add((int) y);
        } else {
            diceList.add((int) x);
            diceList.add((int) x);
            diceList.add((int) x);
            diceList.add((int) x);
        }

        return diceList;
    }

}
