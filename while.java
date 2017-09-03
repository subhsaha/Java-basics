import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int one, res, c = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number");
		one = input.nextInt();
		// System.out.println("Enter range from");
		// c = input.nextInt();
		while (c <= 20) {
			res = one * c;
			System.out.println(one + " x " + c + " = " + res);
			c++;
		}

	}

}
