package day04_IncrementDecrement;
public class C05_IncrementDecrement {
    public static void main(String[] args) {
        
        // assignment operation changes the value of the count permanently
        // addition, subtraction, etc. without an assignment operation will only be performed on that line
        // does not permanently change the value of the number
        
        int number1=10;
        
        System.out.println(number1+=5);//15
        // this operation increments the value of number1 by 5 and assigns it to number1
        // therefore the value of number1 changes permanently
        
        System.out.println(number1);//15
        
        
        System.out.println(number1+12); // 27
        
        System.out.println(number1);// 15
        
        number1++;
        // although the = sign is not visible, there is an assignment in the number1++ operation
        // therefore the value changes permanently
        
        System.out.println(number1); //16
    }
}