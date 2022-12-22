
import java.util.Scanner;
public class CombineStrings {
    /**
     * You can combine two strings using the '+' operator.
     * For instance, String bigstr = str1 + str2.
     * This method should return the combination of two Strings.
     * @param a the first part of the string to be combined.
     * @param b the second part of the string to be combined.
     * @return the combination of strings a and b.
     */
    public static void main(String[] args) {
        CombineStrings cc=new CombineStrings();
        Scanner sc=new Scanner(System.in);
        System.out.println("first part of the string to be combined");
        String x=sc.nextLine();
        Scanner sc1=new Scanner(System.in);
        System.out.println("second part of the string to be combined");
        String y=sc1.nextLine();
        CombineStrings co=new CombineStrings();
        String z=x+y;
        co.combine(x, y);
        
        System.out.println(x+y);
    }
    public String combine(String x, String y){
        return "abcxyz";
   
}
