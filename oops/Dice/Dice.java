package oops.Dice;

import java.util.Random;

public class Dice {
    private int[] freqs = new int[6];

    public int[] getFreqs() {
        return freqs;
    }

    public int roll() {
        // random between 1 ~ 6
        Random r = new Random();
        int face = r.nextInt(6) + 1;
        freqs[face - 1] += 1;
        return face;
    }
}