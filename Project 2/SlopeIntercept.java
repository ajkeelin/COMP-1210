import java.util.Scanner;
/**
 * Given the x and y coordiantes for
 * two points, the slope, X intercept,
 * and Y intercept, if they are defined,
 * will be calculated and displayed in
 * standard output.
 * 
 * @author Austin Keelin
 * @version 1-28-2016
 */
public class SlopeIntercept {
   /**
    * Calculates the slope, X intercept,
    * and Y intercept when given the x and y
    * coordinates for two points.
    *
    * @param args - Standard commandline arguments
    *
    */
   public static void main(String[] args) {
    
      Scanner userInput = new Scanner(System.in);
      double x1 = 0;
      double x2 = 0;
      double y1 = 0;
      double y2 = 0;
      double slope = 0;
      double yIntercept = 0;
      double xIntercept = 0;
      
      System.out.println("Enter the X and " 
         + "Y coordinates of the first point: ");
      System.out.print("\tx1 = ");
      x1 = userInput.nextDouble();
      System.out.print("\ty1 = ");
      y1 = userInput.nextDouble();
      
      System.out.println("Enter the X and "
         + "Y coordinates of the second point: ");
      System.out.print("\tx2 = ");
      x2 = userInput.nextDouble();
      System.out.print("\ty2 = ");
      y2 = userInput.nextDouble();
      
      System.out.print("Slope: ");
      if (x1 == x2) {
         System.out.println("\"undefined\"");
      }
      else {
         slope = (y2 - y1) / (x2 - x1);
         System.out.println(slope);
         
         System.out.print("Y intercept: ");
         yIntercept = y1 - (slope * x1);
         System.out.println(yIntercept);
         
         System.out.print("X intercept: ");
         if (y1 == y2) {
            System.out.println("\"undefined\"");
         }
         else {
            xIntercept = -1 * (yIntercept / slope);
            System.out.println(xIntercept);
         }
      }   
      
   }
}