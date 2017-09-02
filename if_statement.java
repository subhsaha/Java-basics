import java.util.Scanner;

public class if_statement {

	public static void main(String[] args) {

		double one, two;
		Scanner input = new Scanner(System.in);// creating a variable with
												// scanner and taking input from
												// system (keyboard)
		System.out.println("Enter Your First No.");
		one = input.nextDouble();
		System.out.println("Enter Your 2nd  No.");
		two = input.nextDouble();

		if (one > two) {

			System.out.println("one is greater ");
		} else {
			System.out.println("two is greater ");
		}
		input.close();
	}

}
