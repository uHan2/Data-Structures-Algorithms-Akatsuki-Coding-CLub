package JAVA;

public class ConvertToRomanNo {

    // Arrays defining the values and symbols for Roman number conversion
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convertToRoman(int n) {
        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            // Repeat until the given number n is greater than or equal to values[i]
            while (n >= values[i]) {
                n -= values[i]; // Subtract values[i] from n
                romanNumber.append(symbols[i]); // Add the corresponding Roman number symbol to the result
            }
        }
        return romanNumber.toString(); // Return the result string
    }

    public static void main(String[] args) {
        // Test case code.
        System.out.println(convertToRoman(5)); // V
        System.out.println(convertToRoman(3)); // III
        System.out.println(convertToRoman(58)); // LVIII
        System.out.println(convertToRoman(1994)); // MCMXCIV
        System.out.println(convertToRoman(3018)); // MMMXVIII
    }
}
