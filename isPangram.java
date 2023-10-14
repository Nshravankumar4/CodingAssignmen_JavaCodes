import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence to check if it's a pangram:");
        String input = scanner.nextLine().toLowerCase();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");

        }

        scanner.close();
    }

    public static boolean isPangram(String input) {
        Set<Character> remainingAlphabet = new HashSet<>();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            remainingAlphabet.add(letter);
        }

        for (char character : input.toCharArray()) {
            remainingAlphabet.remove(character);
        }

        return remainingAlphabet.isEmpty();
    }
}
/*Enter a sentence to check if it's a pangram:
2
The input is not a pangram.*/