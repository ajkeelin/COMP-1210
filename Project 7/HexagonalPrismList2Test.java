import org.junit.Assert;
//import static org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the methods used in the
 * HexagonalPrismList2 class.
 */


public class HexagonalPrismList2Test {


   /** Fixture initialization (common initialization
    *  for all tests).
    *
    * @author Austin Keelin
    * @version 3/31/2016 
    */
   @Before public void setUp() {      
   }
   
   /**
    * Tests method to return name of a
    * HexagonalPrismList2 object.
    */
   @Test public void getNameTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals("test", hList.getName());
   }       
   
   /**
    * Tests method to return number of prisms.
    */      
   @Test public void numberTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(3, hList.numberOfHexagonalPrisms());
   } 
   
   /**
    * Tests method to determine total surface area
    * of all prisms in HexagonalPrismList2 object.
    */
   @Test public void totalSurfaceAreaTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(4818.653, hList.totalSurfaceArea(), 0.001);
   }
   
   /**
    * Tests method to determine total volume
    * of all prisms in HexagonalPrismList2 object.
    */
   @Test public void totalVolumeTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(16237.976, hList.totalVolume(), 0.001);
   }
   
   /**
    * Tests method to determine total base perimeter
    * of all prisms in HexagonalPrismList2 object.
    */
   @Test public void totalBasePerimeterTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(180.0, hList.totalBasePerimeter(), 0.1);
   }
   
   /**
    * Tests method to determine total base area
    * of all prisms in HexagonalPrismList2 object.
    */
   @Test public void totalBaseAreaTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(909.327, hList.totalBaseArea(), 0.001);
   }
   
   /**
    * Tests method to determine average surface area
    * of all prisms in HexagonalPrismList2 object.
    */
   @Test public void averageSurfaceAreaTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(1606.218, hList.averageSurfaceArea(), 0.001);
   }
   
   /**
    * Tests method to determine average volume
    * of all prisms in HexagonalPrismList2 object.
    */
   @Test public void averageVolumeTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(5412.659, hList.averageVolume(), 0.001);
   }
   
   /**
    * Tests the method to print toString info.
    */
   @Test public void toStringTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);      
      HexagonalPrism[] list = {h, h2};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 2);
      Assert.assertEquals("\n" + "test\n" + "\n\"test\" is a hexagonal "
         + "prism with side = 5.0 units and height = 10.0 units,\n"
         + "which has base perimeter = 30.0 units, base area = 64.952 "
         + "square units,\n" + "surface area = 429.904 square units, and "
         + "volume = 649.519 cubic units.\n" + "\n\"test2\" is a hexagonal "
         + "prism with side = 10.0 units and height = 15.0 units,\n"
         + "which has base perimeter = 60.0 units, base area = 259.808 "
         + "square units,\n" + "surface area = 1,419.615 square units, and "
         + "volume = 3,897.114 cubic units.\n", hList.toString());
   } 
   
   /**
    * Tests the method which prints summary
    * info the HexagonalPrismList2 object.
    */
   @Test public void summaryInfoTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);      
      HexagonalPrism[] list = {h};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 1);
      Assert.assertEquals("\n----- test Summary -----"
         + "\nNumber of Hexagonal Prisms: 1"
         + "\nTotal Surface Area: 429.904"
         + "\nTotal Volume: 649.519"
         + "\nTotal Base Perimeter: 30.0"
         + "\nTotal Base Area: 64.952"
         + "\nAverage Surface Area: 429.904"
         + "\nAverage Volume: 649.519", hList.summaryInfo());
   }
   
   /**
    * Tests when deleteHexagonalPrism deletes
    * an actual object.
    */
   @Test public void deletePrismTrue() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(h, hList.deleteHexagonalPrism("test"));
   }              
   
   /**
    * Tests deleteHexagonalPrism for when it
    * deletes an object that doesn't exits.
    */
   @Test public void deletePrismFalse() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);      
      HexagonalPrism[] list = {h};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 1); 
      Assert.assertEquals(null, hList.deleteHexagonalPrism("wide"));
   }
   
   /**
    * Tests findHexagonalPrism when it finds
    * the prism.
    */
   @Test public void findPrismTrue() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(h, hList.findHexagonalPrism("test"));
   } 
   
   /**
    * Tests find for when the prism its
    * searching for doesn't exist.
    */
   @Test public void findPrismFalse() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(null, hList.findHexagonalPrism("test4"));
   }
   
   /**
    * Tests edit for when it sucessfully edits
    * a prism that already existed.
    */
   @Test public void editHexagonalPrismTrue() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(true, hList.editHexagonalPrism("test", 12, 17));
   }
   
   /**
    * Tests edit for when it tries to edit
    * a prism that doesn't exist.
    */
   @Test public void editHexagonalPrismFalse() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h, h2, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals(false, hList.editHexagonalPrism("test4", 12, 17));
   }                         
   
   /**
    * Tests method to find smallest side of all
    * prisms in HexagonalPrismList2 object.
    */
   @Test public void smallestSideTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h2, h, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals("\"test\" is a hexagonal prism with side = "
         + "5.0 units and height = 10.0 units," + "\n" + "which has base "
         + "perimeter = 30.0 units, base area = 64.952 square "
         + "units," + "\n" +  "surface area = 429.904 square units, and volume "
         + "= 649.519 cubic units.", 
         hList.findHexagonalPrismWithSmallestSide());
   }                         
      
   /**
    * Tests method to find largest side of all
    * prisms in HexagonalPrismList2 object.
    */
   @Test public void largestSideTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h2, h, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals("\"test3\" is a hexagonal prism with side = 15.0 "
               + "units and height = 20.0 units," + "\n" + "which has base "
               + "perimeter = 90.0 units, base area = 584.567 square units,"
               + "\n" + "surface area = 2,969.134 square units, and "
               + "volume = 11,691.343 cubic units.",
               hList.findHexagonalPrismWithLargestSide());   
   } 
   
   /**
    * Tests method to find smallest height of all
    * prisms in HexagonalPrismList2 object.
    */
   @Test public void smallestHeightTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h2, h, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals("\"test\" is a hexagonal prism with side = "
         + "5.0 units and height = 10.0 units," + "\n" + "which has base "
         + "perimeter = 30.0 units, base area = 64.952 square "
         + "units," + "\n" +  "surface area = 429.904 square units, and volume "
         + "= 649.519 cubic units.", 
         hList.findHexagonalPrismWithSmallestHeight());
   }
   
   /**
    * Tests method to find largest height of all
    * prisms in HexagonalPrismList2 object.
    */
   @Test public void largestHeightTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      HexagonalPrism h3 = new HexagonalPrism("test3", 15, 20);
      HexagonalPrism[] list = {h2, h, h3};
      HexagonalPrismList2 hList = new HexagonalPrismList2("test", list, 3);
      Assert.assertEquals("\"test3\" is a hexagonal prism with side = 15.0 "
               + "units and height = 20.0 units," + "\n" + "which has base "
               + "perimeter = 90.0 units, base area = 584.567 square units,"
               + "\n" + "surface area = 2,969.134 square units, and "
               + "volume = 11,691.343 cubic units.",
               hList.findHexagonalPrismWithLargestHeight());   
   }                   
                                
}
