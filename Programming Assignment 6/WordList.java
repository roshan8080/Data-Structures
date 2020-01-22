/** WordList.java
  * CSCI 2073
  * Programming Assignment 2
  * @author: Roshan Rijal
  * Due Date: 10/06/2017
  * Class that stores collection of string objects by the use of an ArrayList.   
  */





//imports
import java.util.*;
import java.io.*;

public class WordList
{
   ArrayList<String> wordList;

   // A constructor to intialize an empty list of words.
   public WordList()
   {
      wordList = new ArrayList<String>(); 
   }
    
   /** A counstructor to initialize a list of words with an array containing strings.
       @ param array - An array of strings.
   */
  
   public WordList(String[] array)
   {
      wordList = new ArrayList<String>();
      for (int i=0;i<array.length;i++)
      {
         wordList.add(array[i]);
      }
   }
 
   /** Method to add the words in the file to the list.
       @ param filename  - Name of file whose contents is to be added to the list. 
       @ return - A boolean value to indicate whether a file is opened successfully or not.
   */
 
   public boolean readWords(String filename)   
   { 
      boolean choice = true;
      try
      {
         File infile = new File(filename);
         Scanner in = new Scanner(infile);
         while(in.hasNext())
         {
            String input = in.next();
            wordList.add(input);   
         }
      }
      catch(FileNotFoundException e)
      {
         choice = false;
      }
    
      return choice;
   }
   
  /**Method that counts and returns total number of words in the list. 
	  @return - total number of words stored in the list.
  */
  
   public int count()
   {
      int count = 0;
      for (String each:wordList)
      {
         count++;
      }
      return count;  
   }
   
   /** Method that returns the number of times certain word is stored in the list. It ignores case and punctuation
       symbols when comparing words.
       @ param target - the word which is to be checked.
       @ return - number of times the word is stored.
   */
  
   public int count(String target)
   {
      int count = 0;
     
      for (String each:wordList)
      {
         // Ignoring the puctuation symbol.
         String updated = each.replaceAll("[ ,!';:?.]+","");
         
         // Comparing old word with the new word by ignoring case.
         if ((updated.toLowerCase()).equals(target.toLowerCase()))
         {
            count++;
         }
      }
      return count;
   }
   
   /**Method that replaces all old word with a new word. 
      @param old -  word to be replaced.
      @param new1 - new word which replaces the old word
      @param ignorecase - boolean variable which tells if the match needs to be exact
                          while comparing the two strings. If false, the old word is to
                          be replaced with the new word only if they are exactly same.
                          If true, the operation is to be done even if they aren't in the same case.       
	   @return - Number of times old word is replaced by new word. 
	  */

   public int replace(String old, String new1, boolean ignoreCase)
   {
      int count = 0;
      for(int i=0; i<wordList.size();i++)
      {
         String getWordList = wordList.get(i);
       
      
         if(ignoreCase = false)
         {
            if (getWordList.equals(old))
            {
               wordList.set(i,new1);
               count++;
            }    
         }
         else if (ignoreCase = true)
         {
            Scanner in = new Scanner(getWordList);
            
            // Discarding anything that isn't a letter
            in.useDelimiter("[^A-Za-z]+");            
            
            while (in.hasNext())
            {
               String updated = in.next();
               if ((updated.toLowerCase()).equals(old.toLowerCase()))
               {
                  wordList.set(i,new1);
                  count++;
               }  
            }   
         }
      }
      return count; 
   }
   
   /** Method to display the contents of the list. 
       @param wordsPerLine - Number of words to be diplayed in a single line. 
       @return - Total number of lines displayed.
   */
  
   public int display(int wordsPerLine)
   {
      int noOfLines = 1;
      int count = 0;
          
      for(int i=0; i<wordList.size();i++)
      {     
         System.out.print(wordList.get(i) + " ");
         count++;
         if (!(count < wordsPerLine))
         {
            System.out.println();
            noOfLines++;
            count = 0;
         }
      }
      System.out.println();
      return noOfLines;
   }
   
   /**Method that returns the contents of the list. 
	   @return - contents of the list surrounded by [] bracket separating the individual words 
                by single spaces.
	*/
  
   public String toString()
   {
      String word = ""; 
   
      for(int i = 0; i<wordList.size()-1;i++){
         word += wordList.get(i) + " ";
      }
      word += wordList.get(wordList.size()-1);
      return ("[" + word + "]");
   }            
}