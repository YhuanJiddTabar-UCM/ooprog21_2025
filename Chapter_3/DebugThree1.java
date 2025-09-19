// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;

 class DebugThree1 { //removed public specifier for class to support older version of JAVA
    public static void main(String [] args) {
        double check1;
        double check2;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble();  //input.nextInt(); changed to input.nextDouble();
        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble();  //input.nextInt(); changed to input.nextDouble();
        

        calcTip(check1);
        calcTip(check2);  
    }

    
    public static void calcTip(double bill) {  // Added a parameter "double bill" to receive the check amount
        final double RATE = 0.15;  //typo changed "doubel" to "double"
        double tip;
        tip = bill * RATE;  //  formula should multiply bill by RATE, not divide.
        System.out.println("The tip should be at least $" + tip);  
    }
}

