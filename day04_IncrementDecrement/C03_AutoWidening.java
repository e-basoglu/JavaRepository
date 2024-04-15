package day04_IncrementDecrement;
public class C03_AutoWidening {
    public static void main(String[] args) {
        
        byte number1=44;
        
        short number2= number1;
        // left side of equality is short, right side is byte 
        // java does not object even though the two data rounds are different
        // because the data type of the variable being assigned is (short) 
        // the assigned value is larger than the data type (byte), so there is no problem
        
        
        System.out.println("number2 : " + number2);
        
        
        int number3= 55;
        
        double number4= number3;
        
        System.out.println("number4 : " + number4);
        
        // if the data round of the assigned value is smaller than the data round of the assigned variable
        // Java makes casting automatic
        // this process is called auto widening
        // 
        
    }
}
