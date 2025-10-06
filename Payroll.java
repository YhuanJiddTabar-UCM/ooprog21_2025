import java.util.Scanner;

class Payroll {

   public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   
    System.out.print("How many hours did you work this week?: ");
         int hours = sc.nextInt();

              
      System.out.print("What is your regular Payrate?: ");
         double reguPay = sc.nextDouble();
         
           
      Employee emp = new Employee(hours,reguPay);
      
      double regularPay = emp.calcuReguRate(hours);
      double overtimePay =  emp.calcuOveRate(hours);
       
         
      System.out.print("Regular pay is " + regularPay);
      System.out.print("\nOvertime pay is " + overtimePay);
         
         
   }

}