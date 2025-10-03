// DebugFive4.java
// Outputs highest of four numbers

import java.util.*;

public class DebugFive4//removed public 
{
    public static void main(String[] args)
    {
        int one, two, three, four;
        int highest;
        Scanner input = new Scanner(System.in);

              System.out.print("Enter an integer >> ");
        one = input.nextInt();

        System.out.print("Enter an integer >> ");
        two = input.nextInt();  //changed  variable name one into two

        System.out.print("Enter an integer >> ");
        three = input.nextInt();  //changed variable name one into three

        System.out.print("Enter an integer >> ");
        four = input.nextInt();  //changed variable name one into four

        //Corrected logic to determine the highest value
        if(one >= two && one >= three && one >= four)
            highest = one;
        else if(two >= one && two >= three && two >= four)
            highest = two;
        else if(three >= one && three >= two && three >= four)
            highest = three;
        else
            highest = four;

        System.out.println("The highest number is " + highest);
    }
}
