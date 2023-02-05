import java.util.StringTokenizer;

public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        //in="apple banana pear melon";
        if(in==null && in.isEmpty()){
        return 0;
        }
        
        StringTokenizer str=new StringTokenizer(in);
        return str.countTokens();
    }
  
}
