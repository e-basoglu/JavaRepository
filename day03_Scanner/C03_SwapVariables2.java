package day03_Scanner;
public class C03_SwapVariables2 {
    public static void main(String[] args) {
        
        // 2- Determine the values of the given variables number1 and number2 
        // Make a program that changes (SWAP) without a 3rd variable
        
        int number1=15;
        int number2=20;
        
        // initially number1=10 and number2=20
        
        
        System.out.println("initially number1=" + number1 + " and number2=" + number2);
        
        // if we are not using a third variable, we use the difference of the two given numbers
        
        //as a first step I assign the difference of the numbers to the first number
        
        number1= number1-number2;
        
        
        // second step is to add the difference and number2
        // assign to sayi2
        
        number2=number1+number2;
        
        
        // As the 3rd step, I assign number2 - difference to number1
        
        number1=number2-number1;
        
        
        System.out.println("in result number1=" + number1 + " and number2=" + number2);
        
    }
}
  
