import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        if (sumOfFactorials == originalNumber) {
            System.out.println(originalNumber + " is a strong number.");
        } else {
            System.out.println(originalNumber + " is not a strong number.");
        }

        scanner.close();
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
