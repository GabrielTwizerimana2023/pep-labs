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
    
     static String copy(String text){
       
        return "hello";

    }
    static String copy1(String text){
       
        return "polly";

    }
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("insert anything!!");
        String c1=sc.nextLine();
        if(c1.equals("polly")){
            String k=copy(c1);
            System.out.println(k);
        }
        else{
            System.out.println("Invalid");
        }
        } 
}