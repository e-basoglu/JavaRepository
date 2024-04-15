package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {
        /*
         * 1- Write a program that changes the values of the given variables number1 and number2 (SWAP)
            For example : number1=10 and number2=20;
            after the code runs
            number1=20 and number2=10
         */
		
		
		 int number1=10;
		 int number2=20;
		 
		 // initially number1=10 and number2=20
		 
		 
		 System.out.println("initially number1=" + number1 + " and number2=" + number2);
		 
		 // first create an empty variable
		 
		 int empty;
		 
		 // assign number2 to bos variable
		 empty=number2;
		 
		 // assign the value of number1 to the variable number2
		 number2=number1;
		 
		 // assign the value in the empty variable to number 1
		 number1=empty;
		 
		 System.out.println("as a result number1=" + number1 + " and number2=" + number2);
		 
	 
	 }
 }
