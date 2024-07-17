import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = number;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Number of digits in " + number + " is: " + count);

        scanner.close();
    }
}
