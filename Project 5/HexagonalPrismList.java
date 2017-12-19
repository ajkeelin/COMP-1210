import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 * Creates class that stores the list name
 * and an ArrayList of HexPrism objects.
 * Includes methods that return the name, the
 * number of HexPrism objects. Return the 
 * total surface area, volume, base perimeter,
 * base area, and average surface area, and
 * volume. 
 * 
 */
public class HexagonalPrismList {
   /**
    * @author Austin Keelin
    * @version 02/28/2016
    */
    
   // Fields
   private String listName;
   private ArrayList<HexagonalPrism> hexPrism = new ArrayList<HexagonalPrism>();
   
   /**
    * @param listNameIn listName
    * @param hexPrismIn hexPrism
    */
   // Constructor
   public HexagonalPrismList(String listNameIn, 
      ArrayList<HexagonalPrism> hexPrismIn) 
   {
      listName = listNameIn;
      hexPrism = hexPrismIn;
   }
   /**
    *@return return
    */
   // Methods
   public String getName() {
      return listName;
   }
   /**
    *@return return
    */
   public int numberOfHexagonalPrisms() {
      if (hexPrism.size() == 0) {
         return 0;
      }
      else {   
         return hexPrism.size(); 
      }  
   }
   /**
    *@return return
    */ 
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < hexPrism.size()) {
         total += hexPrism.get(index).surfaceArea(); 
         index++;
      } 
      return total;
   }   
   /**
    *@return return
    */   
   public double totalVolume() {
      double total = 0;
      int index = 0;
      while (index < hexPrism.size()) {
         total += hexPrism.get(index).volume(); 
         index++;
      } 
      return total;       
   }      
   /** 
    *@return return
    */   
   public double totalBasePerimeter() {
      double total = 0;
      int index = 0;
      while (index < hexPrism.size()) {
         total += hexPrism.get(index).basePerimeter(); 
         index++;
      } 
      return total;
   } 
   /**
    *@return return
    */
   public double totalBaseArea() {
      double total = 0;
      int index = 0;
      while (index < hexPrism.size()) {
         total += hexPrism.get(index).baseArea(); 
         index++;
      } 
      return total;
   }
   /**
    *@return return
    */
   public double averageSurfaceArea() {
      double total = 0;
      int index = 0;
      if (hexPrism.size() == 0) {
         return 0.0;
      }
      else {   
         while (index < hexPrism.size()) {
            total += hexPrism.get(index).surfaceArea(); 
            index++;
         } 
         total = total / hexPrism.size();
         return total;
      }   
   }
   /**
    *@return return
    */
   public double averageVolume() {
      double total = 0;
      int index = 0;
      if (hexPrism.size() == 0) {
         return 0.0;
      }
      else {   
         while (index < hexPrism.size()) {
            total += hexPrism.get(index).volume(); 
            index++;
         } 
         total = total / hexPrism.size();
         return total;
      }    
   }
   /**
    *@return return
    */
   public String toString() {
      String result = "\n";
      result += getName() + "\n";
      int index = 0;          
      while (index < hexPrism.size()) {
         result += "\n" + hexPrism.get(index).toString() + "\n";
         index++;
      }
      return result;
   }
   /**
    *@return return
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- " + getName() + " Summary -----";
      result += "\nNumber of Hexagonal Prisms: " 
         + numberOfHexagonalPrisms();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += "\nTotal Base Perimeter: " + df.format(totalBasePerimeter());
      result += "\nTotal Base Area: " + df.format(totalBaseArea());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
      
      return result;
   }
                       
}
        