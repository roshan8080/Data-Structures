/**
   The Stock class holds data about a stock.
*/

public class Stock
{
   private String symbol;     // Trading symbol of stock
   private double sharePrice; // Current price per share

   /**
      Constructor
      @param sym The stock's trading symbol.
      @param price The stock's share price.
   */

   public Stock(String sym, double price)
   {
      symbol = sym;
      sharePrice = price;
   }
   
   /**
      getSymbol method
      @return The stock's trading sysmbol.
   */
   
   public String getSymbol()
   {
      return symbol;
   }
   
   /**
      getSharePrice method
      @return The stock's share price
   */
   
   public double getPrice()
   {
      return sharePrice;
   }

   /**
      toString method
      @return A string indicating the object's
              trading symbol and share price.
   */
   
   public String toString()
   {
      String str = String.format("Trading symbol: %5s   Share price: $%7.2f", symbol, sharePrice);
      return str;
   }

   /**
      The equals method compares two Stock objects.
      @param other A Stock object to compare to the
                     calling Stock object
      @return true if the trading symbols are equal
   
   @Override
   public boolean equals(Object other)
   {

   }
   */
}
