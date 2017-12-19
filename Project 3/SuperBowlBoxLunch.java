import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * Accept coded information for a Super
 * Bowl box lunch. Includes theme, number
 * of adult meals and price, number of
 * child meals and price, and name of
 * the customer.
 */
public class SuperBowlBoxLunch {
   /**
    * @param args - Standard commandline arguments
    *
    * @author Austin Keelin
    * @version 02/03/2016
    */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String orderCode = "";
      int length = 0;
      int adultPriceInt = 0;
      int adultMealsInt = 0;
      int childPriceInt = 0;
      int childMealsInt = 0;
                  
      System.out.print("Enter order code: ");
      orderCode = userInput.nextLine();
      orderCode = orderCode.trim();
      
      length = orderCode.length() - 1;
      
      if (length < 13) {
         System.out.println("\n*** Invalid Order Code ***");
         System.out.println("Order code must have "
            + "at least 13 characters.");
      }
      else {
         System.out.print("\nName: ");
         String name = orderCode.substring(13);
         System.out.println(name);
      
         System.out.print("Adult meals: ");
         String adultMeals = orderCode.substring(1, 3);
         adultMealsInt = Integer.parseInt(adultMeals);
         DecimalFormat  mealsDecimal = new DecimalFormat("#0");
         String adultPriceOne = orderCode.substring(3, 5);
         String adultPriceTwo = orderCode.substring(5, 7);
         String adultPriceFull = adultPriceOne + "." + adultPriceTwo;
         double adultPriceDouble = Double.parseDouble(adultPriceFull);
         DecimalFormat  priceDecimal = new DecimalFormat("$0.00");
         System.out.println(mealsDecimal.format(adultMealsInt)
            + " at " 
            + priceDecimal.format(adultPriceDouble));
         
         System.out.print("Child meals: ");
         String childMeals = orderCode.substring(7, 9);
         childMealsInt = Integer.parseInt(childMeals);
         String childPriceOne = orderCode.substring(9, 11);
         String childPriceTwo = orderCode.substring(11, 13);
         String childPriceFull = childPriceOne + "." + childPriceTwo;
         double childPriceDouble = Double.parseDouble(childPriceFull);
         System.out.println(mealsDecimal.format(childMealsInt)
            + " at " 
            + priceDecimal.format(childPriceDouble));
         
         System.out.print("Total: ");
         double totalPrice = (adultMealsInt * adultPriceDouble) 
            + (childMealsInt * childPriceDouble);
         System.out.println(priceDecimal.format(totalPrice));
         
         System.out.print("Theme: ");
         String theme = orderCode.substring(0, 1);
         int themeInt = Integer.parseInt(theme);
         if (themeInt == 0) {
            System.out.println("Broncos");
         }
         else if (themeInt == 1) {
            System.out.println("Panthers");
         }
         else { 
            System.out.println("Broncos and Panthers");
         }
      
         System.out.print("Lucky Number: ");
         Random randomGenerator = new Random();
         int lucky = randomGenerator.nextInt(9999);
         int luckyNumber = lucky + 1;
         String luckyFormatted = String.format("%04d", luckyNumber);
         System.out.println(luckyFormatted);
         
      }
   }
}     