package Strings;

/**
 * Implements the method which returns letters that only appear once in a string
 * @author chitsimrangill
 *
 */
public class Strings 
{
	/**
	 * Returns the letters that appears once
	 * @param str - Strings whose unique letters are needed to printed
	 * @return - unique letters of the string that was given in parameter
	 */
	public static String uniqueLetters(String str)
	{
	     String result = "";
	     int count = 0;
	     String foundLetters[] = new String[str.length()];
	     
	     // finds unique letters
	     for (int i = 0; i<str.length(); i++)
	     {
	    	 	if(str.indexOf(str.substring(i,i+1)) == str.lastIndexOf(str.substring(i,i+1)))
	    	 		{
	    	 			foundLetters[count] = str.substring(i,i+1); // adds the letter to the array of unique letters
	    	 			count++;
	    			}
	     }
	     
	     // adds the found letters to the final result string
	     for(int j=0; j<foundLetters.length;j++)
	     {
	    	 	if(foundLetters[j]!=null)
	    	 	{
	    	 		result += foundLetters[j]; 
	    	 	}
	     }
	     
	     return result;
	}
}