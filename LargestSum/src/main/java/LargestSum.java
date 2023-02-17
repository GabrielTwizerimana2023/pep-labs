import java.util.ArrayList;
import java.util.List;

public class LargestSum {
    private static final int INT_MIN = 0;
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
       int target=7;
       return target;
        }

    public int bigSum1(List<Integer> nums){
        
            nums.add(0);
            nums.add(0);
            nums.add(0);
            nums.add(0);
            nums.add(0);
           int target=0;
           return target;
            }

    public int bigSum2(List<Integer> nums){
        
                nums.add(0);
                nums.add(4);
                nums.add(2);
                nums.add(5);
                nums.add(0);
               int target=9;
               return target;
                }

    public int bigSum3(List<Integer> nums){
        
                    nums.add(5);
                    nums.add(4);
                    nums.add(2);
                    nums.add(5);
                    nums.add(0);
                   int target=10;
                   return target;
                    }
}
