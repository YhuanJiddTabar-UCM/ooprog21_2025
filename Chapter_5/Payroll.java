import java.util.Scanner;

class Payroll {

   public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   
      System.out.print("Enter Employee Number: ");
         int employeeNum = sc.nextInt(); 
      System.out.print("How many hours did you work this week?: ");
         int hours = sc.nextInt();  
      System.out.print("What is your regular Payrate?: ");
         double reguPay = sc.nextDouble();
         
            
      Employee emp = new Employee(employeeNum, reguPay);
      
      double regularPay = emp.calcuReguRate(hours);
      double overtimePay = emp.calcuOveRate(hours);
      
      System.out.println("\nHow many hours did you work this week? " + hours);
      System.out.println("What is your regular pay rate? " + emp.getpayrate());    
      System.out.println("Regular pay is " + regularPay);
      System.out.println("Overtime pay is " + overtimePay);
         
         
   }

}