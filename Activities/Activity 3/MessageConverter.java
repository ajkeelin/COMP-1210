import java.util.Scanner;
/**
 */
public class MessageConverter {
   /**
    *@param args - Standard commandline arguments
    */
   public static void main(String[] args) {
    
      Scanner userInput = new Scanner(System.in);
      String message = "";
      int outputType = 0;
      String result = "";
      
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      System.out.print("\nOutput type:"
         + "\n\t1: As is"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
      
      if (outputType == 1) { // as is
         result = message;
      }
      else if (outputType == 2) { // lower case
         result = message.toLowerCase();
      }
      else if (outputType == 3) { // upper case
         result = message.toUpperCase();
      }
      else if (outputType == 4) { // replace vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else { // invalid input
         result = "Error: Invalid choice input.";
      }
      
      System.out.println("\n" + result);
      
   }
      
}   
