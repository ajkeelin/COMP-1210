import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.IOException;
import java.io.File;
/**
 * Creates class that stores the list name
 * and an ArrayList of HexPrism objects.
 * Includes methods that return the name, the
 * number of HexPrism objects. Return the 
 * total surface area, volume, base perimeter,
 * base area, and average surface area, and
 * volume. 
 * For project 06 added different methods which
 * returns the ArrayList, reads the file and creates
 * a list, adds an object to the list, deletes an
 * object from the list, finds an object in the
 * list, and edits an object in the list.
 * 
 */
public class HexagonalPrismList {
   /**
    * @author Austin Keelin
    * @version 03/06/2016
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
      result += "\n----- " + getName() + " Summary -----";
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
   /**
    *@return return
    */
   public ArrayList<HexagonalPrism> getList() {
      return hexPrism;
   }
   /**
    *@param fileNameIn for fileName to read
    *@return return 
    *@throws IOException for file reading
    */
   public HexagonalPrismList readFile(String fileNameIn) throws IOException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<HexagonalPrism> myList = new ArrayList<HexagonalPrism>();
      String hListName = "", label = "";
      double side = 0.0, height = 0.0;
      
      listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         side = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         HexagonalPrism h = new HexagonalPrism(label, side, height);
         myList.add(h);
      }
      HexagonalPrismList hpl = new HexagonalPrismList(listName, myList);
      
      return hpl;   
      
   }   
   /**
    *@param lIn label
    *@param sIn side
    *@param hIn height
    */       
   public void addHexagonalPrism(String lIn, double sIn, double hIn) {
      HexagonalPrism h = new HexagonalPrism(lIn, sIn, hIn);
      
      hexPrism.add(h);
   
   }
   /**
    *@param lIn label
    *@return return
    */
   public HexagonalPrism deleteHexagonalPrism(String lIn) {
      int index = -1;
      for (HexagonalPrism h : hexPrism) {
         String l = h.getLabel();
         boolean equals = l.equalsIgnoreCase(lIn);
         if (equals) {
            index = hexPrism.indexOf(h);
            hexPrism.remove(index);
            return h;
         }
      }
      return null;
   }
   /**
    *@param lIn label
    *@return return
    */
   public HexagonalPrism findHexagonalPrism(String lIn) {
      for (HexagonalPrism  h : hexPrism) {
         String l = h.getLabel();
         boolean equals = l.equalsIgnoreCase(lIn);
         if (equals) {
            return h; 
         }
      }
      return null;
   }   
      
   
   /**
    *@param lIn label
    *@param sIn side
    *@param hIn height
    *@return return
    */
   public boolean editHexagonalPrism(String lIn, double sIn, double hIn) {
      boolean result  = false;
      int index = -1;
      for (HexagonalPrism h : hexPrism) {
         String l = h.getLabel();
         boolean equals = l.equalsIgnoreCase(lIn);
         if (equals) {
            index = hexPrism.indexOf(h);
            break;
         }
      }
      if (index >= 0) {
         hexPrism.remove(index);
         HexagonalPrism h = new HexagonalPrism(lIn, sIn, hIn);         
         hexPrism.add(index, h);
         result = true;
      }
      return result;
   }                                                               
}
        