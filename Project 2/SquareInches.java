import java.util.Scanner;
/**
 * Value is entered in square inches and then
 * the value is converted to acres, square yards,
 * square feet, and square inches and then displayed
 * in standard output.
 *
 * @author Austin Keelin
 * @version 1-27-2016
 */
public class SquareInches { 

     /** 
      * Converts square inches to acres, square
      * yards, square feet, and square inches and
      * displays the values.
      *
      * @param args - Standard commandline arguments
      *
      */   
   public static void main(String[] args) {
            
      Scanner userInput = new Scanner(System.in);
      String name = "";
      // initial values are the values before conversion
      int initialSquareInches = 0; 
      int acres = 0;
      int initialSquareYards = 0; 
      int squareYards = 0;
      int initialSquareFeet = 0; 
      int squareFeet = 0;
      int squareInches = 0;
         
      System.out.print("Enter the area in square inches: ");
      initialSquareInches = userInput.nextInt();
      
      if (initialSquareInches > 1000000000) {
         System.out.println("Limit of 1,000,000,000 " 
            + "square inches exceeded! ");
      }      
      else {
         System.out.println("Number of Units: ");
         
         System.out.print("\tAcres: ");
         acres = initialSquareInches / 6272640;
         System.out.println(acres); 
         
         System.out.print("\tSquare Yards: ");
         initialSquareYards = initialSquareInches % 6272640;
         squareYards = initialSquareYards / 1296;
         System.out.println(squareYards);
         
         System.out.print("\tSquare Feet: ");
         initialSquareFeet = initialSquareYards % 1296;
         squareFeet = initialSquareFeet / 144;
         System.out.println(squareFeet);
         
         System.out.print("\tSquare Inches: ");
         squareInches = initialSquareFeet % 144;
         System.out.println(squareInches);
      }      
   }
}