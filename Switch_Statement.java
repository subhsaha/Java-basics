import java.util.Scanner;

public class Switch_Statement {
	public static void main(String[] args) {
		String one;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Gender(M/F).");
		one = input.nextLine();
		switch (one) {
		case "M":
			System.out.println("Gender = Male");
			break;
		case "F":
			System.out.println("Gender = Female");
			break;
		default:
			System.out.println("Not Disclosed");
		}

	}

}

//>> string input is taken from the user 
//>> and used the input to display gender info 
//>> switch statement is used 
//>> variable 'one' is ued to take inputs and then passed into switch parameters 
//>> and then case statement is used to verify the input and display relvent output
//** Practice Problem**
