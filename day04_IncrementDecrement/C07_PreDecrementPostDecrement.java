package day04_IncrementDecrement;

public class C07_PreDecrementPostDecrement {

	public static void main(String[] args) {
		
		int number=10;
		
		number--;
		
		System.out.println(number); // 9
		
		int a=number--;
		
		
		System.out.println(a); //9
		System.out.println(number);//8
		
		
		System.out.println(--a); // 8

	}

}
