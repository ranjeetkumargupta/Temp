import java.util.Scanner;

public class DivisibleBySumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sumOfDigits = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            sumOfDigits += tempNumber % 10;
            tempNumber /= 10;
        }

        if (number % sumOfDigits == 0) {
            System.out.println(number + " is divisible by the sum of its digits.");
        } else {
            System.out.println(number + " is not divisible by the sum of its digits.");
        }

        scanner.close();
    }
}
