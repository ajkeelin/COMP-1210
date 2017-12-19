import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Reads the name of the input file and then
 * reads the list name and the HexPrism data.
 * Creates HexPrism objects, stores them in an
 * ArrayList, creates a HexPrismList object with
 * the list name and the HexPrism ArrayList, and
 * then prints the HexPrismList object then summary info.
 */
public class HexagonalPrismListApp {
   /**
    * @param args - is not used
    * @throws IOException from scanning input file.
    * @author Austin Keelin
    * @version 02/28/2016
    */
   public static void main(String[] args) throws IOException {
      ArrayList<HexagonalPrism> hexList = new ArrayList<HexagonalPrism>();
      String hexagonalPrismListName = "";
      String label = "";
      double side = 0;
      double height = 0;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
      
      hexagonalPrismListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         side = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         HexagonalPrism h = new HexagonalPrism(label, side, height);
         hexList.add(h);
      }
       
      HexagonalPrismList theHexList = new 
         HexagonalPrismList(hexagonalPrismListName, hexList);
       
      System.out.println(theHexList);
       
      System.out.println(theHexList.summaryInfo());
       
   }
}             