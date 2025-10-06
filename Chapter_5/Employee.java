public class Employee {
   int eNumber;
   double payrate;
   int maxEnum = 9999;
   double maxRate = 60.00;
   double omultiplier = 1.5;
   
   public Employee(int eNumber, double payrate) { 
      setEmployeeNumber(eNumber);
      setPayrate(payrate);
}

   public void setEmployeeNumber(int eNumber){
   
   if(eNumber > maxEnum)
      this.eNumber = maxEnum;
   else
      this.eNumber = eNumber;      
   }
   
   public void setPayrate(double payrate){
   
   if(eNumber > maxEnum)
      this.payrate = maxRate;
   else
      this.payrate = payrate;   
   }
   
   public int geteNumber(){
   return eNumber;
   }
   
   public double getpayrate(){
   return payrate;
   }
   
   public double calcuReguRate(int hoursworked) {
      if (hoursworked <= 40)
         return hoursworked * payrate;
      else 
         return 40 * payrate; 
   }
   
   public double calcuOveRate(int hoursworked) {
   
      if(hoursworked >= 40)
         return(hoursworked - 40) * payrate * omultiplier;
            else
            return 0;
   }  

}      
