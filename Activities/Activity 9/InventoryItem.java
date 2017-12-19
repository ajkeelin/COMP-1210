/**
 */
public class InventoryItem {
   /**
    */
   
   //Variables
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   //Constructor
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   //Methods
   public String getName() {
      return name;
   }
   
   public double calculateCost() {
      double total = 0.0;
      total = price * (1 + taxRate);
      return total; 
   }
   
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   } 
   
   public String toString() {
      return name + ": $" + calculateCost();
   }             
   
}    