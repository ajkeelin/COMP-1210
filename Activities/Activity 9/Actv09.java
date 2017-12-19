public class Actv09 {
   public static void main(String[] args) {
      InventoryItem item = new InventoryItem("Oil change kit", 39.99);
      item.setTaxRate(0.05);
      
      ElectronicsItem eItem = new ElectronicsItem("Cordless Phone", 80.00, 1.8);
      
      OnlineArticle article = new OnlineArticle("Java News", 8.50);
      article.setWordCount(700);
      
      OnlineBook book = new OnlineBook("Java for Noobs", 13.37);
      book.setAuthor("L.G. Jones");
      
   }
   
   
}      
      