package day04_IncrementDecrement;
public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        // if a data in a large data round is replaced by a data in a smaller data round
        // if we want to assign it to a variable, java doesn't do it automatically
        
        int number1=300;
        
        short number2= (short) number1; 
        // java throws a mismatch error because the data types to the left and right of the equation are different
        // indicating our approval of the manipulation of the value in the large data type to resolve the error 
        // (short) is written
        
        System.out.println("number2 : " + number2);
        
        byte number3= (byte) number2;
        
        System.out.println("number3 : " + number3);
        // because the value is bigger than the byte's limits, java uses int 300 according to its own method
        // converts to bytes and meanwhile our data CHANGES
        
        double number4= 87.9;
        
        int number5 = (int) number4;
        
        System.out.println("number5 : " + number5);
        
        // java truncates the decimal part because the value has a comma and there is no decimal part in int
        // therefore data loss occurs
        
        
        int number6=27;
        int number7=4;
        
        
        System.out.println(number6 / number7 ); // since both numbers to be multiplied are int
        // java writes the result as int
        
        double number8=4;
        double number9=17;
		
		System.out.println(number6 / number8); //6,75 has a larger data type than the numbers being processed 
        // writes the result as a double because it is a double
        
        System.out.println(number9/number7); //4.25
    }
}
