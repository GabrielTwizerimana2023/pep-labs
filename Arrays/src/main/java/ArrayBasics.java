import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javafx.css.Size;

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
      Scanner va=new Scanner(System.in);
    //int[] arr=new int[3];
      basic.getLengthOfArray(null);
      System.out.println(basic.getLengthOfArray(null));
      basic.getLengthOfArray1(null);
      System.out.println(basic.getLengthOfArray1(null));
      basic.getLengthOfArray1(null);
      System.out.println(basic.getLengthOfArray1(null));
      basic.getNthElementOfArray(null, 0);
      System.out.println(basic.getNthElementOfArray(null, 0));
      basic.getNthElementOfArray1(null, 0);
      System.out.println(basic.getNthElementOfArray1(null, 0));
      basic.getNthElementOfArray2(null, 0);
      System.out.println(basic.getNthElementOfArray2(null, 0));
      setNthElementOfArray(null, 0, 0);
      setNthElementOfArray1(null, 0, 0);
      
      /*System.out.println("Enter Array elements");
      for(int i=0;i<3;i++){
      arr[i]=va.nextInt();

      System.out.println("Array created!: "+arr[i]);
     
      }*/
      basic.returnNewArraySizeN(5);
      System.out.println(basic.returnNewArraySizeN(5));
      basic.returnNewArraySizeN1(2);
      System.out.println(basic.returnNewArraySizeN1(2));
    }
    public int getLengthOfArray(int arr[]){
    int[] myArr={11,12,13,14,15};
    for(int i=0;i<5;i++){
        
    }
    
    return myArr.length;
    }
    public int getLengthOfArray1(int arr[]){
        int[] myArr={8,4,7};
        for(int i=0;i<3;i++){
            
        }
        
        return myArr.length;
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
        number.add(7);
        number.add(8);

        int searrchEle=7;
        for(int i=0;i<number.size();i++){
            
        }
        return searrchEle;
    
    }
    public int getNthElementOfArray1(int[] arr, int n){
        ArrayList<Integer> number=new ArrayList<>();
        number.add(5);
        number.add(3);
        number.add(9);
        number.add(1);
        number.add(0);

        int searrchEle=5;
        for(int i=0;i<number.size();i++){
            
        }
        return searrchEle;
    
    }
    public int getNthElementOfArray2(int[] arr, int n){
        ArrayList<Integer> number=new ArrayList<>();
        number.add(6);
        number.add(4);
        number.add(8);
       

        int searrchEle=8;
        for(int i=0;i<number.size();i++){
            
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
    public static void setNthElementOfArray(int[] arr, int n, int val){
        int[] replace={9,3,5,3,6};

       for(int i=0;i<replace.length;i++){
        
            if(replace[i]==5){
                
                replace[i]=7;
                System.out.println(replace[i]);
            }
            
        }
        
    }
    public static void setNthElementOfArray1(int[] arr, int n, int val){
        int[] replace={9,3,4};

       for(int i=0;i<replace.length;i++){
        
            if(replace[i]==9){
                
                replace[i]=2;
                System.out.println(replace[i]);
            }
            
        }
        
    }
    /**
     * @param n the size of the array we wish to create
     * @return a new int array that can contain n elements.
     */
    public int[] returnNewArraySizeN(int n){
      
       int[] newA={10,28,36,45,56};

        for(int j=0;j<5;j++){
       
        if(n==newA[j]){
          
        }
        System.out.println("" +newA[j]);
        }
    
        return newA;
    }
    public int[] returnNewArraySizeN1(int n){
      
        int[] newA={10,28};
         for(int j=0;j<2;j++){
         while(n==newA[j]){
           
         }
         System.out.println("" +newA[j]);
         }
     
         return newA;
     }
       
    }

        
        
            
            
        
    

