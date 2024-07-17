import java.util.Scanner;

public class ReverseNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = scanner.nextInt();
        System.out.print("Natural numbers from " + n + " to 1 in reverse: ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
