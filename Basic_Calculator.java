import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double one, two, res;
		System.out.println("Enter First No.");
		one = input.nextDouble();
		System.out.println("Enter Secound No.");
		two = input.nextDouble();
		res = one + two;
		System.out.println(res);

		input.close();

	}

}

//**Creating Basic calulator**
//>> Similar use of scanner to get the data
//>> in the 6th line a Scanner variable is created to take input from keyboard. 
//>> 7th line is where variables are declared in total 3 first two to take input and res to store results.
//>> 8th line prints the first statement ^^.
//>> 9th line takes input from keyboard that is by using scanner variable and use of nextdouble as value type will be double.
//>>10th ask for 2nd no.
//>> and same way it takes value for 2nd one. 
//>> once done a sum  is perfrormed by using arithmatic operator and value/output are then stored back in .
//>>and then its printed .
//>> 15th line closes scanner statement.
