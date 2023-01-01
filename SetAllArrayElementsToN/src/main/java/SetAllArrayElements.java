import java.util.Arrays;

public class SetAllArrayElements {
    /**
     * Your task: you will recieve an array and a number, and you will have to set every element of the array to that
     * number.
     *
     * You will need to access every element of the array and change them, one by one. For this type of
     * problem, it will be best to use a for loop. To start, the general structure of such a for loop would be
     *
     * for(int i = 0; i < arr.length; i++){
     *     //code here
     * }
     *
     * Where i represents a variable that is used to visit every number between 0 and the length of arr. Inside of the
     * for loop, you will need to write code that changes the value of every index of arr to the parameter n, one by one.
     *
     * After completing the problem, I recommend using your IDE's debugger to walk through the loop
     * goes through to help you visualize the values changing, as understanding this process is critical for all future
     * coding challenges.
     *
     * @param arr an array.
     * @param n number that you will switch all numbers of arr to.
     * @return nothing, because of pass-by-reference, all changes will be reflected in the original array.
     */
    public static void main(String [] args){
        SetAllArrayElements saee=new SetAllArrayElements();
        saee.set(null, 0);
       // System.out.println( saee.set(null, 0));
    }
    public  void set(int[] arr, int n){
       arr= new int[4];
       arr[0]=0;
       arr[1]=0;
       arr[2]=0;
       arr[3]=0;
       n=1;
    for(int i=1;i<arr.length;i++){
  Arrays.fill(arr, n);
  
     }
     System.out.println(Arrays.toString(arr));
    }
}