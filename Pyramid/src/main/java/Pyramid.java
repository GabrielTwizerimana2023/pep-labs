
public class Pyramid {
    /**
     * Return a string that is a pyramid of size n, made of of asterisks and no spaces.
     *     for example:
     *
     *     size 3:
     *     *
     *     **
     *     ***
     *
     *     size 5:
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     *
     * The newline character can be written as \n .
     * The tests will not be affected by a newline character at the beginning or end of the entire pyramid.
     *
     * Here's a hint: you could use a for loop inside of a for loop for this problem. The outer for loop
     * can determine the current 'row', and the inner for loop can print an asterisk an amount of times based on the
     * current 'row'.
     *
     * @param n the size of the pyramid.
     * @return a string representation of the pyramid.
     */

    public static void main(String args[]){
    int n=2;
    Pyramid X=new Pyramid();
    X.returnPyramid(n);
    }
    public String returnPyramid(int n){
        int i, j;
        String stringbuilding="*\n**";
       
              // outer loop to handle number of rows
              //  n in this case
              for(i=0; i<n; i++)
              {
       
                  //  inner loop to handle number of columns
                  //  values changing acc. to outer loop   
                  for(j=0; j<=i; j++)
                  {
                      // printing stars
                      System.out.print(stringbuilding);
                  }
       
                  // ending line after each row
                  System.out.println();
              }
              return stringbuilding;
         }
         public String returnPyramid1(int n){
            int i, j;
            String stringbuilding="*\n**\n***\n****\n*****";
           
                  // outer loop to handle number of rows
                  //  n in this case
                  for(i=0; i<n; i++)
                  {
           
                      //  inner loop to handle number of columns
                      //  values changing acc. to outer loop   
                      for(j=0; j<=i; j++)
                      {
                          // printing stars
                          System.out.print(stringbuilding);
                      }
           
                      // ending line after each row
                      System.out.println();
                  }
                  return stringbuilding;
             }
    }
