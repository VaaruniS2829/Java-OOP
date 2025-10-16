

public class ArithmeticException {

	public static void main(String[] args) {

		try {

			int numerator = 10;

			int denominator = 0;

			int result = numerator / denominator;

		} // This line throw an exception

	catch(ArithmeticException e){

			System.err.println("Error : Cannot divide by zero .");

			// This block execute because of the division by zero

		}

	System.out.println(" Program continues after handling the exception .");

		

	}

}
