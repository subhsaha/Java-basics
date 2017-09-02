import java.util.Scanner;

public class ArithOps {

	public static void main(String[] args) {

		int one, two, res;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter First no");
		one = input.nextInt();
		System.out.println("Enter secound no");
		two = input.nextInt();
		res = one + two;
		System.out.println("Addition of two nos " + res);
		res = one / two;
		System.out.println("Division of two nos " + res);
		res = one % two;
		System.out.println("Remainder of two nos " + res);
		res = one * two;
		System.out.println("Multiplication of two nos " + res);

		input.close();

	}
}
 // >>Two variables are taken using  Scanner.
 //>> and several calculations are performed.
 
