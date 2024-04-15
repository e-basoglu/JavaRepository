package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		// follow 3 steps to get value from the user
        // Step 1 Create a Scanner object
		
		Scanner scan=new Scanner(System.in);
		
		
	// second step is to tell the user what we want		

		System.out.println("please write your name");
		
		String name=scan.next();

		System.out.println("your name..: " + name);
		
		
		
		// scan is a scanner object
        // it works even if we write a different name as the name, but we prefer scan
        // Since scan is an object, the data type is non-primitive
        // while primitive data types contain only values,
        // non-primitive data types contain methods next to the value
        // When we say scan, we can see these methods that we can use
		
		scan.close();
	}

}
