package day01_02_Variables;

public class C01_Variables {


	public static void main(String[] args) {
		
		// creating a variable and assigning a value are different operations
        // if we want, we can create a variable and assign a value in one line
		
		String nameStudent = "Celal";
		
		System.out.println(nameStudent); // Celal
		
		// or we can create it first and assign a value at any time
		int number;
		number=10;
		
		System.out.println(number); // 10
		
		// we have already created and assigned a value to a variable
        // we can assign a new value
        // in this case java deletes the old value of the variable and assigns the new value to the variable
		number=25;
		System.out.println(number); // 25
		
		nameStudent="Mustafa";
		
		System.out.println(nameStudent); // Mustafa
	}

}
