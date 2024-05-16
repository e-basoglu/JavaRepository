package day06_wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {

		int number1 = 10;
		Integer number2 = 20;

		System.out.println(number1 + number2);

		// number1. When we write it, no method appears, because number1 is an int, that
		// is, it is primitive.
		// number2. When we write it, many methods come up, because number2 is Integer,
		// which means it is a wrapper class.

		String tel1 = "3578987";
		String tel2 = "3245434";

		System.out.println(tel1 + tel2); // 35789873245434

		// if you want to add these numbers

		System.out.println(Integer.valueOf(tel1) + Integer.valueOf(tel2)); // 6824421

		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Integer.MAX_VALUE); // 2147483647

		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(Short.MAX_VALUE); // 32767

		// String streetNo= "B203";
		String streetNo = "203";
		// String streetNo= "1564";
	

		System.out.println(Integer.valueOf(streetNo) + Integer.valueOf(streetNo));
		// Integer.valueOf(String numeric expression) method is saved as string
		// converts numeric expressions to numbers
		// only if there is a non-numeric character in the String expression
		// Java throws NumberFormatException and stops working
		// stops execution

		System.out.println("Hello world");

	}

}



/* Each primitive data type in Java has a corresponding wrapper class. For example:

int has Integer
double has Double
char has Character
You can create an object of the wrapper class and use its methods to perform operations on the primitive data type. For example, converting an int to a String, or finding the minimum or maximum value of a set of numbers.

Here's a simple example:

java
Copy code
int number = 10; // primitive data type
Integer wrappedNumber = Integer.valueOf(number); // wrapping primitive into object

System.out.println(wrappedNumber.toString()); // converting to String

int result = wrappedNumber.intValue() + 5; // getting the primitive value and performing operation

System.out.println(result); // printing the result
Wrapper classes provide a way to treat primitive data types as objects, allowing for more flexibility in Java programming. */