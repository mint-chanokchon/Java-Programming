public class Method {
    public static void main(String[] args) {
        int a = 10, b = 15;
        max(a, b);

        int[] c = { 2, 4, 6, 8, 10 };
        change(c, 2, 20);

        int x = 10;
        change2(x, 20);

        String e = "Hello ";
        change3(e);
        System.out.println(e);
    }

    static void change3(String x) {
        x += "HHHHH" ;
    }

    static void change2(int x, int value) {
        x = value;
    }

    static void change(int[] a, int index, int value) {
        a[index] = value;
    }

    static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
