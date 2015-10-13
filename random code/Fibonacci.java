import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String userChoice;
		do {
			System.out.print("What number of the Fibonacci sequence do you want to find" +
										" (starting with 0)? ");
			int number = keyboard.nextInt();
			int value = fibonacci(number);
			System.out.printf("The number at position %d of the Fibonacci sequence is %d\n", number, value);
			System.out.print("Do you want to find another number? Y/N ");
			userChoice = keyboard.next();
		} while (userChoice.equals("y") || userChoice.equals("Y"));
		
	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}