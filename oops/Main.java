package oops;

public class Main {
    public static void main(String[] args) {
        BoxV1 boxV1 = new BoxV1();
        boxV1.d = 10.0d;
        boxV1.w = 5.0d;
        boxV1.h = 7.0d;

        BoxV2 boxV2 = new BoxV2(4, 10, 6);
        System.out.println(boxV2.volumn());
        System.out.println(boxV2.surfaceArea());
        System.out.print(boxV2);
    }
}
