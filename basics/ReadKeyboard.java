import java.util.Scanner;

public class ReadKeyboard {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Message -> ");
        String x = scanner.nextLine();
        System.out.println("Bob -> " + x.substring(0, x.length() - 1) + "!");
        scanner.close();
    }
}
