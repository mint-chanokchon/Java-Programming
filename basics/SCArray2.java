import java.util.Scanner;

public class SCArray2 {
    public static void main(String args[]) {
        int a[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a key       ->");
        int key = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                System.out.println("Element found at    -> " + i);
                System.exit(0);
                sc.close();
            }
        }

        System.out.println("Not found");
        sc.close();

    }
}
