package day05_mathOperations;
public class C02_MathOperations {
    public static void main(String[] args) {
        int number1=10;
        int number2=20;
        
        String str1="Ali";
        String str2="Can";
        
        System.out.println(number1+number2+str1); // 30Ali   
        
        System.out.println(str1+number1+number2); // Ali1020
        
        System.out.println(str2+(number1+number2)); // Can30
        
        System.out.println(number1*number2+str1); // 200Ali
        
        System.out.println(str1+number1*number1); // Ali100
    }
}

