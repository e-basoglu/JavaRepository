package day05_mathOperations;
public class C01_MathOperations {
    public static void main(String[] args) {
        
        System.out.println(4*(2+5)/2); // 14
        
        
        System.out.println(4*(2+5)/3); // 9 28/3 = 9
        
        // if we want to write the result with commas
        
        double result=4*(2+5)/3 ;
        
        
        System.out.println(result); // 9.0
        
        result= (double)(4*(2+5)/3) ;
        
        
        System.out.println(result); // 9.0
        
        
        result= (double)(4*(2+5)/3) ;
        
        System.out.println(result); // 9.333333333333334
        
        result=4 * (2+5)/(double)3 ;
        
        System.out.println(result); // 9.333333333333334
        
        
        int number1=5;
        int number2=2;
        double number3=2;
        
        
        System.out.println(number1/number2); // 5/2=2
        
        System.out.println(number1/number3); // 5/2=2.5
        
        System.out.println(number1+number3/number2); // 6.0
        
}
}