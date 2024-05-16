package day06_wrapper;

public class C04_If {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		if (a > 5) {
			System.out.println("the number a is greater than five");
		}

		if (a > b) {
			System.out.println("the number a is greater than b");
		}

		if (b > 100) {
			System.out.println("b number is greater than 100");
		}

		// simple if statements run independently, all if's body can work, some can run
		// even the bodies of none of them may work
		// each if statement looks at its own condition, if the condition is true, the
		// body runs,
		// If the condition is false, the body will not work

	}

}