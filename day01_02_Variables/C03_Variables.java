package day01_02_Variables;
public class C03_Variables {
    public static void main(String[] args) {
        int number1= 10;
        int number2= 20;
        
        String number3="10";
        String number4="20";
        
        
        System.out.println(number1+number2); // 30
        System.out.println(number3+number4); // 1020
        
        // Different data types can take the same value
        // what is important here is that I can manipulate these variables according to the variable type.
		
        String letter1="A";
        char letter2='A';
        
        // write 30A using the above variables
        
        System.out.println(number1+number2+letter1); // 30A
        System.out.println(number1+number2+letter2); // 95
        
        // char takes numeric values in mathematical operations due to its extra feature
        
        System.out.println(letter1+number1+number2); // A1020
        System.out.println(number1+letter1+number2); // 10A20
        System.out.println(letter1+(number1+number2)); // A30
        
        
    }
}
