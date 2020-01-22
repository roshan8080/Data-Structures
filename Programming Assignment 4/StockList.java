import java.util.*;

/**
   This program stores Stock objects in a List and then
   displays the contents of the List.
*/

public class StockList
{
   public static void main(String[] args)
   {
      List<Stock> stocks = new ArrayList<Stock>();
      
      stocks.add(new Stock("ATT", 190.25));
      stocks.add(new Stock("IBM", 65.75));
      stocks.add(new Stock("YAH", 220.50));
      stocks.add(new Stock("ALP", 800.25));
	  stocks.add(new Stock("AMD", 12.53));
      
      // Display the elements in the List.
      System.out.println("Here is my portfolio:");
      for (Stock s : stocks)
         System.out.println(s);
	
	  System.out.println("\nTotal price: $" + totalPrice(stocks));
	  showPrice(stocks, "HPE");
	  showPrice(stocks, "YAH");
   }

/**	
	Adds the share prices of all stocks in the portfolio.
	@param list a list containing a number of Stock objects
	@return the sum of the share price values of all stocks
*/
   public static double totalPrice(List<Stock> list)
   {
		return 0;
   }

/**	
	Searches for the stock corresponding to the trading symbol
	given as argument.  If found, stock symbol and price are
	displayed.  Otherwise, a message reports the stock is not
	on the list.
	@param list a list containing a number of Stock objects
	@param symbol the trading symbol of the Stock to be displayed
*/   
   public static void showPrice(List<Stock> list, String symbol)
   {
		Stock temp = new Stock(symbol, 0.00);  // create a temp object
		int location = list.indexOf(temp);
		if (location > -1)
		{
			Stock result = list.get(location);
			System.out.printf("\nStock %s has a share price of $%7.2f", 
			                   symbol, result.getPrice()); 
        }
		else
			System.out.println("\nStock " + symbol + " is not on the list");
   }
}
