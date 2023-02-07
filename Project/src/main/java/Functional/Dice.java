package Functional;

import java.util.Random;

public class Dice {
    private int value;

    public void setValue(int diceValue) {
        value = diceValue;
    }

    public int getValue() {
        return value;
    }

    /**
     * Metoda vygeneruje hodene cislo
     */
    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }
}
