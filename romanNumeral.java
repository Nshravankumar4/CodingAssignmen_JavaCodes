import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
  public static int romanToInt(String romanNumeral) {
    Map<Character, Integer> romanEquivalents = new HashMap<>();
    romanEquivalents.put('I', 1);
    romanEquivalents.put('V', 5);
    romanEquivalents.put('X', 10);
    romanEquivalents.put('L', 50);
    romanEquivalents.put('C', 100);
    romanEquivalents.put('D', 500);
    romanEquivalents.put('M', 1000);

    int result = 0;
    int previousValue = 0;

    for (int i = romanNumeral.length() - 1; i >= 0; i--) {
      int currentValue = romanEquivalents.get(romanNumeral.charAt(i));

      if (currentValue < previousValue) {
        result -= currentValue;
      } else {
        result += currentValue;
      }

      previousValue = currentValue;
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Roman Numeral: ");
    String inputRomanNumeral = scanner.nextLine().toUpperCase();
    scanner.close();

    int integerEquivalent = romanToInt(inputRomanNumeral);
    System.out.println("Roman Numeral " + inputRomanNumeral + " is equivalent to " + integerEquivalent);
  }
}
// out put is Roman Numeral IX is equivalent to 9