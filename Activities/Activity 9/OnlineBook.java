public class OnlineBook extends OnlineTextItem {

   //Variables
   protected String author;
   
   //Constructor
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   //Methods
   public String toString() {
      return name + " - " + author + ": $" + super.calculateCost();
   }
   
   public void setAuthor(String authorIn) {
      author = authorIn;
   }   
   
}      