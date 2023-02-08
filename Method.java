public class Method {
    public static void main(String[] args) {
        int a = 10, b = 15;
        byte c = 10, d = 15;
        System.out.println(max(a, b));
        System.out.println(max(c, d));
        System.out.println(max(10.67f, 15.33f));

        // int[] c = { 2, 4, 6, 8, 10 };
        // change(c, 2, 20);

        // int x = 10;
        // change2(x, 20);

        // String e = "Hello ";
        // change3(e);
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
        return (x > y) ? x : y;
    }

    static float max(float x, float y) {
        return (x > y) ? x : y;
    }

    static byte max(byte x, byte y) {
        return (x > y) ? x : y;
    } 
}
