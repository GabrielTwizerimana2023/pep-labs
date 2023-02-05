
public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){
    int size=0;
    for(int i=0;i<(size-1);i++){
     for(int j=(i+1);j<size;j++){
      if(arr[i]+arr[j]==target){
      return false;
      }
     }   
    }
     return true;  
    }
    public boolean check1(int[] arr, int target){
        int size=0;
        for(int i=0;i<(size-1);i++){
         for(int j=(i+1);j<size;j++){
          if(arr[i]+arr[j]==target){
          return true;
          }
         }   
        }
         return false;  
        }
        
}
