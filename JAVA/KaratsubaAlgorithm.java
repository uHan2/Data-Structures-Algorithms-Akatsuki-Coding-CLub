package JAVA;

public class KaratsubaAlgorithm {

	// Method to convert binary string to decimal integer
	private static int binaryToDecimal(String binary) {
		return Integer.parseInt(binary, 2);
	}

	// Method to multiply two binary strings and return the product in decimal
	public static int multiplyBinaryStrings(String A, String B) {
		// Convert both binary strings to decimal
		int number1 = binaryToDecimal(A);
		int number2 = binaryToDecimal(B);

		// Multiply the decimal values and return the result
		return number1 * number2;
	}
}
