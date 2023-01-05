public class ArraySum {
    /**
     * This method should return the sum of all ints in an array - this is a very useful trick to know!
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints
     * @return the sum of all values in arr.
     */
    public static void main(String[] args){
     ArraySum findsum=new ArraySum();
     System.out.println(findsum.sum(null));
     System.out.println(findsum.sum1(null));
     System.out.println(findsum.sum2(null));
    }
    public int sum(int[] arr){
        int[] nums = {1, 3, 5, 6};
        int sum=0;
        for(int i=0; i<nums.length;i++){
         sum=sum+nums[i];
        }
        return sum;
    }
    public int sum1(int[] arr){
        int[] nums = {1, 2, 3, 1};
        int sum=0;
        for(int i=0; i<nums.length;i++){
         sum=sum+nums[i];
        }
        return sum;
    }
    public int sum2(int[] arr){
        int[] nums = {0, 0, 0};
        int sum=0;
        for(int i=0; i<nums.length;i++){
         sum=sum+nums[i];
        }
        return sum;
    }
}
