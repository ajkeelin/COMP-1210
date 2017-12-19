import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Menu app which prints a list of options
 * which can be indvidually selected by
 * the user. First action should be to read
 * file but program will still work otherwise.
 * The app prints the HexPrismList, prints the
 * summary, add an object to the list, delete an
 * object from the list, find an object in the list,
 * and edit an object in the list
 */
public class HexagonalPrismListMenuApp {
   /**
    *@param args - is not used.
    *@throws IOException from scanning input file. 
    *@author Austin Keelin
    *@version 3/06/2016
    */
   public static void main(String[] args) throws IOException {
      String hListName = "*** no list name assigned ***";
      ArrayList<HexagonalPrism> myList = new ArrayList<HexagonalPrism>();
      HexagonalPrismList myHList = new HexagonalPrismList(hListName, myList);
      String fileName = "no file name"; 
      
      String label = "";
      double side, height;
      String code = "";
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Hexagonal Prism List System Menu\n"
                     + "R - Read File and Create Hexagonal Prism List\n"
                     + "P - Print Hexagonal Prism List\n"
                     + "S - Print Summary\n"
                     + "A - Add Hexagonal Prism\n"
                     + "D - Delete Hexagonal Prism\n"
                     + "F - Find Hexagonal Prism\n"
                     + "E - Edit Hexagonal Prism\n"
                     + "Q - Quit");
                     
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]:");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R':
               System.out.print("\tFile Name: ");
               fileName = scan.nextLine();
               myHList = myHList.readFile(fileName);
               System.out.println("\tFile read in and Hexagonal "
                              + "Prism List created\n");
               break;
            
            case 'P':
               System.out.println(myHList);
               break;
            
            case 'S':
               System.out.println(myHList.summaryInfo() + "\n");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               System.out.print("\tSide: ");
               side = Double.parseDouble(scan.nextLine());
               
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               
               System.out.println("\t*** Hexagonal Prism added ***\n");
               myHList.addHexagonalPrism(label, side, height);
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myHList.deleteHexagonalPrism(label) == null) {
                  System.out.println("\t\"" + label + "\"" 
                                 + " not found\n");
               }   
               else {
                  System.out.println("\t\"" + label + "\"" 
                                 + " deleted\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myHList.findHexagonalPrism(label) == null) {
                  System.out.println("\t\"" + label + "\""
                                 + " not found\n");
               }                  
               else {
                  System.out.println(myHList.findHexagonalPrism(label));
                  System.out.print("\n");
               }   
               break;  
               
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               System.out.print("\tSide: ");
               side = Double.parseDouble(scan.nextLine());
               
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               
               if (myHList.editHexagonalPrism(label, side, height)) {
                  System.out.println("\t\"" + label + "\"" 
                                 + " successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\"" 
                                 + " not found\n");
               }
               break;
               
            case 'Q':
               break;                  
            
            default:
               //loop again
         }
          
      } while (!code.equalsIgnoreCase("Q"));

   }
}