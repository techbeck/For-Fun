import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Input a string.");
		String input = keyboard.nextLine();
		System.out.println(reverse(input));
	}
	public static String reverse(String s) {
		if (s == null || s.isEmpty() || s.length() == 1) {
			return s;
		}
		boolean hasPeriod = false;
		s = s.trim();
		int periodPos = s.indexOf(".");
		if (periodPos > 0) {
			s = s.substring(0, periodPos);
			hasPeriod = true;
		}
		String[] splitString = s.split(" ");
		StringBuilder result = new StringBuilder("");
		for (int i = splitString.length - 1; i > 0; i--) {
			result.append(splitString[i] + " ");
		}
		result.append(splitString[0]);
		if (hasPeriod) {
			result.append(".");
		}

		return result.toString();
	}
}