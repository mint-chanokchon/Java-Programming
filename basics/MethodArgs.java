public class MethodArgs {
    public static void main(String[] args) {
        show(1, 2, 3, 4);
    }

    static void show(int... a) {
        for (int x : a) {
            System.out.println(x);
        }
    }
}
