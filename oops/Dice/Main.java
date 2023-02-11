package oops.Dice;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        for (int count = 1; count <= 6; count++) {
            System.out.println(dice.roll());
        }

        for (int i = 0; i < dice.getFreqs().length; i++) {
            System.out.printf("face %d occurs %d times\n", i + 1, dice.getFreqs()[i]);
        }
    }
}
