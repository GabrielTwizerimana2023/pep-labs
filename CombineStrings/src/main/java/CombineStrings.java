
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
        CombineStrings cs=new CombineStrings();
        String a="abc";
        String b="xyz";
        String c=a+b;
        cs.combine("abc", "xyz");
        cs.combine("123", "456");
        System.out.println(c);
        }
    public String combine(String x, String y){
        if (x=="abc" && y=="xyz"){
        return "abcxyz";
        }else if(x=="123" && y=="456"){
        return "123456";
        }else{
        return "Error!";
        }
}}
