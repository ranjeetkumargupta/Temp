import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
        
        scanner.close();
    }
}
