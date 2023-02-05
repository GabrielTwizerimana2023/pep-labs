import java.util.Collections;
import java.util.HashMap;

import com.azul.crs.runtime.utils.PackedDataEntriesMap.Entry;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
         char maxappearchar = ' ';
         for (int i = 0; i < str.length(); i++)
         {
              if ( map.containsKey(str.charAt(i)))
              {
                    map.put (str.charAt(i), map.get(str.charAt(i)) + 1 );
              }       
              else
              {
                map.put (str.charAt(i), 1);
              }    
              int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap    
              for (java.util.Map.Entry<Character, Integer> entry : map.entrySet())
              {  
                  if (entry.getValue()==maxValueInMap)
                  {
                      System.out.println("the max char is : " + entry.getKey() + "  and displayed  " +maxValueInMap+ "  times");     // Print the key with max value
                      maxappearchar = entry.getKey();
                  }
  
              }
              
      }
      return maxappearchar;
    }
}
