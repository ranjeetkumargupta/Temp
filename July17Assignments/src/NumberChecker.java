import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        boolean foundNine = false;
        int limit = Math.min(4, numbers.size());

        for (int i = 0; i < limit; i++) {
            if (numbers.get(i) == 9) {
                foundNine = true;
                break;
            }
        }

        System.out.println(foundNine);

        scanner.close();
    }
}
