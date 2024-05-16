package day06_wrapper;

public class C03_ConditionalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println(5+3==8 || 6+5==10 || 7-2==3);// true
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3);// false
		
		int a=10;
		int b= 20;
		int c=30;
		
		boolean result= a>b || b>c || a+b>=c ;
		
		System.out.println(result); // true
		
	// The && sign can also be used, but there is a catch.
	// When the && sign finds the first false, it knows that the result of this operation will be false
	// and prints the result as false without checking the remaining operations
	// The & sign first completes all operations and then prints the result as false
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3 && 5>=2 && 7+3<=10); // 
		
		
		System.out.println(5+3==8 & 6+5==10 & 7-2==3 && 5>=2 && 7+3<=10); // 
		
		int age=50;
		int height=180;
		char gender ='M';
		
		System.out.println(age<30 && height>170 && gender=='M'); //false
		

	}

}
