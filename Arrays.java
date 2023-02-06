public class Arrays {
    public static void main(String[] args) {
        //int a[] = new int[10];
        int b[] = { 1, 2, 3, 4, 5 };
        //int c[];
        //c = new int[10];

        //int[] d = new int[5];

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }

        System.out.print("\n");
        b[2] = 15;

        for (int x : b) {
            System.out.print(x + " ");
        }
    }
}
