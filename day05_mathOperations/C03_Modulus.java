package day05_mathOperations;

		import java.util.Scanner;
		
		public class C03_Modulus {
		
		public static void main(String[] args) {
		
		//get a 3 digit number from the user
		// prints the sum of digits
		//write a program
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a 3-digit number");
		int number=scan.nextInt();
		
		//let the number be 573
		
		int digitsTotal=0;
		
		int digit=number%10; //gives me the ones place digit=3
		
		digitsTotal+=digit; // the sum of the digits is 3
		
		//our number is still 573
		// I want to get rid of 3
		// because the name is finished with 3
		//make the number 57
		
		number/=10;
		
		// count now 57
		// How do I get 7?
		digit=number%10;
		
		digitsTotal+=digit;
		
		// the number is still 57
		// Let's get rid of 7 too
		number/=10;
		// the number is now 5
		
		digitsTotal+=number;
		
		
		System.out.println("Sum of digits of the number you entered: " + digitsTotal);
		
		
		scan.close();
		
		
	}

}
