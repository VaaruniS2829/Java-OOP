package oopjavalabpackage;



public class ArrayIndexingException {

public static void main(String[] args) {

	try {

		String[] names = {"Alice" , "Bob" , "Charlie"};

		//The valid indices are 0 ,1 and 2.

		System.out.println(names[3]);

		// Trying to access index 3 , which is not out of bounds

	}catch(ArrayIndexOutOfBoundsException e) {

		System.err.println("Error : Invalid array index.");

		System.err.println("You tried to access an element that does not exist.");

		

		}

	}

}



