import java.util.Scanner;
public class Increment_Operator {

	public static void  main(String[]args){
		int one,two,res;
		Scanner input =  new Scanner (System.in) ;
		
		System.out.println("Enter First no");
		one = input.nextInt();
		System.out.println("Enter 2nd no");
		two = input.nextInt();
		++one;
		
		res = one+two;
		
		System.out.println( one + " + " + two + " = "+res);
		two++;
		res = one+two;
		System.out.println( one + " + " + two + " = "+res);
		
	}
}
