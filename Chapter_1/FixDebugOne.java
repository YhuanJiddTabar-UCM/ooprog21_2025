public class FixDebugOne {
/*This program displays a greeting*/

   public static void main(String[] args) {
   
   System.out.println("Hello World!");
   }
}

/*
   List of spotted bugs:
   
   1. Class name had a space "FixDebug One" it should be "FixDebugOne".
   2. Main method name was upper case "Main" it should be "main".
   3. Typo in printing Hello World!, Systm should be System.out.println("Hello World!");
   4. Missing semicolon, it should end in semicolon ;.
   5. Missing closing brace for the class, needs an extra } at the end.
   6. Main method parameter was "String args", it should be (String [] args).

*/
