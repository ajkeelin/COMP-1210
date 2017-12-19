import java.util.Arrays;
public class ItemsList {
   
   //Variables
   private InventoryItem[] inventory;
   private int count;
   
   //Constructor
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }   
   
   //Methods
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;   
   }
   
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;            
   }
   
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      
      return output;
   }      
   
}   