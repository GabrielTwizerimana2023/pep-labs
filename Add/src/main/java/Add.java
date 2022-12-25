//import org.eclipse.jetty.util.Scanner;
import java.util.Scanner;

public class Add {
    /**
     * Let's say we're making a calculator app!
     *
     * Instead of returning 0, this method should return the sum of two integers (ints).
     * Ints represent whole numbers in Java.
     *
     * @param a first number to be added.
     * @param b second number to be added.
     * @return the sum of a and b.
     */
    public static void main(String [] args){
        Add y=new Add();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a");
        int a=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter number b");
        int b=sc1.nextInt();
    
        y.addNumbers(a, b);
        System.out.println("Sum of 2 intigers is "+y.addNumbers(a, b));

    }
    public int addNumbers(int a, int b){
        int sum=a+b;
        return sum;
    }
}