import java.util.Scanner;
   
   class BankBalance {
   
      public static void main(String[] args){
      
         Scanner sc = new Scanner(System.in);
         double currentBal;
         int userChoice;
         int years = 1;
         final double rate = 0.03;
         
         System.out.print("Enter initial bank balance >  ");
         currentBal = sc.nextDouble();
         sc.nextLine();
         
         System.out.println("\nDo you want to see next year's balance?");
         System.out.print("Enter 1 for yes or any number for no >>");
         userChoice = sc.nextInt();
         sc.nextLine();
         
         currentBal = currentBal + (currentBal * rate);
         System.out.println("\nAfter year 1 at 0.03 interest rate, balance is "+ currentBal);
         
            while (userChoice == 1) {
               System.out.println("\nDo you want to see the balance at the end of another year?");
               System.out.print("Enter 1 for yes or any number for no >>");
                userChoice = sc.nextInt();
                sc.nextLine();
                
                if(userChoice == 1){
                currentBal = currentBal + (currentBal * rate);
                years++;
                System.out.println("\nAfter "+years+" years at 0.03 interest rate, balance is "+currentBal);
                }
            }
            System.exit(0);         
      
      
      }
   
   }