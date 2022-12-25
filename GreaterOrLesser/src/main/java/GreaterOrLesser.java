
import java.util.Scanner;

public class GreaterOrLesser {
    /**
     * Let's say part of a calculator app has to judge whether one number is bigger than another. This problem will
     * require you to use an if/else statement.
     *
     * @param a first number to be compared.
     * @param b second number to be compared.
     * @return  If a is less than b, return the string "Lesser". if a is greater than b, return "Greater".
     *          If neither is true, return "Equal". This problem is case-sensitive!
     */
    public static void main(String [] args){
        GreaterOrLesser cs=new GreaterOrLesser();
        Scanner z=new Scanner(System.in);
        System.out.println("enter number a");
        int a=z.nextInt();
        Scanner y=new Scanner(System.in);
        System.out.println("enter number b");
        int b=z.nextInt();
        cs.decide(a, b);
        System.out.println(cs.decide(a, b));
    }
    public String decide(int a, int b){
        if(a>b){
            return "Greater";
        }
        else if(b>a){
            return "Lesser";
        }else{
        return "Equal";
    }
}}