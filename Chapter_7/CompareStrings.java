import java.util.Scanner;

class CompareStrings {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String string1 = "Carmen";      
      String string2;
      
      System.out.print("Enter your name > ");
      string2 = input.nextLine();
      if (string2.equals(string1)) {
         System.out.println("Carmen equals " + string2);
      }
      else {
         System.out.println("Carmen does not equal " + string2);
      }
   }      

}