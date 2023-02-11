package oops.Dice;

import java.util.Random;

public class DiceV2 {
    private int[] freqs = new int[6];

    public int[] getFreqs() {
        return freqs;
    }

    private static Random R = new Random();

    public int roll() {
        // random between 1 ~ 6
        //Random r = new Random(); // expensive process (process ที่แพงนการสร้าง)
        int face = R.nextInt(6) + 1;
        freqs[face - 1] += 1;
        return face;
    }
}
