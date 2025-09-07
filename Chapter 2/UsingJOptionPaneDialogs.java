import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs{
  
   public static void main(String [] args){
      String nameInput;
      int yesOrno;
   
   
      do{
      
         nameInput = JOptionPane.showInputDialog(null,"Enter your name:");
         yesOrno =  JOptionPane.showConfirmDialog(null,"Do you want to confirm your name?");
         
      }while (yesOrno == 1 );
          
     String outputMessage = "Hello, Good Morning! "+nameInput;
     
     JOptionPane.showMessageDialog(null,outputMessage);
  
   
   }    
   

}