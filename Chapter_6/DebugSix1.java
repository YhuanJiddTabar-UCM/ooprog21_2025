// Start with a penny
// double it every day
// how much do you have in x number of days?

import java.util.Scanner;

    class DebugSix1 { //removed public in class
    public static void main(String args[]) {
    
        Scanner keyboard = new Scanner(System.in);
        int days;
        double money = 0.01;
        int day = 1;
        
        System.out.print("Enter number of days >> ");  //put the missing semicolon
        days = keyboard.nextInt();

        while(day <= days) {  // the condition is wrong, it should be day <= days
            
            System.out.println("After day " + day + " you have " + money);  //wrong variable in message
            money = money * 2;
            day++ ;
        }
    }
}