
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        {
            if(findFirstVowel(in) == 1)
               return in + "ay";
            else
               return "ERROR!";
         }
    
        
    }
    int findFirstVowel(String sWord)
   //precondition: sWord is a valid String of length greater than 0.
   //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
   {
      return -1;
   }
}
