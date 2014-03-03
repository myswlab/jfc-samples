package it.unibs.ing.fp.strings;

public class StringUtils {
	public static String reverse(String input) {
		String output = null;
		if (input != null) {
			output = "";
			for (int i = input.length() - 1; i >= 0; i--) {
				output += input.charAt(i);
			}
		}
		return output;
	}

	public static boolean isPalindrome(String object) {
		return true;
	}
}
