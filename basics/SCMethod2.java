public class SCMethod2 {
    public static void main(String[] args) {
        System.out.println(reverse(12345));

        int[] a = { 1, 2, 3, 4, 5 };
        int[] result = reverse(a);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double length, double breadth) {
        return length * breadth;
    }

    public static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        return rev;
    }

    public static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        int j = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            b[j++] = a[i];
        }

        return b;
    }

    public static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]");
    }

    public static boolean validate(int age) {
        return age >= 3 && age <= 15;
    }
}
