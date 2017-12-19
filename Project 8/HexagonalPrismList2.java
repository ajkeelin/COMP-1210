import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.IOException;
import java.io.File;
/**
 * Creates class that stores the list name
 * and an Array of HexPrism objects.
 * Includes methods that return the name, the
 * number of HexPrism objects. Return the 
 * total surface area, volume, base perimeter,
 * base area, and average surface area, and
 * volume. 
 * For project 08 added different methods which
 * returns the Array, reads the file and creates
 * a list, adds an object to the list, deletes an
 * object from the list, finds an object in the
 * list, and edits an object in the list.
 * 
 */
public class HexagonalPrismList2 {
   /**
    * @author Austin Keelin
    * @version 03/19/2016
    */
    
   // Fields
   private String listName;
   private HexagonalPrism[] list = new HexagonalPrism[100];
   private int numberOfPrisms;
   
   /**
    * @param listNameIn listName
    * @param listIn list
    * @param numberOfPrismsIn numberOfPrisms
    */
   // Constructor
   public HexagonalPrismList2(String listNameIn, 
      HexagonalPrism[] listIn, int numberOfPrismsIn) 
   {
      listName = listNameIn;
      list = listIn;
      numberOfPrisms = numberOfPrismsIn;
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
      return numberOfPrisms;  
   }
   /**
    *@return return
    */ 
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < numberOfPrisms) {
         total += list[index].surfaceArea(); 
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
      while (index < numberOfPrisms) {
         total += list[index].volume(); 
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
      while (index < numberOfPrisms) {
         total += list[index].basePerimeter(); 
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
      while (index < numberOfPrisms) {
         total += list[index].baseArea(); 
         index++;
      } 
      return total;
   }
   /**
    *@return return
    */
   public double averageSurfaceArea() {
      double total = 0.0;
      int index = 0;
      if (numberOfPrisms == 0) {
         return 0.0;
      }
      else {   
         while (index < numberOfPrisms) {
            total += list[index].surfaceArea(); 
            index++;
         } 
         total = total / numberOfPrisms;
         return total;
      }   
   }
   /**
    *@return return
    */
   public double averageVolume() {
      double total = 0;
      int index = 0;
      if (numberOfPrisms == 0) {
         return 0.0;
      }
      else {   
         while (index < numberOfPrisms) {
            total += list[index].volume(); 
            index++;
         } 
         total = total / numberOfPrisms;
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
      while (index < numberOfPrisms) {
         result += "\n" + list[index] + "\n";
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
   public HexagonalPrism[] getList() {
      return list;
   }
   /**
    *@param fileNameIn for fileName to read
    *@return return 
    *@throws IOException for file reading
    */
   public HexagonalPrismList2 readFile(String fileNameIn) throws IOException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      HexagonalPrism[] myList = new HexagonalPrism[100];
      String hListName = "", label = "";
      numberOfPrisms = 0;
      double side = 0.0, height = 0.0;
      
      listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         side = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         HexagonalPrism h = new HexagonalPrism(label, side, height);
         myList[numberOfPrisms] = h;
         numberOfPrisms++;
      }
      HexagonalPrismList2 hpl = new HexagonalPrismList2(
                                 listName, myList, numberOfPrisms);
      
      return hpl;   
      
   }   
   /**
    *@param lIn label
    *@param sIn side
    *@param hIn height
    */       
   public void addHexagonalPrism(String lIn, double sIn, double hIn) {
      HexagonalPrism h = new HexagonalPrism(lIn, sIn, hIn);
      list[numberOfPrisms] = h;
      numberOfPrisms++;
   
   }
   /**
    *@param lIn label
    *@return return
    */
   public HexagonalPrism deleteHexagonalPrism(String lIn) {
      int index = -1;
      for (int i = 0; i < numberOfPrisms; i++) {
         String l = list[i].getLabel();
         boolean equals = l.equalsIgnoreCase(lIn);
         if (equals) {
         
            for (int j = i; j < numberOfPrisms - 1; j++) {
               list[j] = list[j + 1];
            }
            list[numberOfPrisms - 1] = null;
            numberOfPrisms--;
            return list[i];
         
         }  
      
      }
      return null;
   }      
   
   /**
    *@param lIn label
    *@return return
    */
   public HexagonalPrism findHexagonalPrism(String lIn) {
      int index = -1;
      for (int i = 0; i < numberOfPrisms; i++) {
         String l = list[i].getLabel();
         boolean equals = l.equalsIgnoreCase(lIn);
         if (equals) {
            return list[i];
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
      for (int i = 0; i < numberOfPrisms; i++) {
         String l = list[i].getLabel();
         boolean equals = l.equalsIgnoreCase(lIn);
         if (equals) {
            list[i].setSide(sIn);
            list[i].setHeight(hIn);
            result = true;
         }
      }      
         
      return result;
   }                                                               
}
        