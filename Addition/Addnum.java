// Adding Two Numbers

public class Addnum
{ 
    private double num;
    
     // Description: It reads out the addtion of two numbes 
     // Input: Double 
     // Output: Double 
     // Example: 1+1=2
     
     // This will allow for an input of two numbers that will prompt an output
    
    public Addnum(double num1, double num2)
    {
        num = num1 + num2;
    }
    
    // This will show the sum of the two numbers that were entered
    
    public void showanswer()
    {
        System.out.println("Sum of two numbers =" + num);
    }
        
}
