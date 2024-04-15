package day03_Scanner;
import java.util.Scanner;
public class C05_Scanner {
    public static void main(String[] args) {
        // Ask the user for their first and last name separately
        // print the entered name as follows
        
        // entered name: Enes Basoglu
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Please enter your name...");
        
        String name=scan.next();
        
        System.out.println("Please enter your last name...");
        
        String surname=scan.next();
        
        System.out.println("entered name : " + name + " " + surname);
        scan.close();
    }
}
