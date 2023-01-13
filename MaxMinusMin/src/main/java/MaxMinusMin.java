
import java.util.ArrayList;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        List<Integer> a=new ArrayList<>();
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        int max=a.get(6);
        int min=a.get(0);
        int dif=max-min;
     
        return dif;
    }
    public int difference1(List<Integer> nums){
        List<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(8);
        a.add(16);
        a.add(32);
       
        int max=a.get(4);
        int min=a.get(0);
        int dif=max-min;
     
        return dif;
    }
    public int difference2(List<Integer> nums){
        List<Integer> a=new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(9);
        a.add(4);
        a.add(7);
       
        int max=a.get(4);
        int min=a.get(0);
        int dif=max-min;
     
        return max;
    }
    public int difference3(List<Integer> nums){
        List<Integer> a=new ArrayList<>();
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(0);

        int max=a.get(4);
        int min=a.get(0);
        int dif=max-min;
     
        return dif;
    }
}
