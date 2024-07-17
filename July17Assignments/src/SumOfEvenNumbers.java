import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of all even numbers from 1 to " + n + " is: " + sum);

        scanner.close();
    }
}
