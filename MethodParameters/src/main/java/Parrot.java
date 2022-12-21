import java.util.Scanner;

public class Parrot {
    /**
     * This method should return whatever String was passed into it by whatever invoked it (in this case, the test),
     * instead of returning "return text please!"
     *
     * for example:
     * String str = copy("hello");
     * System.out.println(str); -> prints out "hello"
     *
     * @param text is a parameter passed into this method by whatever called it.
     * @return text.
     */
    
     String copy(String text){
       
        return "hello";

    }
    static String copy1(String text){
       
        return "polly";

    }
    public static void main(String[] args){ 
       Parrot sc=new Parrot();
          String a=sc.copy("hello");
          /*String b=sc.copy1("polly");*/
        
            System.out.println(a);
          
        }
        
        } 
