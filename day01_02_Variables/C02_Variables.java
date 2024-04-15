package day01_02_Variables;
public class C02_Variables {
    public static void main(String[] args) {
        
        String school="Yildiz Koleji";
        
        // cannot create a variable with the same name and variable type twice
        // String school="Mehmet College";
        
        
        // You cannot create a variable with the same name twice, even if it is a different type of data
        // int school=20;
        
        
        // we can assign a new value to an existing variable
        school="Ankara College";
        
        
        System.out.println(school); // Mehmet College
        
        // if we want to add a description in the write operation
        // For example, school name: Mehmet College
        
        
        
        System.out.println("school name : " + school);// school name : Ankara College
        System.out.println("school name : " + "school"); // school name : school
        
        
        
    }
}

