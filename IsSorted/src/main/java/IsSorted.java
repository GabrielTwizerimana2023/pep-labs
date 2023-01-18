import static org.junit.Assert.assertTrue;

public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        /*int[] array={1,2,4,3};
        int temp=0;
        for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
        }
        for(int i=0;i<array.length;i++){
         for(int j=i+1;j<array.length;j++){
           if(array[i]>array[j]){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            return true;
           }
         }
        }
      
        return false;
    }*/
   if(arr==null || arr.length<1){
      return true;
   }
   for(int i=0;i<arr.length-1;i++){
    if(arr[i]>arr[i+1]){
    return false;
    }
   }
   return true;
}
}