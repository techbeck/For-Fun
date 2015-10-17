import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What number do you want to find the factorial for? ");
		int num = keyboard.nextInt();
		System.out.println("The factorial is: " + factorial(num));
	}

	public static int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("No factorial defined for " + n);
		}
		if (n == 0) {
			return 1;
		}
		return n * factorial(n-1);
	}
}