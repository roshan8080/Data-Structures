/** Browser.java
  * CSCI 2073
  * Programming Assignment 3
  * @author: Roshan Rijal
  * Due Date: 11/03/2017
  * Class that simulate the navigational tools of an internet browser.   
  */



// Imports
import java.util.*;
import java.net.URL; 

public class Browser
{  
   //Declaring four stacks
   StackInt<String> s1;    // for storing url
   StackInt<String> s2;    // temporary stack for storing stack s1 elements 
   StackInt<String> s3;    // for history
   StackInt<String> s4;    // temporary stack for storing stack s4 elements
   
   // A no-argument constructor to intialize stack with url "http://www.ulm.edu".
   public Browser()
   {
      // Creating four stacks
      s1 = new LinkedStack<>();
      s2 = new LinkedStack<>();
      s3 = new LinkedStack<>();
      s4 = new LinkedStack<>();
            
      s1.push("http://www.ulm.edu"); 
      s3.push("http://www.ulm.edu");
   }
   
    /** A counstructor to initialize browser with the given page. In case the page 
        couldn't be loaded, the browser should be initialized with "ERROR: CANNOT FIND <url>". 
       @ param url - The page to be loaded.
   */ 
   public Browser(String url)
   {
      s1 = new LinkedStack<>();
      s2 = new LinkedStack<>();
      s3 = new LinkedStack<>();
      s4 = new LinkedStack<>();
   
      try 
      {  
         URL webpage = new URL(url);      // Creating object of URL class 
         if (webpage.getContent() != null)  // Checking if the page is valid
         {
            s1.push(url);
            s3.push(url);
         } 
         else
         {
            s2.push("ERROR: CANNOT FIND <url>");   
         }   
      }
      catch (Exception e)
      {   
      }
   }
   
   /** Method to load the webpage with the given URL parameter.
       @ param url  - The page to be loaded. 
       @ return - A boolean value to indicate if the page was loaded successfully.
                  If it doesn't, the page should be "ERROR: CANNOT FIND <url".
   */
   public boolean load(String url)
   {  
      boolean flag = false;
      try 
      {
         URL webpage = new URL(url);
         if (webpage.getContent() != null)
         {
            s1.push(url);
            s3.push(url);
            flag = true;   
         }
      }
      catch (Exception e) 
      {
         s1.push("ERROR: CANNOT FIND " + url);
         flag = false;
      } 
      return flag;  
   }
   
   /**Method that returns the url for the current page. 
	  @return - The current page.
  */
   public String currentPage()
   {
      String currentPage = s1.peek();
      return currentPage;
   }

   /**Method that indicates if the browsing history has a previous page. 
	  @return - A boolean value to indicate if there is previous page in browsing history.
  */
   public boolean canGoBack()
   {
      boolean flag = true;
      s2.push(s1.pop());
      
      if(!s1.empty())
      {
         flag = true;      
      }
      else
      {
         flag = false;
      }
      s1.push(s2.pop());
      return flag;   
   }
   
   /**Method that indicates if browsing history has a next page. 
	  @return - A boolean value to indicate if there is next page in browsing history.
  */
  
   public boolean canGoForward()
   {
      if (!s2.empty())
      {
         return true;
      }       
      else
      {
         return false;
      }
   }
   
   /**Method that loads and returns the previous page in the browsing history.  
	  @return - returns previous page.If there is no previous page,
      it returns current page.
  */
   public String goBack()
   {
      String previousPage = "";
      s2.push(s1.pop());
      if (!s1.empty())
      {
         previousPage = s1.peek();
      }
      else
      {
         previousPage = s2.peek();
      }
      return previousPage;
   }
   
   /**Method that loads and returns the next page in the browsing history.  
	  @return - returns next page.If there is no next page,
      it returns current page.
  */
   public String goForward()
   {
      String nextPage = "";
      if (!s2.empty())
      {
         nextPage = s2.peek();
      }
      else
      {
         nextPage = s1.peek();
      }
      s1.push(s2.pop());
      return nextPage;   
   }
   
   /**Method that returns a list of pages loaded with the recent one listed first.  
	  @return - returns browsing history.
  */
   public String history()
   {  String concatenation = "";
   
      while (!s3.empty())
      {
         concatenation = concatenation + "\n" + s3.peek();
         s4.push(s3.pop());
      }
      while (!s4.empty())
      {
         s3.push(s4.pop());
      }         
      System.out.print("HISTORY:");
      return concatenation + "\n";    
   }
}

