package day04_IncrementDecrement;
import java.util.Scanner;
public class C02_Scanner {
    public static void main(String[] args) {
        
        // Get the user's name and type the first letter of the name.
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please type your name");
        
        char firstLetter=scan.next().charAt(0);
        
        System.out.println("the first letter of your name : " + firstLetter); 
        
        scan.close();
    }
}
