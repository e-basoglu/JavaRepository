package day03_Scanner;

public class C01_Variables {

	public static void main(String[] args) {

        /*
         * 1- Create 3 different types of data variables and write them 
         * 2- Create two variables for first and last name and set them to    
         * Your name is: Mehmet 
         * your last name: Bulutluoz 
         * 3- 2 variables in two different integer data types
         Create * and write the sum of these 
         * 4- One integer and one decimal
         Create a * variable and write the sum of these 
         * 5 � Create a variable of type char data and write it 
         * 6- Create an integer and a char variable
         * and write down the sum of these.
         * 
         */
		
		String name= "John Smith";
		
		System.out.println(name);
		
		@SuppressWarnings("unused")
		char firsLetter='S';
		
		@SuppressWarnings("unused")
		boolean isUnderstood = true;
		
		String  yourName = "Ali" ;
		String yourLastName = "Tuskan";
		
		
		
		System.out.println("yourName : "+yourName);
		
		
		System.out.println("yourLastName : " + yourLastName);
		
		// Create 2 variables of two different integer data types and write their sum  
		int a=10;
		short b=20;
		
		System.out.println(a+b); //30
		
		// Create an integer and a char variable and write their sum.
		int number=25;
		char character='a';
		
		// If char variables are mathematically manipulated, the character contained in the char variable 
        // processes ascii value
		System.out.println(number + character); // 122
		
		
	}

}
