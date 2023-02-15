package oops;

public class Main {
    public static void main(String[] args) {
        Ragtangle[] ragtangles = new Ragtangle[3];
        ragtangles[0] = new Ragtangle(10, 5);
        ragtangles[1] = new Ragtangle(12, 8);
        ragtangles[2] = new Ragtangle(14, 11);

        for (Ragtangle d: ragtangles) {
            System.out.println(d.area());
        }
    }
}
