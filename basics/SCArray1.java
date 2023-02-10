public class SCArray1 {
    public static void main(String args[]) {
        int a[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);
    }
}
