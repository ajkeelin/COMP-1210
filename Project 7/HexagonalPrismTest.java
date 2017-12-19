import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * Tests the methods used in 
 * the HexagonalPrism class. 
 */


public class HexagonalPrismTest {


   /** Fixture initialization (common initialization
    *  for all tests).
    * @author Austin Keelin 
    * @version 3/31/2016
    */
   @Before public void setUp() {
   }
   
   /**
    * Tests the setLabel method when true.
    */
   @Test public void setLabelTrueTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      Assert.assertEquals(true, h.setLabel("test1"));
   }
   
   /**
    * Tests the setLabel method when false.
    */
   @Test public void setLabelFalseTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      Assert.assertEquals(false, h.setLabel(null));
   }       
          
   
   /**
    * Tests method to find perimeter of prism.
    */
   @Test public void perimeterTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10); 
      Assert.assertEquals(30.0, h.basePerimeter(), 0.1);
   }
   
   /**
    * Tests method to find base area of prism.
    */
   @Test public void baseAreaTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      Assert.assertEquals(64.952, h.baseArea(), 0.001);
   }
   
   /**
    * Tests method to find surface area of prism.
    */
   @Test public void surfaceAreaTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);      
      Assert.assertEquals(429.904, h.surfaceArea(), 0.001);
   }
   
   /**
    * Tests method to find volume of prism.
    */
   @Test public void volumeTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10); 
      Assert.assertEquals(649.519, h.volume(), 0.001);
   }
   
   /**
    * Tests toString method for Hex Prism.
    */
   @Test public void toStringTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      Assert.assertEquals("\"test\" is a hexagonal prism with side = "
         + "5.0 units and height = 10.0 units," + "\n" + "which has base "
         + "perimeter = 30.0 units, base area = 64.952 square "
         + "units," + "\n" +  "surface area = 429.904 square units, and volume "
         + "= 649.519 cubic units.", h.toString()); 
   }
   
   /**
    * Tests method which resets prism counter.
    */
   @Test public void resetCountTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      h.resetCount();
      Assert.assertEquals(0, h.getCount());
   } 
   
   /**
    * Tests method which determines 2 prisms to be equal.
    */
   @Test public void equalsTrueTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test", 5, 10);
      Assert.assertEquals(true, h.equals(h2));
   }
   
   /**
    * Tests method which determines 2 prism to not be equal.
    */
   @Test public void equalsFalseTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      HexagonalPrism h2 = new HexagonalPrism("test2", 10, 15);
      Assert.assertEquals(false, h.equals(h2)); 
   }
   
   /**
    * Tests hashCode which always returns 0.
    */
   @Test public void hashCodeTest() {
      HexagonalPrism h = new HexagonalPrism("test", 5, 10);
      Assert.assertEquals(0, h.hashCode());
   }                          
  
}
