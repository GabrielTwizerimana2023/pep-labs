public class ReturnArrayContents {
    /**
     * Return a string with an array's contents, formatted with spaces.
     * For example, given the array {3,4,5,6} the string should look like this:
     * 3 4 5 6
     *
     * Spaces at the end of the string will not affect test results.
     *
     * You will need to use a for loop here. Again, the structure of that loop would look similar to a previous problem.
     * However, this challenge introduces the idea that a for loop can manipulate a variable that exists outside of the
     * for loop, which looks something like this:
     *
     * String str;
     * for(int i = 0; i < nums.length; i++){
     *      //do something to str here
     * }
     * return str;
     *
     * Where i represents a variable that is used to visit every number between 0 and the length of nums. Inside of the
     * for loop, you will need to write code that appends elements from nums to str, one by one, in the format described
     * above.
     *
     * After completing the problem, I recommend using your IDE's debugger to walk through the loop
     * goes through to help you visualize the values changing, as understanding this process is critical for all future
     * coding challenges.
     *
     * @param nums the array to be manipulated.
     * @return a string representation of all values of nums, with the values separated by spaces.
     */
    public static void main(String[] args){
    ReturnArrayContents num=new ReturnArrayContents();
    String d=num.arrayToString(null);
    String e=num.arrayStringTest2(null);
    System.out.println(d);
    System.out.println(e);
    }
    public String arrayToString(int[] nums){
    
        String buildingstring="";
       
       
        int[] arr1={1,2,3,4,5};
        
        
        for(int i=0;i<arr1.length;i++){
         
              buildingstring=buildingstring+arr1[i]+" ";
        }
            
    
        return buildingstring;
    }
    
    public String arrayStringTest2(int[] nums){
    
        String buildingstring="";
       
       
        int[] arr2={9,8,7};
        
        
        for(int j=0;j<arr2.length;j++){
           
            buildingstring=buildingstring+arr2[j]+" ";

     }
        
        return buildingstring;
    }
}

