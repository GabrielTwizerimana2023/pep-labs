import java.util.ArrayList;
import java.util.Scanner;

/**
 * An array is a group of some predefined number of elements.
 * For instance, we could have an array of 10 ints or 10 Strings.
 *
 * Or, we could have an array of our own custom Objects, such as our own Bird class for a birdwatching
 * application. This would allow us to keep track of many birds and their own behavior.
 *
 * For the following problems, all of the syntax we need is in this documentation:
 * https://www.learnjavaonline.org/en/Arrays
 */
public class ArrayBasics {
    /**
     * @param arr the array we're getting data from.
     * @return the length of arr.
     */
    int val;
   

    public static void main(String [] args){
      ArrayBasics basic;
      basic=new ArrayBasics();
      Scanner sc=new Scanner(System.in);
      System.out.println("input");
       int value=sc.nextInt();
      int res=basic.getLengthOfArray(null);
      System.out.println(res);
      int res1=basic.getLengthOfArray(null);
      System.out.println(res1);
      int[] store;
      store=returnNewArraySizeN(value);
      System.out.println(store);
    }
    public int getLengthOfArray(int arr[]){
    int[] myArr={1,2,4,6,7};
    int size=myArr.length;
   return size;
    }
    

    /**
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to return.
     *          Indexes in arrays start counting from zero.
     * @return the element at index n of arr.
     */
    public int getNthElementOfArray(int[] arr, int n){
        ArrayList<Integer> number=new ArrayList<>();
        number.add(3);
        number.add(6);
        number.add(5);
        number.add(8);

        int searrchEle=5;
        for(int i=0;i<number.size();i++){
            System.out.println(number.get(i));
        if(searrchEle==number.get(i)){
            System.out.println(searrchEle);
       
        }
       
        }
        return searrchEle;
    
    }

    /**
     *
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to modify.
     *          Indexes in arrays start counting from zero.
     * @param val the value that we will assign to a spot in the array.
     * @return nothing. Because of pass-by-reference, any change to the array will be reflected across our java program.
     */
    public void setNthElementOfArray(int[] arr, int n, int val){
        
       for(int i=0;i<arr.length;i++){
        
            if(arr[n]==3){
                
                arr[i]=val=7;
                
            }
        }
        
    }

    /**
     * @param n the size of the array we wish to create
     * @return a new int array that can contain n elements.
     */
    public static int[] returnNewArraySizeN(int n){
       
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
             
                System.out.println("array was created! "+ arr[i]);
               }
               return arr;
        }
       
    }
        
        
            
            
        
    

