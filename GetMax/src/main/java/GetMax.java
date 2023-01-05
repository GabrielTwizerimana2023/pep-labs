public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public static void main(String [] args){
        GetMax find=new GetMax();
    System.out.println("Maximum value is: "+find.max(null));
    System.out.println("Maximum value is: "+find.max1(null));
    System.out.println("Maximum value is: "+find.max2(null));
    }
    public int max(int[] arr){
        int[] maxarr={0,1,2,3,4};
        
        int max=maxarr[0];
        for(int i=0; i<maxarr.length;i++){
            
                if(maxarr[i]>max){
            
                    max=maxarr[i];
                }
                
                System.out.println(maxarr[i]);
               
            }
            
        return max;
    }
    public int max1(int[] arr){
     
        int[] maxarr1={9,8,10,3,4};
        
        int max=0;
        for(int i=0; i<maxarr1.length;i++){
            
                if(maxarr1[i]>max){
            
                    max=maxarr1[i];
                }
                
                System.out.println(maxarr1[i]);
               
            }
    return max;
}
public int max2(int[] arr){
     
    int[] maxarr1={-100, -383, -45, -901, -76};
    
    int max=maxarr1[0];
    for(int i=0; i<maxarr1.length;i++){
        
            if(maxarr1[i]>max){
        
                max=maxarr1[i];
            }
            
            System.out.println(maxarr1[i]);
           
        }
return max;
}
}
