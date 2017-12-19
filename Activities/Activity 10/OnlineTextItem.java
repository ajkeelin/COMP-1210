public abstract class OnlineTextItem extends InventoryItem {
      
   //Variables
   
   //Constructor
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   public double calculateCost() {
      return price;
   }   
   
}         