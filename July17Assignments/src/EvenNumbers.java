import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = scanner.nextInt();
        System.out.print("Even numbers from 1 to " + n + ": ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
