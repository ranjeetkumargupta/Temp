import java.util.Scanner;

public class LuckyNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;

        boolean isLucky = false;
        int position = 0, sumOfSquares = 0;

        while (number > 0) {
            int digit = number % 10;
            if(position%2 == 0)
            	sumOfSquares+=digit*digit;
            number /= 10;
            position++;
        }

        if (sumOfSquares % 9 == 0) {
            isLucky = true;
        }

        if (isLucky) {
            System.out.println(temp + " is a lucky number.");
        } else {
            System.out.println(temp + " is not a lucky number.");
        }

        scanner.close();
    }
}
