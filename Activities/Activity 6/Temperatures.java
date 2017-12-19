import java.util.ArrayList;
/**
 * 
 */
public class Temperatures {
   /**
    *
    */
   
   //Fields
   ArrayList<Integer> temperatures = new ArrayList<Integer>();
   int min = 0;
   int max = 0;
   
   //Constructor
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
   //Methods
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp < low) {
            low = temp;
         }
      }
      return low;
             
   }
   
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;         
   }
   
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }   
   
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }      
   
   }              