// Program asks the user to input several integers 
//separated by spaces
// It converts each value to an int and adds them together
import java.util.*;
public class DebugSeven2
{
   public static void main(String[] args)
   {
      String str;
      int x;
      int length;
      int start = 0;
      int num;
      int lastSpace = -1;
      int sum = 0;
      String partStr;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a series of integers separated by spaces >> ");
      str = in.nextLine();

      // changed str.len() to the correct method str.length()
      length = str.length();

      // corrected str.length to use the proper str.length() method
      for(x = 0; x < length; ++x)
      {
         if(str.charAt(x) == ' ')
         {
             partStr = str.substring(lastSpace + 1, x);     
             num = Integer.parseInt(partStr);
             System.out.println("                " + num);
             sum += num;
             lastSpace = x;
         } 
      }

      // used the proper variable name here
      partStr = str.substring(lastSpace + 1, length);

      // corrected the variable name from parStr to partStr
      num = Integer.parseInt(partStr);

      System.out.println("                " + num);

      sum += num; // corrected = to += to add the final number

      System.out.println("         -------------------" +
         "\nThe sum of the integers is " + sum);
   }
}
