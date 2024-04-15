package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
    // There are 2 methods for String in Scanner operation
        // scan.next() only takes 1 word (up to the first space)
        // if there is a possibility of more words from the user
        // we should use scan.nextLine()
        
        // Ask the user for their first and last name separately
                // print the entered name as follows
                
                // entered name: Enes Basoglu
				
				Scanner scan= new Scanner(System.in);
				
                System.out.println("Please enter your name...");
                
                String name=scan.nextLine();
                
                System.out.println("Please enter your last name...");
                
                String surname=scan.nextLine();
                
                System.out.println("entered name : " + name + " " + surname );
                scan.close();
	}

}
