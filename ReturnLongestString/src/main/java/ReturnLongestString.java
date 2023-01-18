
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int l=arr[0].length(),len=0;
        String lon=null;
        for(int i=0;i<arr.length;i++){
          len=arr[i].length();
          if(len>l){
          l=len;
          lon=arr[i];
          }
        }
        return lon;
    }
}
