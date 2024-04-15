package day05_mathOperations;

import java.util.Scanner;

public class C04_Modulus {

public static void main(String[] args) {
//Get a 4-digit number from the user
//print the sum of digits

Scanner scan = new Scanner(System.in);
System.out.println("Please enter a 4-digit number");
int number=scan.nextInt();


int digitsTotal=0;
int digit=number%10;
digitsTotal+=digit;
number/=10;

// repeat this process as many times as the number of steps.
// if we repeat, we find the sum of the numbers
digit=number%10;
digitsTotal+=digit;
number/=10;

digit=number%10;
digitsTotal+=digit;
number/=10;

digit=number%10;
digitsTotal+=digit;
number/=10;

System.out.println("Sum of digits of the number you entered: " + digitsTotal);

scan.close();
}

}
