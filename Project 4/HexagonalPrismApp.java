import java.util.Scanner;
/**
 * Program that takes the example label,
 * the side, and the height and calculates
 * the base perimeter, base area, surface area,
 * and volume in standard output.
 */
public class HexagonalPrismApp {
   /**
    * User inputs the label, side, and height.
    * Base perimeter, base area, surface area,
    * and volume are calculated and printed
    * in standard output 
    *
    * @author Austin Keelin
    * @version 02/17/2016
    *
    * @param args Command line arguments
    */
   public static void main(String[] args) {
      double side, height;
      String label;
      HexagonalPrism hex;
      Scanner userInput = new Scanner(System.in);
      
      System.out.println("Enter label, side, and "
         + "height for a hexagonal prism.");
         
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      
      System.out.print("\tside: ");
      side = Double.parseDouble(userInput.nextLine());
      
      System.out.print("\theight: ");
      height = Double.parseDouble(userInput.nextLine());
      
      hex = new HexagonalPrism(label, side, height);
      String hexOutput = hex.toString();
      System.out.print(hexOutput);
   }
}       