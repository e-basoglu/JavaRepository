package day04_IncrementDecrement;
public class C06_PreIncrementPostIncrement {
    public static void main(String[] args) {
        // preIncrement and post increment are only valid for number++ or number--
        int number=10;
        
        number++;
        number++;
        number++;
        
        System.out.println(number); // 13
        
        
        System.out.println(number++); // 13 
                                    
        System.out.println(number); // 14
        
        // ++number if you want to increment first and then write
        // number++ if you want to write first and then increment
        
        System.out.println(++number); // 15 
    }
}
