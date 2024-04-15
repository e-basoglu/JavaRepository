package day04_IncrementDecrement;
import java.util.Scanner;
public class C01_Scanner {
    public static void main(String[] args) {

        // Ask the user for a half-cap and measure the circumference of the circle 
        // and calculate and write the area of the circle
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Please enter the radius of the circle");
        
        double radius=scan.nextDouble();
        
        double circumference= 2*2*3.14*radius; // circumference = 2*pi*radius
        
        double area= 3.14*radius*radius; // area = pi * radius * radius
         
        System.out.println("circumference of the circle : " + circumference);
        System.out.println("area of the circle : " + area);
        
        scan.close();
    }
}
