import java.text.DecimalFormat;
/**
 * Defines a right regular heaxagonal
 * prism and determines the base
 * perimeter, base area, surface area,
 * and volume using side and height.
 */
public class HexagonalPrism {
   /**
    * Insert label, side, and height
    * to determine base perimeter,
    * base area, surface area, and
    * volume.
    *
    * @author Austin Keelin
    * @version 03/19/2016
    */

   // Fields - Instance variables
   private String label;
   private double side;
   private double height;
   
   /**
    * @param labelIn label
    * @param sideIn side
    * @param heightIn height
    */
   
   // Constructor
   public HexagonalPrism(String labelIn, double sideIn, double heightIn) {
      label = labelIn;
      side = sideIn;
      height = heightIn;
   }
   
   /**
    * @return return
    */   
     
   // Methods
   public String getLabel() {
      label = label.trim();
      return label;
   }
   /**
    * @return return
    * @param labelIn label
    */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }   
         
   }
   /**
    * @return return
    */
   public double getSide() {
      return side;
   }
   /**
    * 
    * @param sideIn side
    */
   public void setSide(double sideIn) {
      side = sideIn;
   }
   /**
    * @return return
    */
   public double getHeight() {
      return height;
   }
   /**
    * 
    * @param heightIn height
    */
   public void setHeight(double heightIn) {
      height = heightIn;
   }
   /**
    * @return return
    */
   public double basePerimeter() {
      double basePerimeter;
      basePerimeter = 6 * side;
      return basePerimeter;
   }
   /**
    * @return return
    */
   public double baseArea() {
      double baseArea;
      baseArea = 3 * (Math.sqrt(3)) * ((Math.pow(side, 2)) / 2);
      return baseArea;
   }
   /**
    * @return return
    */
   public double surfaceArea() {
      double surfaceArea;
      surfaceArea = (6 * side * height) 
         + (3 * Math.sqrt(3) * Math.pow(side, 2));
      return surfaceArea;
   }
   /**
    * @return return
    */
   public double volume() {
      double volume;
      volume = ((3 * Math.sqrt(3)) / 2) * (Math.pow(side, 2)) * (height);
      return volume;
   }
   /**
    * @return return
    */
   public String toString() {
      DecimalFormat format = new DecimalFormat("#,##0.0##");
      
      String output = "\"" + label + "\""  
         + " " + "is a hexagonal prism "
         + "with side = " + format.format(side) + " units and height = "
         + format.format(height) + " units," + "\n";
      output += "which has base perimeter = "
         + format.format(basePerimeter()) + " units, base area = "
         + format.format(baseArea()) + " square units," + "\n";
      output += "surface area = " + format.format(surfaceArea())
         + " square units, and volume = " 
         + format.format(volume()) + " cubic units.";
      return output;
   }                                             
}      
   

 